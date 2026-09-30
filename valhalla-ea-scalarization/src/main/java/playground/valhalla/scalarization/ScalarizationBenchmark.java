package playground.valhalla.scalarization;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.CompilerControl;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Fork(3)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
public class ScalarizationBenchmark {

    String[] keys;
    Map<String, MutableInt> map;
    int index;

    @Setup
    public void prepare() {
        keys = new String[100];
        map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            keys[i] = "key#" + i;
            map.put(keys[i], new MutableInt(0));
        }
    }

    String nextKey() {
        index = (index + 1) % keys.length;
        return keys[index];
    }

    MutableInt mapGet() {
        return map.get(nextKey());
    }

    @Benchmark
    public MutableInt get() {
        return mapGet();
    }

    @Benchmark
    public Optional<MutableInt> getOptional() {
        return Optional.ofNullable(mapGet());
    }

    @Benchmark
    public Optional<MutableInt> getOptionalMapInplace1() {
        return Optional.ofNullable(mapGet())
            .map(MutableInt::inc);
    }

    @Benchmark
    public Optional<MutableInt> getOptionalMapInplace2() {
        return Optional.ofNullable(mapGet())
            .map(MutableInt::inc)
            .map(MutableInt::inc);
    }

    @Benchmark
    public Optional<MutableInt> getOptionalMapInplace3() {
        return Optional.ofNullable(mapGet())
            .map(MutableInt::inc)
            .map(MutableInt::inc)
            .map(MutableInt::inc);
    }

    @Benchmark
    public Optional<MutableInt> getOptionalMapOutside1() {
        return inc(Optional.ofNullable(mapGet()));
    }

    @Benchmark
    public Optional<MutableInt> getOptionalMapOutside2() {
        return inc(inc(Optional.ofNullable(mapGet())));
    }

    @Benchmark
    public Optional<MutableInt> getOptionalMapOutside3() {
        return inc(inc(inc(Optional.ofNullable(mapGet()))));
    }

    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public Optional<MutableInt> inc(Optional<MutableInt> optional) {
        return optional.map(MutableInt::inc);
    }

    public static class MutableInt {
        int value;

        MutableInt(int value) {
            this.value = value;
        }

        MutableInt inc() {
            value++;
            return this;
        }
    }

}

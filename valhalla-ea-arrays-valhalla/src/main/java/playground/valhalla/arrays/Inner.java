package playground.valhalla.arrays;

import java.util.concurrent.atomic.AtomicInteger;

public value record Inner(
    byte value
) {
    private static AtomicInteger sequence = new AtomicInteger();

    static Inner next() {
        return new Inner((byte) sequence.incrementAndGet());
    }
}

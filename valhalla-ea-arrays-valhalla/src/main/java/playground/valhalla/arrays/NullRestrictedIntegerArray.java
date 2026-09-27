package playground.valhalla.arrays;

import jdk.internal.value.ValueClass;

import java.io.IOException;
import java.util.Arrays;

public class NullRestrictedIntegerArray {

    static void main() throws IOException {
        var array = ValueClass.newNullRestrictedAtomicArray(Integer.class, 1_000_000, 0);
        for (int i = 0; i < array.length; i++) {
            // all values greater than default java.lang.Integer.IntegerCache.high
            array[i] = 128 + i;
        }
        System.in.read();
        System.out.println(Arrays.stream(array).distinct().count());
    }

}

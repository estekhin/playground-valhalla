package playground.valhalla.arrays;

import java.io.IOException;
import java.util.Arrays;

public class IntegerArray {

    static void main(String[] args) throws IOException {
        var array = new Integer[1_000_000];
        for (int i = 0; i < array.length; i++) {
            // all values greater than default java.lang.Integer.IntegerCache.high
            array[i] = 128 + i;
        }
        System.in.read();
        System.out.println(Arrays.stream(array).distinct().count());
    }

}

package playground.valhalla.fun;

public class PrimitiveWrappers {

    static void main() {
        compareIntegers(0);
        compareIntegers(100500);
    }

    static void compareIntegers(int value) {
        System.out.printf(
            "Integer.valueOf(%1$d) == Integer.valueOf(%1$d)     : %2$b%n",
            value,
            Integer.valueOf(value) == Integer.valueOf(value)
        );
        System.out.printf(
            "Integer.valueOf(%1$d).equals(Integer.valueOf(%1$d)): %2$b%n",
            value,
            Integer.valueOf(value).equals(Integer.valueOf(value))
        );
    }

}

package playground.valhalla.fun;

public class Equality {

    static void main() {
        compare(new Object(), new Object());
        compare(new EqualObject(), new EqualObject());
        var equalObject = new EqualObject();
        compare(equalObject, equalObject);
        compare(new NonEqualObject(), new NonEqualObject());
        var nonEqualObject = new NonEqualObject();
        compare(nonEqualObject, nonEqualObject);
        compare(new NonEqualValueObject(), new NonEqualValueObject());
    }

    static void compare(Object obj1, Object obj2) {
        System.out.printf("by reference: %s, by equals: %s%n",
            obj1 == obj2,
            obj1.equals(obj2)
        );
    }

    static class EqualObject {
        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }

    static class NonEqualObject {
        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }

    static value class NonEqualValueObject {
        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }

}

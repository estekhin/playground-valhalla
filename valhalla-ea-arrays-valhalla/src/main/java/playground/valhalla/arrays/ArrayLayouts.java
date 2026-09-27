package playground.valhalla.arrays;

import jdk.internal.misc.Unsafe;
import jdk.internal.value.ValueClass;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class ArrayLayouts {

    private static final Unsafe unsafe = Unsafe.getUnsafe();

    static void main() throws IOException {
        //arrayLayout(Object.class, Object[]::new, Object::new);

        //arrayLayout(Outer1.class, Outer1[]::new, () -> new Outer1(Inner.next()));
        //arrayLayout(Outer2.class, Outer2[]::new, () -> new Outer2(Inner.next(), Inner.next()));
        //arrayLayout(Outer3.class, Outer3[]::new, () -> new Outer3(Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(Outer4.class, Outer4[]::new, () -> new Outer4(Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(Outer5.class, Outer5[]::new, () -> new Outer5(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(Outer6.class, Outer6[]::new, () -> new Outer6(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(Outer7.class, Outer7[]::new, () -> new Outer7(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(Outer8.class, Outer8[]::new, () -> new Outer8(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(Outer9.class, Outer9[]::new, () -> new Outer9(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));

        //arrayLayout(ValueOuter1.class, ValueOuter1[]::new, () -> new ValueOuter1(Inner.next()));
        //arrayLayout(ValueOuter2.class, ValueOuter2[]::new, () -> new ValueOuter2(Inner.next(), Inner.next()));
        //arrayLayout(ValueOuter3.class, ValueOuter3[]::new, () -> new ValueOuter3(Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(ValueOuter4.class, ValueOuter4[]::new, () -> new ValueOuter4(Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(ValueOuter5.class, ValueOuter5[]::new, () -> new ValueOuter5(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(ValueOuter6.class, ValueOuter6[]::new, () -> new ValueOuter6(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(ValueOuter7.class, ValueOuter7[]::new, () -> new ValueOuter7(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(ValueOuter8.class, ValueOuter8[]::new, () -> new ValueOuter8(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(ValueOuter9.class, ValueOuter9[]::new, () -> new ValueOuter9(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));

        //arrayLayout(NullRestrictedOuter1.class, NullRestrictedOuter1[]::new, () -> new NullRestrictedOuter1(Inner.next()));
        //arrayLayout(NullRestrictedOuter2.class, NullRestrictedOuter2[]::new, () -> new NullRestrictedOuter2(Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedOuter3.class, NullRestrictedOuter3[]::new, () -> new NullRestrictedOuter3(Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedOuter4.class, NullRestrictedOuter4[]::new, () -> new NullRestrictedOuter4(Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedOuter5.class, NullRestrictedOuter5[]::new, () -> new NullRestrictedOuter5(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedOuter6.class, NullRestrictedOuter6[]::new, () -> new NullRestrictedOuter6(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedOuter7.class, NullRestrictedOuter7[]::new, () -> new NullRestrictedOuter7(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedOuter8.class, NullRestrictedOuter8[]::new, () -> new NullRestrictedOuter8(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedOuter9.class, NullRestrictedOuter9[]::new, () -> new NullRestrictedOuter9(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));

        //arrayLayout(NullRestrictedValueOuter1.class, NullRestrictedValueOuter1[]::new, () -> new NullRestrictedValueOuter1(Inner.next()));
        //arrayLayout(NullRestrictedValueOuter2.class, NullRestrictedValueOuter2[]::new, () -> new NullRestrictedValueOuter2(Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedValueOuter3.class, NullRestrictedValueOuter3[]::new, () -> new NullRestrictedValueOuter3(Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedValueOuter4.class, NullRestrictedValueOuter4[]::new, () -> new NullRestrictedValueOuter4(Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedValueOuter5.class, NullRestrictedValueOuter5[]::new, () -> new NullRestrictedValueOuter5(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedValueOuter6.class, NullRestrictedValueOuter6[]::new, () -> new NullRestrictedValueOuter6(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedValueOuter7.class, NullRestrictedValueOuter7[]::new, () -> new NullRestrictedValueOuter7(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedValueOuter8.class, NullRestrictedValueOuter8[]::new, () -> new NullRestrictedValueOuter8(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));
        //arrayLayout(NullRestrictedValueOuter9.class, NullRestrictedValueOuter9[]::new, () -> new NullRestrictedValueOuter9(Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next(), Inner.next()));

        //arrayLayout(Byte.class, Byte[]::new, () -> (byte) 0);
        //arrayLayout(Short.class, Short[]::new, () -> (short) 0);
        arrayLayout(Integer.class, Integer[]::new, () -> ThreadLocalRandom.current().nextInt(1000, Integer.MAX_VALUE));
        //arrayLayout(Long.class, Long[]::new, () -> ThreadLocalRandom.current().nextLong(1000L, Long.MAX_VALUE));
    }

    static <T> void arrayLayout(
        Class<T> componentType,
        IntFunction<T[]> arrayFactory,
        Supplier<T> componentFactory
    ) throws IOException {
        System.out.printf("array of %s%n", componentType);
        if (componentType.isValue()) {
            System.out.printf("layout %s, %s, %s, %s, %s%n",
                unsafe.arrayLayout(arrayFactory.apply(0)),
                unsafe.arrayLayout(ValueClass.newReferenceArray(componentType, 0)),
                unsafe.arrayLayout(ValueClass.newNullableAtomicArray(componentType, 0)),
                unsafe.arrayLayout(ValueClass.newNullRestrictedNonAtomicArray(componentType, 0, componentFactory.get())),
                unsafe.arrayLayout(ValueClass.newNullRestrictedAtomicArray(componentType, 0, componentFactory.get()))
            );
        } else {
            System.out.printf("layout %s%n",
                unsafe.arrayLayout(arrayFactory.apply(0))
            );
        }
        System.out.println();

        var array = arrayFactory.apply(1_000_000);
        for (int i = 0; i < array.length; i++) {
            array[i] = componentFactory.get();
        }
        System.in.read();
        System.out.println(Arrays.stream(array).distinct().count());
    }

}

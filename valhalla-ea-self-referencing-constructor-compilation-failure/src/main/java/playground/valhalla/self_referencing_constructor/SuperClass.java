package playground.valhalla.self_referencing_constructor;

import java.util.function.Supplier;

public abstract class SuperClass<T> {

    private final Supplier<? extends T> supplier;

    protected SuperClass(Supplier<? extends T> supplier) {
        this.supplier = supplier;
    }

}

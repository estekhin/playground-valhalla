package playground.valhalla.strict_field_initialization;

import java.util.concurrent.atomic.AtomicInteger;

public abstract value class SuperClass {

    protected static final AtomicInteger sequence = new AtomicInteger();

    private final int superValue;

    protected SuperClass() {
        this.superValue = sequence.incrementAndGet();
    }

    int getSuperValue() {
        return superValue;
    }

}

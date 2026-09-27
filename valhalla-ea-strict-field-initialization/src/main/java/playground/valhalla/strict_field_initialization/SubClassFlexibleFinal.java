package playground.valhalla.strict_field_initialization;

public final class SubClassFlexibleFinal extends SuperClass {

    private final int subValue;

    SubClassFlexibleFinal() {
        this.subValue = sequence.incrementAndGet();
        super();
    }

    int getSubValue() {
        return subValue;
    }

}

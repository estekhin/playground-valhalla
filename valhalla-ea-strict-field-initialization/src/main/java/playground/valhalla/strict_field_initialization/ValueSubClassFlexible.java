package playground.valhalla.strict_field_initialization;

public value class ValueSubClassFlexible extends SuperClass {

    private final int subValue;

    ValueSubClassFlexible() {
        this.subValue = sequence.incrementAndGet();
        super();
    }

    int getSubValue() {
        return subValue;
    }

}

package playground.valhalla.strict_field_initialization;

public value class ValueSubClassFieldInit extends SuperClass {

    private final int subValue = sequence.incrementAndGet();

    ValueSubClassFieldInit() {
        super();
    }

    int getSubValue() {
        return subValue;
    }

}

package playground.valhalla.strict_field_initialization;

public class SubClassFlexible extends SuperClass {

    private final int subValue;

    SubClassFlexible() {
        this.subValue = sequence.incrementAndGet();
        super();
    }

    int getSubValue() {
        return subValue;
    }

}

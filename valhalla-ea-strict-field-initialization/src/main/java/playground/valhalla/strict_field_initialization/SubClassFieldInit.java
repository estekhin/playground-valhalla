package playground.valhalla.strict_field_initialization;

public class SubClassFieldInit extends SuperClass {

    private final int subValue = sequence.incrementAndGet();

    SubClassFieldInit() {
        super();
    }

    int getSubValue() {
        return subValue;
    }

}

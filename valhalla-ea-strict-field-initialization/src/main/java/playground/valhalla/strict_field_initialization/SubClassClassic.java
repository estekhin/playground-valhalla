package playground.valhalla.strict_field_initialization;

public class SubClassClassic extends SuperClass {

    private final int subValue;

    SubClassClassic() {
        super();
        this.subValue = sequence.incrementAndGet();
    }

    int getSubValue() {
        return subValue;
    }

}

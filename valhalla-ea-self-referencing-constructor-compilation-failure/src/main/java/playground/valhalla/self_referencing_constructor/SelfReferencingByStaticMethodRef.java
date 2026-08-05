package playground.valhalla.self_referencing_constructor;

public class SelfReferencingByStaticMethodRef extends SuperClass<SelfReferencingByStaticMethodRef> {

    SelfReferencingByStaticMethodRef() {
        super(SelfReferencingByStaticMethodRef::staticNew);
    }

    private static SelfReferencingByStaticMethodRef staticNew() {
        return new SelfReferencingByStaticMethodRef();
    }

}

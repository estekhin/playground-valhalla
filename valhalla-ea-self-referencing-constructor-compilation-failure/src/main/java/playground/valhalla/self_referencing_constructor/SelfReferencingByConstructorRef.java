package playground.valhalla.self_referencing_constructor;

public class SelfReferencingByConstructorRef extends SuperClass<SelfReferencingByConstructorRef> {

    SelfReferencingByConstructorRef() {
        super(SelfReferencingByConstructorRef::new);
    }

}

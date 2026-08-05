package playground.valhalla.self_referencing_constructor;

public class SelfReferencingByLambda extends SuperClass<SelfReferencingByLambda> {

    SelfReferencingByLambda() {
        super(() -> new SelfReferencingByLambda());
    }

}

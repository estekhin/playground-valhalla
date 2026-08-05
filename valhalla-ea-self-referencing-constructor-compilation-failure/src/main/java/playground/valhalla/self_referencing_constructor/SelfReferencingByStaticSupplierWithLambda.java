package playground.valhalla.self_referencing_constructor;

import java.util.function.Supplier;

public class SelfReferencingByStaticSupplierWithLambda extends SuperClass<SelfReferencingByStaticSupplierWithLambda> {

    private static final Supplier<SelfReferencingByStaticSupplierWithLambda> staticSupplier = () -> new SelfReferencingByStaticSupplierWithLambda();

    SelfReferencingByStaticSupplierWithLambda() {
        super(staticSupplier);
    }

}

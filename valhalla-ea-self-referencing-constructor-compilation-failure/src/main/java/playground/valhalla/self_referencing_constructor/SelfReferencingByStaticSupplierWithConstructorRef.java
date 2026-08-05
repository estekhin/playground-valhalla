package playground.valhalla.self_referencing_constructor;

import java.util.function.Supplier;

public class SelfReferencingByStaticSupplierWithConstructorRef extends SuperClass<SelfReferencingByStaticSupplierWithConstructorRef> {

    private static final Supplier<SelfReferencingByStaticSupplierWithConstructorRef> staticSupplier = SelfReferencingByStaticSupplierWithConstructorRef::new;

    SelfReferencingByStaticSupplierWithConstructorRef() {
        super(staticSupplier);
    }

}

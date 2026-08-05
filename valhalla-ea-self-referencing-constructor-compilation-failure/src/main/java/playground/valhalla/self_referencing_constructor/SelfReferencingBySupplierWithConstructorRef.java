package playground.valhalla.self_referencing_constructor;

import java.util.function.Supplier;

public class SelfReferencingBySupplierWithConstructorRef extends SuperClass<SelfReferencingBySupplierWithConstructorRef> {

    SelfReferencingBySupplierWithConstructorRef() {
        Supplier<SelfReferencingBySupplierWithConstructorRef> supplier = SelfReferencingBySupplierWithConstructorRef::new;
        super(supplier);
    }

}

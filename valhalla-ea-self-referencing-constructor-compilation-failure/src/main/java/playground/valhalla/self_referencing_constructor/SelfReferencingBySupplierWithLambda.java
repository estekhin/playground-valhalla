package playground.valhalla.self_referencing_constructor;

import java.util.function.Supplier;

public class SelfReferencingBySupplierWithLambda extends SuperClass<SelfReferencingBySupplierWithLambda> {

    SelfReferencingBySupplierWithLambda() {
        Supplier<SelfReferencingBySupplierWithLambda> supplier = () -> new SelfReferencingBySupplierWithLambda();
        super(supplier);
    }

}

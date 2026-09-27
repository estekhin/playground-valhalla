package playground.valhalla.arrays;

import jdk.internal.vm.annotation.NullRestricted;

public value record NullRestrictedValueOuter1(
    @NullRestricted
    Inner inner1
) {
}

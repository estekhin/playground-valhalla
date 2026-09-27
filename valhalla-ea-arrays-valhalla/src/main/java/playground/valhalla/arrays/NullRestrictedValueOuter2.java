package playground.valhalla.arrays;

import jdk.internal.vm.annotation.NullRestricted;

public value record NullRestrictedValueOuter2(
    @NullRestricted
    Inner inner1,
    @NullRestricted
    Inner inner2
) {
}

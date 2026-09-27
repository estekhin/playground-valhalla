package playground.valhalla.arrays;

import jdk.internal.vm.annotation.NullRestricted;

public value record NullRestrictedValueOuter3(
    @NullRestricted
    Inner inner1,
    @NullRestricted
    Inner inner2,
    @NullRestricted
    Inner inner3
) {
}

package playground.valhalla.arrays;

import jdk.internal.vm.annotation.NullRestricted;

public value record NullRestrictedValueOuter7(
    @NullRestricted
    Inner inner1,
    @NullRestricted
    Inner inner2,
    @NullRestricted
    Inner inner3,
    @NullRestricted
    Inner inner4,
    @NullRestricted
    Inner inner5,
    @NullRestricted
    Inner inner6,
    @NullRestricted
    Inner inner7
) {
}

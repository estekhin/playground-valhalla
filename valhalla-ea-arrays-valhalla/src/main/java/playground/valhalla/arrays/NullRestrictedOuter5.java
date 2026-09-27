package playground.valhalla.arrays;

import jdk.internal.vm.annotation.NullRestricted;

public record NullRestrictedOuter5(
    @NullRestricted
    Inner inner1,
    @NullRestricted
    Inner inner2,
    @NullRestricted
    Inner inner3,
    @NullRestricted
    Inner inner4,
    @NullRestricted
    Inner inner5
) {
}

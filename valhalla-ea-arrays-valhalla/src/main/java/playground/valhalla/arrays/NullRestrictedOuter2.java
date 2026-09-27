package playground.valhalla.arrays;

import jdk.internal.vm.annotation.NullRestricted;

public record NullRestrictedOuter2(
    @NullRestricted
    Inner inner1,
    @NullRestricted
    Inner inner2
) {
}

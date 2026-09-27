package playground.valhalla.arrays;

import jdk.internal.vm.annotation.NullRestricted;

public record NullRestrictedOuter1(
    @NullRestricted
    Inner inner1
) {
}

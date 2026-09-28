package playground.valhalla.heap_flattening;

import jdk.internal.vm.annotation.NullRestricted;

public value record NullRestrictedEntityContainerId(
    @NullRestricted
    String value
) {
}

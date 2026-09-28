package playground.valhalla.heap_flattening;

import jdk.internal.vm.annotation.NullRestricted;

public value record NullRestrictedEntityId(
    @NullRestricted
    NullRestrictedEntityContainerId container,
    @NullRestricted
    String value
) {
}

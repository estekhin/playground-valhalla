package playground.valhalla.heap_flattening;

import jdk.internal.vm.annotation.NullRestricted;

import java.time.Instant;
import java.util.Optional;

public value record NullRestrictedRecordEntity(
    @NullRestricted
    NullRestrictedEntityId id,
    @NullRestricted
    Optional<String> description,
    @NullRestricted
    Instant createdAt,
    @NullRestricted
    Integer version,
    @NullRestricted
    Boolean deleted
) {
}

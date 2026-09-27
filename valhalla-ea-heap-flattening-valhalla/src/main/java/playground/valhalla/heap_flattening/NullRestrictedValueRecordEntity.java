package playground.valhalla.heap_flattening;

import jdk.internal.vm.annotation.NullRestricted;

import java.time.Instant;
import java.util.Optional;

public value record NullRestrictedValueRecordEntity(
    @NullRestricted
    ValueRecordId id,
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

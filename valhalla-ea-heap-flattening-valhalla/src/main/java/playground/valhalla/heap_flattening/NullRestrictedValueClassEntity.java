package playground.valhalla.heap_flattening;

import jdk.internal.vm.annotation.NullRestricted;

import java.time.Instant;
import java.util.Optional;

public value class NullRestrictedValueClassEntity {
    @NullRestricted
    ValueRecordId id;
    @NullRestricted
    Optional<String> description;
    @NullRestricted
    Instant createdAt;
    @NullRestricted
    Integer version;
    @NullRestricted
    Boolean deleted;

    NullRestrictedValueClassEntity(ValueRecordId id, Optional<String> description, Instant createdAt, Integer version, Boolean deleted) {
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
        this.version = version;
        this.deleted = deleted;
    }
}

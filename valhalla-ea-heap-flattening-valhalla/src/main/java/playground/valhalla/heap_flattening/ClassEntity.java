package playground.valhalla.heap_flattening;

import java.time.Instant;
import java.util.Optional;

public value class ClassEntity {
    EntityId id;
    Optional<String> description;
    Instant createdAt;
    Integer version;
    Boolean deleted;

    ClassEntity(EntityId id, Optional<String> description, Instant createdAt, Integer version, Boolean deleted) {
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
        this.version = version;
        this.deleted = deleted;
    }
}

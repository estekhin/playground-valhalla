package playground.valhalla.heap_flattening;

import java.time.Instant;
import java.util.Optional;

public final class ClassEntity {
    final EntityId id;
    final Optional<String> description;
    final Instant createdAt;
    final Integer version;
    final Boolean deleted;

    ClassEntity(EntityId id, Optional<String> description, Instant createdAt, Integer version, Boolean deleted) {
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
        this.version = version;
        this.deleted = deleted;
    }

}

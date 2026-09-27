package playground.valhalla.heap_flattening;

import java.time.Instant;
import java.util.Optional;

public final class IdentityClassEntity {
    final IdentityRecordId id;
    final Optional<String> description;
    final Instant createdAt;
    final Integer version;
    final Boolean deleted;

    //Byte xxx1;
    //Short xxx2;
    //Integer xxx3;
    //Integer xxx33;
    //Long xxx4;
    //Character xxx5;
    //Float xxx6;
    //Double xxx7;

    IdentityClassEntity(IdentityRecordId id, Optional<String> description, Instant createdAt, Integer version, Boolean deleted) {
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
        this.version = version;
        this.deleted = deleted;
    }

}

package playground.valhalla.heap_flattening;

import java.time.Instant;
import java.util.Optional;

public value record ValueRecordEntity(
    ValueRecordId id,
    Optional<String> description,
    Instant createdAt,
    Integer version,
    Boolean deleted
) {
}

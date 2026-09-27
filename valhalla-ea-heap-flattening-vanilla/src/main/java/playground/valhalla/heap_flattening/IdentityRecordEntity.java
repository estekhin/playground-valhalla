package playground.valhalla.heap_flattening;

import java.time.Instant;
import java.util.Optional;

public record IdentityRecordEntity(
    IdentityRecordId id,
    Optional<String> description,
    Instant createdAt,
    Integer version,
    Boolean deleted
) {
}

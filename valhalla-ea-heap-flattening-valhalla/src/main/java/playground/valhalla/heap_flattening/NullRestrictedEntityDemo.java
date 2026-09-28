package playground.valhalla.heap_flattening;

import java.time.Instant;
import java.util.Optional;

public class NullRestrictedEntityDemo {

    static void main(String[] args) {
        System.out.println(new NullRestrictedRecordEntity(
            new NullRestrictedEntityId(new NullRestrictedEntityContainerId("container"), "entity"),
            Optional.of("description"),
            Instant.now(),
            42,
            Boolean.FALSE
        ));
        System.out.println(new NullRestrictedClassEntity(
            new NullRestrictedEntityId(new NullRestrictedEntityContainerId("container"), "entity"),
            Optional.of("description"),
            Instant.now(),
            42,
            Boolean.FALSE
        ));
    }

}

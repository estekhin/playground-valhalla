package playground.valhalla.heap_flattening;

import java.time.Instant;
import java.util.Optional;

public class EntityDemo {

    static void main(String[] args) {
        System.out.println(new RecordEntity(
            new EntityId(new EntityContainerId("container"), "entity"),
            Optional.of("description"),
            Instant.now(),
            42,
            Boolean.FALSE
        ));
        System.out.println(new ClassEntity(
            new EntityId(new EntityContainerId("container"), "entity"),
            Optional.of("description"),
            Instant.now(),
            42,
            Boolean.FALSE
        ));
    }

}

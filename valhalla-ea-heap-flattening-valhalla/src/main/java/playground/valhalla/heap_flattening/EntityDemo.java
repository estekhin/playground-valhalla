package playground.valhalla.heap_flattening;

import java.io.IOException;
import java.time.Instant;
import java.util.Optional;

public class EntityDemo {

    static void main(String[] args) throws IOException {
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
        System.in.read();
    }

}

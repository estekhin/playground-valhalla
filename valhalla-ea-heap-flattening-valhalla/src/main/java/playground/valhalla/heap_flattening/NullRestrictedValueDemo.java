package playground.valhalla.heap_flattening;

import java.io.IOException;
import java.time.Instant;
import java.util.Optional;

public class NullRestrictedValueDemo {

    static void main(String[] args) throws IOException {
        System.out.println(new NullRestrictedValueRecordEntity(
            new ValueRecordId("container", "entity"),
            Optional.of("description"),
            Instant.now(),
            42,
            Boolean.FALSE
        ));
        System.out.println(new NullRestrictedValueClassEntity(
            new ValueRecordId("container", "entity"),
            Optional.of("description"),
            Instant.now(),
            42,
            Boolean.FALSE
        ));
    }

}

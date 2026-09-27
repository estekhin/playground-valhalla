package playground.valhalla.heap_flattening;

import java.time.Instant;
import java.util.Optional;

public class IdentityDemo {

    static void main(String[] args) {
        System.out.println(new IdentityRecordEntity(
            new IdentityRecordId("container", "entity"),
            Optional.of("description"),
            Instant.now(),
            42,
            Boolean.FALSE
        ));
        System.out.println(new IdentityClassEntity(
            new IdentityRecordId("container", "entity"),
            Optional.of("description"),
            Instant.now(),
            42,
            Boolean.FALSE
        ));
    }

}

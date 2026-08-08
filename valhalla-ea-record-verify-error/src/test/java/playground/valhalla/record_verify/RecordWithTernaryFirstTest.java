package playground.valhalla.record_verify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class RecordWithTernaryFirstTest {

    @Test
    void getDeclaredConstructors() {
        Assertions.assertNotNull(RecordWithTernaryFirst.class.getDeclaredConstructors());
    }

    @Test
    void preview() {
        var obj = new RecordWithTernaryFirst(1, 2);
        Assertions.assertTrue(Objects.hasIdentity(obj));
    }

}

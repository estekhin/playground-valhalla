package playground.valhalla.record_verify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class RecordWithTernaryLastTest {

    @Test
    void getDeclaredConstructors() {
        Assertions.assertNotNull(RecordWithTernaryLast.class.getDeclaredConstructors());
    }

    @Test
    void preview() {
        var obj = new RecordWithTernaryLast(1, 2);
        Assertions.assertTrue(Objects.hasIdentity(obj));
        Assertions.assertFalse(Objects.isValueObject(obj));
    }

}

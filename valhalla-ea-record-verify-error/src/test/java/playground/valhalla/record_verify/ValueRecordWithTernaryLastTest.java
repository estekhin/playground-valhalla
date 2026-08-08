package playground.valhalla.record_verify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class ValueRecordWithTernaryLastTest {

    @Test
    void getDeclaredConstructors() {
        Assertions.assertNotNull(ValueRecordWithTernaryLast.class.getDeclaredConstructors());
    }

    @Test
    void preview() {
        var obj = new ValueRecordWithTernaryLast(1, 2);
        Assertions.assertFalse(Objects.hasIdentity(obj));
    }

}

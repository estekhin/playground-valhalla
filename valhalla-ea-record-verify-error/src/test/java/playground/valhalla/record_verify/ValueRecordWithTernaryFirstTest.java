package playground.valhalla.record_verify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class ValueRecordWithTernaryFirstTest {

    @Test
    void getDeclaredConstructors() {
        Assertions.assertNotNull(ValueRecordWithTernaryFirst.class.getDeclaredConstructors());
    }

    @Test
    void preview() {
        var obj = new ValueRecordWithTernaryFirst(1, 2);
        Assertions.assertFalse(Objects.hasIdentity(obj));
    }

}

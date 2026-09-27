package playground.valhalla.strict_field_initialization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValueSubClassFlexibleTest extends SuperClassTest {

    @Test
    void subValueStrictness() throws Exception {
        var field = ValueSubClassFlexible.class.getDeclaredField("subValue");
        Assertions.assertTrue(field.isStrictInit());
    }

    @Test
    void sequence() {
        var value = new ValueSubClassFlexible();
        Assertions.assertEquals(2, value.getSuperValue());
        Assertions.assertEquals(1, value.getSubValue());
    }

}

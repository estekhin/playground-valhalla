package playground.valhalla.strict_field_initialization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValueSubClassFieldInitTest extends SuperClassTest {

    @Test
    void subValueStrictness() throws Exception {
        var field = ValueSubClassFieldInit.class.getDeclaredField("subValue");
        Assertions.assertTrue(field.isStrictInit());
    }

    @Test
    void sequence() {
        var value = new ValueSubClassFieldInit();
        Assertions.assertEquals(2, value.getSuperValue());
        Assertions.assertEquals(1, value.getSubValue());
    }

}

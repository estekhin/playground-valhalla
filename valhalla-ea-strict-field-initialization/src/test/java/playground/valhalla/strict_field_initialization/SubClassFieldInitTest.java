package playground.valhalla.strict_field_initialization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubClassFieldInitTest extends SuperClassTest {

    @Test
    void subValueStrictness() throws Exception {
        var field = SubClassFieldInit.class.getDeclaredField("subValue");
        Assertions.assertFalse(field.isStrictInit());
    }

    @Test
    void sequence() {
        var value = new SubClassFieldInit();
        Assertions.assertEquals(1, value.getSuperValue());
        Assertions.assertEquals(2, value.getSubValue());
    }

}

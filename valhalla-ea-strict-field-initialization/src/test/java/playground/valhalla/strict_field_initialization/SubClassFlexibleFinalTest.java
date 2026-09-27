package playground.valhalla.strict_field_initialization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubClassFlexibleFinalTest extends SuperClassTest {

    @Test
    void subValueStrictness() throws Exception {
        var field = SubClassFlexibleFinal.class.getDeclaredField("subValue");
        Assertions.assertFalse(field.isStrictInit());
    }

    @Test
    void sequence() {
        var value = new SubClassFlexibleFinal();
        Assertions.assertEquals(2, value.getSuperValue());
        Assertions.assertEquals(1, value.getSubValue());
    }

}

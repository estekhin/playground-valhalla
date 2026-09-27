package playground.valhalla.strict_field_initialization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubClassFlexibleTest extends SuperClassTest {

    @Test
    void subValueStrictness() throws Exception {
        var field = SubClassFlexible.class.getDeclaredField("subValue");
        Assertions.assertFalse(field.isStrictInit());
    }

    @Test
    void sequence() {
        var value = new SubClassFlexible();
        Assertions.assertEquals(2, value.getSuperValue());
        Assertions.assertEquals(1, value.getSubValue());
    }

}

package playground.valhalla.strict_field_initialization;

import org.junit.jupiter.api.BeforeAll;

abstract class SuperClassTest {

    @BeforeAll
    static void reset() {
        SuperClass.sequence.set(0);
    }

}

package playground.valhalla.fun;

import org.mockito.Mockito;

public class MockRecords {

    static void main() {
        var mock = Mockito.mock(IdentityRecord.class);
        Mockito.doReturn(42).when(mock).question();
        System.out.println(mock.question());
    }

    record IdentityRecord(
        int question
    ) {}

}

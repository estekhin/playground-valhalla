package playground.valhalla.record_verify;

public value record ValueRecordWithTernaryFirst(
    int value1,
    int value2
) {
    public ValueRecordWithTernaryFirst(
        int value1,
        int value2
    ) {
        this.value1 = value1 > 0 ? 1 : 0;
        this.value2 = value2;
    }
}

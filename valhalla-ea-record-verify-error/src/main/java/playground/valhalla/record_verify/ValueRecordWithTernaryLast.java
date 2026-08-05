package playground.valhalla.record_verify;

public value record ValueRecordWithTernaryLast(
    int value1,
    int value2
) {
    public ValueRecordWithTernaryLast(
        int value1,
        int value2
    ) {
        this.value1 = value1;
        this.value2 = value2 > 0 ? 1 : 0;
    }
}

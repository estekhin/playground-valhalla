package playground.valhalla.record_verify;

public record RecordWithTernaryLast(
    int value1,
    int value2
) {
    public RecordWithTernaryLast(
        int value1,
        int value2
    ) {
        this.value1 = value1;
        this.value2 = value2 > 0 ? 1 : 0;
    }
}

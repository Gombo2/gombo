package org.example.memberservice.domain;

public enum Status {
    ACTIVE((byte) 0),
    SUSPENDED((byte) 1),
    WITHDRAWN((byte) 2);

    private final byte value;

    //final byte 초기화 생성자 (우린 사용 못해요)
    Status(byte value) {
        this.value = (byte) value;
    }

    public byte getValue() {
        return value;
    }

    // byte to Enum
    public static Status fromValue(byte value) {
        for (Status status : Status.values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("유효하지 않은 Status 값: " + value);
    }
}

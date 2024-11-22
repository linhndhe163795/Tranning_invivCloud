public enum EmployeeTypeEnum {

    BA(1), BE(2), FE(3), TESTER(4);
    private int value;

    EmployeeTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

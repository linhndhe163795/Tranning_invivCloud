package manage;

public enum Enums {
    MIN(1), MAX(11);
    private int values;
    Enums(int values) {
        this.values = values;
    }

    public int getValues() {
        return values;
    }
}

public enum Priority {

    MIN(1), NORM(5), MAX(10);

    private int value;

    Priority(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

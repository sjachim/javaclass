public class Value {
    protected int value;

    public Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isPositive() {
        return this.value > 0;
    }

    public int compare(int value) {
        if (value < this.value) {
            return -1;
        } else if (value == this.value) {
            return 0;
        } else {
            return 1;
        }
    }

    public int add(int value) {
        return this.value + value;
    }

    public Value newValue() {
        return new Value(this.getValue());
    }
}

// vim: tabstop=4 expandtab shiftwidth=4

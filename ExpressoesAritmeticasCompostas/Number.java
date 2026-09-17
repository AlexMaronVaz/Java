public class Number extends Expression {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return this.value;
    }

    @Override
    public String toString() {
        if (this.value == (long) this.value) {
            return String.valueOf((long) this.value);
        }
        return String.valueOf(this.value);
    }
}

import java.util.ArrayList;

public class Subtraction extends Expression {
    private ArrayList<Expression> expressions = new ArrayList<Expression>();

    public Subtraction(Expression minuend, Expression subtrahend) {
        this.expressions.add(minuend);
        this.expressions.add(subtrahend);
    }

    public ArrayList<Expression> getExpressions() {
        return this.expressions;
    }

    @Override
    public double evaluate() {
        return expressions.get(0).evaluate() - expressions.get(1).evaluate();
    }

    @Override
    public String toString() {
        return "(" + expressions.get(0).toString() + " - " + expressions.get(1).toString() + ")";
    }
}

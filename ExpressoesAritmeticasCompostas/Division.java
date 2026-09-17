import java.util.ArrayList;

public class Division extends Expression {
    private ArrayList<Expression> expressions = new ArrayList<Expression>();

    public Division(Expression dividend, Expression divisor) {
        this.expressions.add(dividend);
        this.expressions.add(divisor);
    }

    public ArrayList<Expression> getExpressions() {
        return this.expressions;
    }

    @Override
    public double evaluate() {
        double divisorVal = expressions.get(1).evaluate();
        if (divisorVal == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return expressions.get(0).evaluate() / divisorVal;
    }

    @Override
    public String toString() {
        return "(" + expressions.get(0).toString() + " / " + expressions.get(1).toString() + ")";
    }
}

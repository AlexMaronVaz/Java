import java.util.ArrayList;

public class Sum extends Expression {
    private ArrayList<Expression> expressions = new ArrayList<Expression>();

    public Sum(Expression e1, Expression e2) {
        this.expressions.add(e1);
        this.expressions.add(e2);
    }


    public void addExpression(Expression e) {
        this.expressions.add(e);
    }

    public ArrayList<Expression> getExpressions() {
        return this.expressions;
    }

    @Override
    public double evaluate() {
        double total = 0;
        for (int i = 0; i < expressions.size(); i++) {
            total += expressions.get(i).evaluate();
        }
        return total;
    }

    @Override
    public String toString() {
        String texto = "(";
        for (int i = 0; i < expressions.size(); i++) {
            texto += expressions.get(i).toString();
            if (i < expressions.size() - 1) {
                texto += " + ";
            }
        }
        texto += ")";
        return texto;
    }
}

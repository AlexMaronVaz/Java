public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      TESTE DE EXPRESSOES ARITMETICAS COMPOSTAS   ");
        System.out.println("==================================================\n");

        Expression exp1 = new Multiplication(
            new Sum(new Number(10), new Number(20)),
            new Subtraction(new Number(50), new Number(5))
        );

        Sum exp2 = new Sum(new Number(10), new Number(20));
        exp2.addExpression(new Number(30));

        Expression exp3 = new Multiplication(
            new Sum(new Number(10), new Number(20)),
            new Number(5)
        );

        Expression exp4 = new Division(
            new Subtraction(new Number(100), new Number(20)),
            new Sum(new Number(5), new Number(3))
        );

        Expression exp5 = new Subtraction(
            new Multiplication(
                new Sum(new Number(10), new Number(20)),
                new Number(5)
            ),
            new Sum(
                new Division(new Number(100), new Number(4)),
                new Number(7)
            )
        );

        imprimirResultado("Teste 1", exp1);
        imprimirResultado("Teste 2", exp2);
        imprimirResultado("Teste 3", exp3);
        imprimirResultado("Teste 4", exp4);
        imprimirResultado("Teste 5 (Complexa)", exp5);
    }

    private static void imprimirResultado(String nome, Expression exp) {
        System.out.println(nome + ": " + exp.toString() + " = " + exp.evaluate());
    }
}

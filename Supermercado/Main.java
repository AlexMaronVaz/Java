import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Produto> produtosDisponiveis = new ArrayList<>();
        produtosDisponiveis.add(new Produto(Descricao.ARROZ, 25.0, 100));
        produtosDisponiveis.add(new Produto(Descricao.FEIJAO, 8.5, 50));
        produtosDisponiveis.add(new Produto(Descricao.FARINHA, 5.0, 80));
        produtosDisponiveis.add(new Produto(Descricao.LEITE, 4.5, 100));
        produtosDisponiveis.add(new Produto(Descricao.ACUCAR, 3.0, 100));
        produtosDisponiveis.add(new Produto(Descricao.CAFE, 16.0, 100));
        produtosDisponiveis.add(new Produto(Descricao.REFRIGERANTE, 10.0, 100));

        Pedido pedidoAtual = null;
        int opcao;

        do {
            System.out.println("\n---------------------------------");
            System.out.println("        MENU SUPERMERCADO        ");
            System.out.println("---------------------------------");
            System.out.println("1) Novo pedido");
            System.out.println("2) Realizar pagamento");
            System.out.println("0) Sair");
            System.out.println("---------------------------------");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("\n--- CADASTRO DE CLIENTE ---");
                System.out.print("Nome do cliente: ");
                String nome = sc.nextLine();
                System.out.print("CPF do cliente: ");
                String cpf = sc.nextLine();

                Cliente cliente = new Cliente(nome, cpf);
                pedidoAtual = new Pedido(cliente);

                System.out.println("\n--- PRODUTOS DISPONIVEIS ---");
                System.out.println("ARROZ          - R$ 25.0");
                System.out.println("FEIJAO         - R$ 8.5");
                System.out.println("FARINHA        - R$ 5.0");
                System.out.println("LEITE          - R$ 4.5");
                System.out.println("ACUCAR         - R$ 3.0");
                System.out.println("CAFE           - R$ 16.0");
                System.out.println("REFRIGERANTE   - R$ 10.0");
                System.out.println("----------------------------");

                String continuar = "";

                do {
                    System.out.print("\nQual produto? ");
                    String descStr = sc.nextLine().toUpperCase();
                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();
                    sc.nextLine();

                    try {
                        Descricao desc = Descricao.valueOf(descStr);
                        Produto prod = null;
                        for (Produto p : produtosDisponiveis) {
                            if (p.getDescricao() == desc) prod = p;
                        }
                        if (prod != null) {
                            pedidoAtual.adicionarItem(new Item(prod, qtd));
                            System.out.println("-> Item adicionado com sucesso!");
                        }
                    } catch (Exception e) {
                        System.out.println("-> Produto invalido!");
                    }

                    System.out.print("Adicionar outro item? (s/n): ");
                    continuar = sc.nextLine();
                } while (continuar.equalsIgnoreCase("s"));

            } else if (opcao == 2) {
                if (pedidoAtual == null || pedidoAtual.getItens().isEmpty()) {
                    System.out.println("\n-> Nenhum pedido criado ainda!");
                } else {
                    System.out.println("\n---------------------------------");
                    System.out.println("        RESUMO DO PEDIDO         ");
                    System.out.println("---------------------------------");
                    System.out.println("Cliente: " + pedidoAtual.getCliente().getNome());
                    System.out.println("CPF: " + pedidoAtual.getCliente().getCPF());

                    System.out.println("\nItens do carrinho:");
                    for (Item i : pedidoAtual.getItens()) {
                        System.out.println("- " + i.getProduto().getDescricao() + " | Qtd: " + i.getQuantidade() + " | Subtotal: R$ " + i.getSubtotal());
                    }

                    System.out.println("---------------------------------");
                    System.out.println("TOTAL A PAGAR: R$ " + pedidoAtual.calcularTotal());
                    System.out.println("---------------------------------");

                    System.out.print("Forma de pagamento (DINHEIRO, CHEQUE, CARTAO): ");
                    String pagStr = sc.nextLine().toUpperCase();

                    try {
                        TipoPagamento pag = TipoPagamento.valueOf(pagStr);
                        pedidoAtual.setPagamento(pag);
                        System.out.println("\n-> Pagamento com " + pag + " realizado com sucesso!");
                        pedidoAtual = null;
                    } catch (Exception e) {
                        System.out.println("\n-> Tipo de pagamento invalido!");
                    }
                }
            }

        } while (opcao != 0);

        System.out.println("\nSaindo do sistema...");
        sc.close();
    }
}

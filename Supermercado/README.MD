# Sistema de Supermercado em Java

Este projeto é uma aplicação em linha de comando (CLI) para gerenciamento de vendas e pedidos em um supermercado, desenvolvida para a disciplina de **Algoritmos e Classificação de Dados**.

## Funcionalidades

* **Cadastro de Clientes e Pedidos:** Associa o nome e CPF do cliente a um novo pedido.
* **Carrinho de Compras:** Permite selecionar produtos e definir a quantidade desejada de cada item.
* **Catálogo Fixado:** Utiliza enumerações para validar os produtos disponíveis (`ARROZ`, `FEIJAO`, `FARINHA`, `LEITE`, `ACUCAR`, `CAFE`, `REFRIGERANTE`).
* **Cálculo de Totais:** Calcula os subtotais por item e exibe a soma total da compra.
* **Fechamento e Pagamento:** Exibe o resumo do pedido e valida formas de pagamento (`DINHEIRO`, `CHEQUE`, `CARTAO`).

## Conceitos Aplicados

* **Orientação a Objetos:** Modelagem de entidades (`Cliente`, `Produto`, `Item`, `Pedido`).
* **Estruturas de Dados:** Uso de listas dinâmicas (`ArrayList`) para gerenciar itens no carrinho.
* **Tipos Enumerados (`Enum`):** Padronização e restrição de tipos de dados para produtos e pagamentos.
* **Fluxo de Controle:** Tratamento de menus interativos com laços de repetição e captura de dados via terminal (`Scanner`).

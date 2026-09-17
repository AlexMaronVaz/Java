# Expressões Aritméticas Compostas — Orientação a Objetos em Java

**Disciplina:** Algoritmos e Classificação de Dados  
**Linguagem:** Java  

---

## 📌 Descrição do Projeto

Este projeto consiste na modelagem e implementação de uma estrutura de dados hierárquica baseada em **Orientação a Objetos (OO)** para representar e calcular expressões aritméticas compostas. 

Em vez de avaliar expressões como simples cadeias de texto (strings), a solução constrói uma **árvore de objetos** onde números e operações aritméticas interagem de forma recursiva por meio do padrão estrutural de composição.

Exemplo de estrutura hierárquica para a expressão (10 + 20) * (50 - 5):

Multiplication
├── Sum
│   ├── Number(10)
│   └── Number(20)
└── Subtraction
    ├── Number(50)
    └── Number(5)

---

## 🛠️ Conceitos Aplicados

* **Classes Abstratas e Métodos Abstratos:** A classe ancestral `Expression` define a assinatura do método `public abstract double evaluate()`, forçando todas as subclasses a fornecerem sua própria implementação de cálculo.
* **Herança:** As subclasses operacionais (`Sum`, `Subtraction`, `Multiplication`, `Division`) e de valor (`Number`) herdam de `Expression`.
* **Polimorfismo:** O uso de listas `ArrayList<Expression>` permite que operações armazenem indistintamente números simples ou outras subexpressões complexas, invocando `.evaluate()` sem necessidade de checagem explícita de tipos.
* **Composição Recursiva:** Operações podem conter outras operações, permitindo a construção de expressões aritméticas com múltiplos níveis de aninhamento.
* **Sobrescrita do toString():** Formatação in-fixa e automática das expressões com parênteses, facilitando a exibição visual da equação completa no terminal.

---

## 🗂️ Estrutura das Classes

| Classe | Tipo | Descrição |
| :--- | :--- | :--- |
| Expression | Abstrata | Classe base que define a interface comum para avaliação de expressões. |
| Number | Concreta | Representa um operando real (double). |
| Sum | Concreta | Mantém um ArrayList<Expression> para somar 2 ou mais expressões. |
| Subtraction | Concreta | Mantém um ArrayList<Expression> com 2 operandos (minuendo e subtraendo). |
| Multiplication | Concreta | Mantém um ArrayList<Expression> para multiplicar 2 ou mais expressões. |
| Division | Concreta | Mantém um ArrayList<Expression> com 2 operandos (dividendo e divisor). |
| Main | Executável | Programa de teste que constrói e avalia diferentes cenários de expressões. |

---

## 🚀 Como Executar

### Pré-requisitos
* **JDK 8** ou superior instalado.

### Passos no Terminal

1. Clonar o repositório:
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio

2. Compilar os arquivos Java:
   javac *.java

3. Executar a classe principal:
   java Main

---

## 📊 Exemplos de Saída no Console

==================================================
      TESTE DE EXPRESSOES ARITMETICAS COMPOSTAS   
==================================================

Teste 1: ((10 + 20) * (50 - 5)) = 1350.0
Teste 2: (10 + 20 + 30) = 60.0
Teste 3: ((10 + 20) * 5) = 150.0
Teste 4: ((100 - 20) / (5 + 3)) = 10.0
Teste 5 (Complexa): (((10 + 20) * 5) - ((100 / 4) + 7)) = 118.0

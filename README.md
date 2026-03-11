# Teste Java - Objective

## Descrição

Este projeto é um teste via live-coding da **Objective C** como parte do processo seletivo
para desenvolvedores Java.
O projeto implementa o clássico problema FizzBuzz utilizando princípios de programação orientada a
objetos e o padrão Chain of Responsibility.

## Requisitos

O programa deve implementar a seguinte lógica:

- Receber uma sequência de valores de 1 a 30;
- Se o número é múltiplo de 3, imprime "Fizz";
- Se o número é múltiplo de 5, imprime "Buzz";
- Caso contrário, imprime o próprio número da entrada;
- A saída deverá ser semelhante à lista abaixo:

```
Imprime: 1
Imprime: 2
Imprime: Fizz
Imprime: 4
Imprime: Buzz
.
.
.
Imprime: 29
Imprime: FizzBuzz
```

## Solução

### Estrutura do Projeto

O projeto foi desenvolvido utilizando a versão Java 25 e contém as seguintes classes principais:

- *
  *[Printable](cci:2://file:///home/emeyer/workspace/teste-objective/src/main/java/br/com/objective/Printable.java:2:0-6:1)
  **: Interface base que define o contrato para impressão de valores
- *
  *[ChainPrintable](cci:2://file:///home/emeyer/workspace/teste-objective/src/main/java/br/com/objective/ChainPrintable.java:2:0-14:1)
  **: Classe abstrata que implementa o padrão Chain of Responsibility
- *
  *[MultiploAbstractChecker](cci:2://file:///home/emeyer/workspace/teste-objective/src/main/java/br/com/objective/MultiploAbstractChecker.java:2:0-15:1)
  **: Classe abstrata que encapsula a lógica de verificação de múltiplos

### Implementações Específicas

- *
  *[MultiploCheckerThree](cci:2://file:///home/emeyer/workspace/teste-objective/src/main/java/br/com/objective/MultiploCheckerThree.java:2:0-12:1)
  **: Verifica se um número é múltiplo de 3 e retorna "Fizz"
- *
  *[MultiploCheckerFive](cci:2://file:///home/emeyer/workspace/teste-objective/src/main/java/br/com/objective/MultiploCheckerFive.java:2:0-12:1)
  **: Verifica se um número é múltiplo de 5 e retorna "Buzz"
- *
  *[PrintMultiploThree](cci:2://file:///home/emeyer/workspace/teste-objective/src/main/java/br/com/objective/PrintMultiploThree.java:4:0-27:1)
  **: Handler para múltiplos de 3
- *
  *[PrintMultiploFive](cci:2://file:///home/emeyer/workspace/teste-objective/src/main/java/br/com/objective/PrintMultiploFive.java:4:0-27:1)
  **: Handler para múltiplos de 5
- *
  *[PrintNoMultiplo](cci:2://file:///home/emeyer/workspace/teste-objective/src/main/java/br/com/objective/PrintNoMultiplo.java:2:0-23:1)
  **: Handler para números que não são múltiplos de 3 ou 5

### Ponto de Entrada

- *
  *[Main](cci:2://file:///home/emeyer/workspace/teste-objective/src/main/java/br/com/objective/Main.java:2:0-15:1)
  **: Classe principal que executa o teste de 1 a 30

## Abordagem Orientada a Objetos

A solução foi projetada com foco nos seguintes princípios:

1. **Encapsulamento**: A lógica de verificação de múltiplos está encapsulada nas classes
   `MultiploChecker`
2. **Herança**: Classes específicas herdam
   de [MultiploAbstractChecker](cci:2://file:///home/emeyer/workspace/teste-objective/src/main/java/br/com/objective/MultiploAbstractChecker.java:2:0-15:1)
3. **Polimorfismo**: Cada checker implementa seu próprio
   método [output()](cci:1://file:///home/emeyer/workspace/teste-objective/src/main/java/br/com/objective/MultiploCheckerFive.java:8:1-11:2)
4. **Padrão Chain of Responsibility**: Permite adicionar novos handlers sem modificar o código
   existente

## Como Executar

```bash
javac src/main/java/br/com/objective/*.java
java -cp src/main/java br.com.objective.Main
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

- **Printable**: Interface base que define o contrato para impressão de valores
- **ChainPrintable**: Classe abstrata que implementa o padrão Chain of Responsibility
- **MultiploAbstractChecker**: Classe abstrata que encapsula a lógica de verificação de múltiplos

### Implementações Específicas

- **MultiploCheckerThree**: Verifica se um número é múltiplo de 3 e retorna "Fizz"
- **MultiploCheckerFive**: Verifica se um número é múltiplo de 5 e retorna "Buzz"
- **PrintMultiploThree**: Handler para múltiplos de 3
- **PrintMultiploFive**: Handler para múltiplos de 5
- **PrintNoMultiplo**: Handler para números que não são múltiplos de 3 ou 5

### Ponto de Entrada

- **Main**:
  Classe principal que executa o teste de 1 a 30

## Abordagem Orientada a Objetos

A solução foi projetada com foco nos seguintes princípios:

1. **Encapsulamento**: A lógica de verificação de múltiplos está encapsulada nas classes
   `MultiploChecker`
2. **Herança**: Classes específicas herdam
   de `MultiploAbstractChecker`
3. **Polimorfismo**: Cada checker implementa seu próprio
   método `output()`
4. **Padrão Chain of Responsibility**: Permite adicionar novos handlers sem modificar o código
   existente

## Como Executar

```bash
javac src/main/java/br/com/objective/*.java
java -cp src/main/java br.com.objective.Main
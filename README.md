
# Conversor de Moedas

O Conversor de Moedas é um programa Java que permite aos usuários converter entre diferentes moedas utilizando uma API de taxa de câmbio em tempo real.

## Funcionalidades

- Escolha da Moeda: O usuário pode escolher a moeda de origem e a moeda de destino a partir de uma lista de opções.
- Inserção do Valor: O usuário pode inserir o valor que deseja converter.
- Conversão em Tempo Real: Utiliza uma API de taxa de câmbio para obter a taxa de conversão atual entre as moedas selecionadas.
- Exibição do Resultado: Após a conversão, exibe o valor convertido na moeda de destino.
- Tratamento de Erros: Possui tratamento de erros para lidar com valores inválidos ou caracteres não numéricos inseridos pelo usuário.

## Como Usar

1. Clone o repositório para sua máquina local.
2. Compile e execute o programa Java.
3. Escolha as moedas de origem e destino.
4. Insira o valor a ser convertido.
5. Visualize o resultado da conversão.

## Exemplo de Uso

```java
// Exemplo de conversão de Dólar Americano para Real Brasileiro
ConversorMoedas conversorMoedas = new ConversorMoedas();
String resultado = conversorMoedas.converterMoeda("USD", "BRL", 100.00);
System.out.println(resultado);
```

## Pré-requisitos

- Java Development Kit (JDK) instalado
- Conexão com a Internet para acessar a API de taxa de câmbio




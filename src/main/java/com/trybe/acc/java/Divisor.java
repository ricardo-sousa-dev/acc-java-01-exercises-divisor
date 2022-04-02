package com.trybe.acc.java;

// Escreva uma classe que possua um método que consiga dividir dois números inteiros. Você deverá
// chamar a classe de Divisor, e o método, de dividir, que receberá dois argumentos do tipo int e
// também deverá retornar um int.

// Dentro desse método, você deverá fazer o tratamento do erro ArithmeticException, garantindo que
// se, por exemplo, forem passados os números 2 e 0, o método consiga ser executado com sucesso e,
// em caso de erro, ele retorne o número 0.
public class Divisor {
  public int dividir(int a, int b) {
    try {
      return a / b;
    } catch (ArithmeticException e) {
      return 0;
    }
  }
}

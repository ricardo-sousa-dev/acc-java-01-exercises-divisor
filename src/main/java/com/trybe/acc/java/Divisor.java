package com.trybe.acc.java;

/** class Divisor. */
public class Divisor {
  /** constructor */
  public int dividir(int a, int b) {
    try {
      return a / b;
    } catch (ArithmeticException e) {
      return 0;
    }
  }
}

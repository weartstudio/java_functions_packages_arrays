package elte.fsz.java;
// Write a function (fibonacci) that accepts an integer parameter called n, and returns its Fibonacci value non-recursively. Fibonacci.java

public class Fibonacci {

  public static int fibonacci(int n){
    int a = 1;
    int b = 1;
    int result = 0;

    for(int i = 1; i <= n; i++ ){
      a = b;
      b = result;
      result = a + b;
    }

    return result;
  }

}
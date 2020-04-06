package elte.fsz.java;
// Write a function (fibonacci) that accepts an integer parameter called n, and returns its Fibonacci value calculated recursively. FibonacciRec.java

public class FibonacciRec {

  public static int fibonacci(int n){
    
    if( n==0 || n==1 ){
      return n; // n0 => return 0; n1 => return 1;
    }else{
      return fibonacci(n-1) + fibonacci(n-2);
    }

  }

}
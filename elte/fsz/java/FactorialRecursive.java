package elte.fsz.java;
// Write a function (factorial) that accepts an integer parameter called n, and returns its factorial recursively. FactorialRecursive.java

public class FactorialRecursive {

  public static int factorial(int n) {
    if (n == 0){
      return 1;
    }else{ 
      return(n * factorial(n-1));
    } 
  }

}
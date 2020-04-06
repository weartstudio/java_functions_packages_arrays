package elte.fsz.java;
// Write a function (collatz) that accepts an integer parameter called n, and prints out the Collatz-series of n until the element in the series is 1. Collatz.java

public class Collatz {

  public static String collatz(int n) {
    String result = "";

    while(n > 1){
      // add the number to sequence
        result += n +", "; 
      
      if(n % 2 == 0 ){
        // if even
        n /= 2;
      }else{
        // if odd
        n = (n * 3) + 1;
      }
      
    }

    // add 1 to the end of sequence
      result += 1;     

    // return result
      return result;
  }

}
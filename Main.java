import elte.fsz.java.*;
public class Main{
  // Entry point
  public static void main(String[] args) {
		
    // 1. Factorial.java
      System.out.println( "1. factorial(5) = " + Factorial.factorial(5) + " // exp. 120" );
		
    // 2. FactorialRecursive.java
      System.out.println( "2. factorial(5) = " + FactorialRecursive.factorial(5) + " // exp. 120, recursive" );
      
    // 3. Fibonacci.java
      System.out.println( "3. fibonacci(8) = " + Fibonacci.fibonacci(8) + " // exp. 21" );
      
    // 4. FibonacciRec.java
      System.out.println( "4. fibonacci(8) = " + FibonacciRec.fibonacci(8) + " // exp. 21, recursive" );
      
    // 5. Collatz.java
      System.out.println( "5. collatz(8) = " + Collatz.collatz(8) + " // exp. 8, 4, 2, 1" );
      
    // 6. Max.java
      System.out.println( "6. max(8, 9) = " + Max.max(8, 9) + " // exp. 9" );
      
    // 7. FindMax.java
      System.out.println( "7. findMax(new int[]{2, 4, 9, 7, 34, 64, 5}) = " + FindMax.findMax(new int[]{2, 4, 9, 7, 34, 64, 5}) + " // exp. 64" );

  }
}
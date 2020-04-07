import elte.fsz.java.*;
public class Main{
  // Entry point
  public static void main(String[] args) {

    // readability assistant variables => long Strings
      String longString = "";
		
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
      longString = "7. findMax(new int[]) = ";
      longString += FindMax.findMax(new int[]{2, 4, 9, 7, 34, 64, 5});
      longString += " // exp. 64";
      System.out.println( longString );
      
    // 8. ArraySort.java
      longString = "8. sort(new int[]) = ";
      longString += ArraySort.sort(new int[]{2, 4, 9, 7, 34, 64, 5});
      longString += " // exp. 2, 4, 5, 7, 8, 9, 34, 64";
      System.out.println( longString );

    // 9. ArrayMerge.java
      longString = "9. merge(int[],int[]) = ";
      int[] a9 = {2, 4, 9};
      int[] b9 = {3, 5, 6};
      int[] merge = ArrayMerge.merge(a9,b9);
      for (int i : merge) { longString += i +", "; }
      longString += "// exp. 2, 4, 9, 3, 5, 6";
      System.out.println(longString);

    // 10. Palindrom.java
      System.out.println("10. isPalindrom('kerek') = " + Palindrom.isPalindrom("kerek") +" // exp. true");

    // 11. Concat.java
      longString = "11.1 simpleConcat('-','b','c') = ";
      longString += Concat.simpleConcat("-", "b", "c");
      longString += "// exp. 'b-c'";
      System.out.println(longString);

      longString = "11.2 stringBuilderConcat('-','b','c') = ";
      longString += Concat.simpleConcat("-", "b", "c");
      longString += "// exp. 'b-c'";
      System.out.println(longString);

      longString = "11.3 simpleConcat('-','b','c') = ";
      longString += Concat.varargsConcat("-", "b", "c");
      longString += "// exp. '-bc'";
      System.out.println(longString);

    // 12. ScalarMultiplication.java
      int[] a12 = {1,2,3,4};
      int[] b12 = {5,6,7,8};
      System.out.println("12. scalar(int[3], int[3]) = " + ScalarMultiplication.scalar(a12,b12) +" // exp. 70");

    // 13. XorCipher.java
      char[] a13 = { 'a', 'b', 'c', 'd', 'a', 'g', 'e', 'a' };
      System.out.println("13.1 cipher(char[]) = " + XorCipher.cipher(a13) +" // exp. '^bcd^ge^'");
      System.out.println("13.2 decipher(char[]) = " + XorCipher.decipher(a13) +" // exp. 'abcdagea'");

    // 14. LongestMonotonic.java
      int[] a14 = new int[]{1,2,9,4,7,3,11,8,14,6};
      a14 = LongestMonotonic.longestMonotonic(a14);
      longString = ""; // make it empty
      for (int i : a14) { if(i!=0) longString += i +", "; } //make a humanString
      System.out.println("14. longestMonotonic(int[]) = " + longString +" // exp. '1, 2, 9, 11'");

    // 15. MatrixSum.java
      int[][] a15 = {{0,1,2},{1,2,3},{2,3,4}};
      int[][] b15 = {{0,1,-2},{1,-2,3},{2,-3,-4}};
      System.out.println("15.1 sum(int[[][][]]) = "+ MatrixSum.sum(a15) +"// exp. 3,6,9 ; 3,6,9 ; 6");
      System.out.println("15.2 sum(int[[][][]]) = "+ MatrixSum.sum(b15) +"// exp. -1,2,-5 ; 3,-4,-3 ; -6");

    // 16. Validator.java
      System.out.println("16. validate(String), Password is valid? 'Password1!' = "+Validator.validate("Password1!") +" // false 'cause '!'");

    // 17. Euclidean.java
      System.out.println("17.1 euclideanGCD(int,int) = "+ Euclidean.euclideanGCD(360, 225) +" // exp. 45");
      System.out.println("17.2 euclideanGCDRec(int,int) = "+ Euclidean.euclideanGCDRec(360, 225)  +" // exp. 45, recursive");

    // 18. QuadraticEquation.java
      longString = "18. sqroots(double,double,double) = ";
      double[] r = QuadraticEquation.sqroots(7, 49, 23);
      longString += (r[1]!=0)? "x1 = "+r[0] : "x1 = "+r[0]+"x1 = "+r[0];
      longString += " // exp. a double x1 and/or x2";
      System.out.println(longString);

    // 19. Capitalize.java
      System.out.println("19. capitalize(String[] from console) = "+ Capitalize.capitalize(args) +" // exp. Capitalize 1st letter");

    // 20. CharacterChanger.java
      System.out.println("20. change(String) = "+ CharacterChanger.change("Adria 2020!!") +" // exp. 'Adria 2020!!' => 'adria_2020__'");

    // 21. StringStartsWith.java
      System.out.println("20. startsWith(String,String) = "+ StringStartsWith.startsWith("Buda","BudaPest") +" // exp. true ");

  }
}
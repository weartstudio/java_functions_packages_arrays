package elte.fsz.java;
// Write a function (euclideanGCD) that implements the euclidean greatest common divisor. The pseudo-code of the algorithm is as follows: Euclidean.java. Implement the recursive approach (euclideanGCDRecursive) as well.

public class Euclidean {

  public static int euclideanGCD(int a, int b){
    if( a == 0 )
      return b;
    while (b != 0){
      if ( a > b )
        a = a-b;
      else
        b = b-a;
    }
    return a;
  }

  public static int euclideanGCDRec(int a, int b){
    if ( a == 0 )
      return b;
    else
      return euclideanGCDRec ( b%a, a );
  }

}
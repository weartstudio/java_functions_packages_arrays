package elte.fsz.java;
/*  Write a function (sqroots) that returns the squar roots of quadratic equation. The specification of the function should be: QuadraticEquation.java
*/

public class QuadraticEquation {

  public static double[] sqroots(final double a, final double b, final double c) {
    double[] result = new double[2];
    // discriminant
    double d = b * b - 4 * a * c;

    // only => discriminant != negative && a != 0
    if ( d >= 0 || a != 0 ){  
      // solution numbers?
      if( d==0 ){
        // one solution
        result[0] = (-b / 2 * a);
      } else if (d > 0) {
        // two solutions
        result[0] = (-b + Math.sqrt(d)) / (2.0 * a);
        result[1] = (-b - Math.sqrt(d)) / (2.0 * a);
      }
    }

    return result;
  }

}
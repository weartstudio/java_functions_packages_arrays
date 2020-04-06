package elte.fsz.java;
// Write a function (scalar) that returns the scalar multiplication of two arrays that it gets as parameters. ScalarMultiplication.java

public class ScalarMultiplication {

  public static int scalar(int[] a, int[] b) {
    int result = 0;
    int[] scalar = new int[a.length];
    
    // make a multiplication for each element
    for(int i=0; i<a.length; i++){
      scalar[i]=a[i]*b[i];
    }

    // sum the multiplication into one number
    for (int e : scalar) {
      result += e;
    }

    return result;
  }

}
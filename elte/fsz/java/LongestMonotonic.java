package elte.fsz.java;
// Write a function (longestMonotonic) that returns the longest monotonic part of an array. LongestMonotonic.java

public class LongestMonotonic {

  public static int[] longestMonotonic(int[] a) {
    int[] result = new int[a.length];
    int last = 0;
    int count = 0;

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {

        if( ( a[i] < a[j] ) && (last < a[i]) ){
          result[count] = a[i];
          last = a[i];
          count++;
        }

      }
    } 

    return result;
  }


}
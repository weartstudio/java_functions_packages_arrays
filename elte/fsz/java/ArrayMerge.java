package elte.fsz.java;
// Write a function (merge) that merges two arrays of integers which are passed as parameters. ArrayMerge.java

public class ArrayMerge {

  public static int[] merge(int[] a, int[] b) {
    int[] result = new int[(a.length+b.length)];

    for (int i = 0; i < a.length; i++) {
      result[i] = a[i];
    }

    for (int i = 0; i < b.length; i++) {
      // index start from the last item & increment by pos. of 2nd
      result[(a.length+i)] = b[i];
    }

    return result;
  }

}
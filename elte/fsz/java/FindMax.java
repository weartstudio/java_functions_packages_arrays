package elte.fsz.java;
// Write a function (findMax) that returns the greatest element of its array parameter. All the elements in the array are integers. FindMax.java

public class FindMax {

  public static int findMax(int[] max) {
    int result = max[0];

    for (int i : max) {
      result = (i>result) ? i : result;
    }

    return result;
  }

}
package elte.fsz.java;
// Write a function (sort) that sorts an array of integers which is passed as parameter. ArraySort.java

public class ArraySort {

  public static String sort(int[] sort) {
    String result = "";
    int temp = 0;

    for (int i = 0; i < sort.length; i++) {
      // i = one element 
      for (int j = i+1; j < sort.length; j++) {
        // j = other element
        // check numbers one-by-one => if (one > other) => switch position
        if(sort[i] > sort[j]) {
            temp = sort[i];
            sort[i] = sort[j];
            sort[j] = temp;
        }
      }
    }

    for (int i = 0; i < sort.length; i++){ result += sort[i] + ", "; }
    return result;
  }

}
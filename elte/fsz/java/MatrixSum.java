package elte.fsz.java;
/* Write a function that prints out the sum of all row, column and main diagonal. MatrixSum.java
Example of the sums beneath:
0  1  2 |3      0  1 -2 |-1 
1  2  3 |6      1 -2  3 | 2
2  3  4 |9      2 -3 -4 |-5
--------/       --------/
3  6  9  6      3 -4 -3  -6
*/

public class MatrixSum {

  public static String sum(int[][] a){
    int[] sumRow = new int[a[0].length];
    int[] sumCol = new int[a[0].length];
    int diagonal = 0;

    // row (horizontal)
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        // horizonal
        sumRow[i] += a[i][j];
      }
    }

    // col (vertical)
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        sumCol[i] += a[j][i];
      }
    }

    // diagonal
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        if(i==j)
          diagonal += a[i][j];
      }
    }

    // result
    String result = "";
    for (int i = 0; i < sumRow.length; i++) {
      result += (i+1)+". sor: "+sumRow[i]+" | ";
    }
    for (int i = 0; i < sumCol.length; i++) {
      result += (i+1)+". oszlop: "+sumCol[i]+" | ";
    }

    result += "diagonal: "+diagonal;
    // return
    return result;
  }


}
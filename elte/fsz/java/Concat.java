package elte.fsz.java;
/* Write a function that concatenates two String parameters. The function first parameter is a delimiter which type is String, than it is followed by two others which the function concatenates next one another. Concat.java
* Use + to concatenate (simpleConcat)
* Use StringBuilder to concatenate (stringBuilderConcat)
* Use varargs as function parameter (varargsConcat) */

public class Concat {

  public static String simpleConcat(String delimeter, String a, String b) {
    return a + delimeter + b;
  }

  public static String stringBuilderConcat(String delimeter, String a, String b) {
    StringBuilder sBuilder = new StringBuilder(100);

    sBuilder.append(a);
    sBuilder.append(delimeter);
    sBuilder.append(b);

    return sBuilder.toString();
  }

  public static String varargsConcat(String ...a) {
    String result = "";
    for (String i : a) {
      result += i;
    }
    return result;
  }

}
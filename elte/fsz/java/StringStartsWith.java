package elte.fsz.java;
/* Write a function (startsWith) that accepts two String parameters and checks whether the first one starts with the second one. StringStartsWith.java
  - Case-sensitive
  - Ignore case */

public class StringStartsWith {

    public static boolean startsWith(String a, String b){
      // case sensitive
        char x = a.charAt(0);
        char y = b.charAt(0);
        return ( x == y ) ? true : false;
        
      // ignore case sensitive
        /* char x = Character.toLowerCase(a.charAt(0));
        char y = Character.toLowerCase(b.charAt(0));
        return ( x == y ) ? true : false; */

        
    }

}
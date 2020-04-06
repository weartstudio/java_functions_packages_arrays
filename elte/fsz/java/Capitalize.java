package elte.fsz.java;
// Write a function (capitalize) that accepts a String parameter from the command line argument and replace its first character to that capital counterpart. Capitalize.java

public class Capitalize {

  public static String capitalize( String[] args ) {
    // make a string from command line words
    String s = "";
    for( String word : args ){
      s += word;
    }

    // capitaalize the letter
    String temp = "";
    for (int i = 0; i < s.length(); i++) {
      Character c = s.charAt(i);
      if(i==0)
        c = Character.toUpperCase(c);
      temp += c;
    }
    s = temp;
    return s;
  }

}
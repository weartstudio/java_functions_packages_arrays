package elte.fsz.java;
// Write a function (isPalindrom) that decides whether the parameter is a palindrome or not. Palindrom.java

public class Palindrom {

  public static boolean isPalindrom(String str) {
    for (int i = 0; i < str.length() / 2; i+=1) {
      // go through char-by-char & check the first <=> last char
      if( str.charAt(i)  != str.charAt(str.length()-1-i) && str.charAt(i) != ' ' ){
        // if is not equal => false
        return false;
      }
    }
    return true;
  }

}
package elte.fsz.java;
/* 
Write a function (cipher) that gets a char[] as parameter, and it applies ^ against all elements with 'a'. XorCipher.java
* Write a function (decipher) that decodes the result of the abovementioned function (Hint: Apply the same operator with the same operand on it.) 
*/

public class XorCipher {

  public static String cipher(char[] a){
    char x = 'a';
    for (int i = 0; i < a.length; i++) {
      if(a[i] == x){
        a[i] = '^';
      }
    }

    // viewable result of encrypt
    String result = "";
    for (char e:a){
      result += e; //making a string from arraay
    }
    return result;
  }

  public static String decipher(char[] a){
    char x = '^';
    for (int i = 0; i < a.length; i++) {
      if(a[i] == x){
        a[i] = 'a';
      }
    }

    // viewable result of decrypt
    String result = "";
    for (char e:a){
      result += e; //making a string from arraay
    }
    return result;
  }


}
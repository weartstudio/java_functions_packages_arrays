package elte.fsz.java;
/* Write a function that can validate a password. The password has to match against the following conditions: Validator.java
* at least 8 character long
* has to contain only alphanumeric characters
* has to contain at least one capital letter, one non-capital letter and one numeric value */

public class Validator {

  public static boolean validate(String p) {
    boolean result = false;

    // more than 8 char?
    // if string legth more than 8
    if( p.length() >= 8 )
      result = true;

    // alphanumeric char only? (a-z ; A-Z ; 0-9)
      if( result ){
        for (int i = 0; i < p.length(); i++) {
          char c = p.charAt(i);
          if( !Character.isDigit(c) && !Character.isLetter(c) )
            // if something not num or letter => false
            result = false;
        }
      }

    // contains at leaset 1 Capital; 1 non capital; 1 num
      if( result ){
        // set to false for continue
        result = false;

        // declaring vars for checking
        boolean capital, lower, number;
        capital = lower = number = false;

        // go through the letters
        for (int i = 0; i < p.length(); i++) {
          char c = p.charAt(i);
          if( Character.isUpperCase(c) )
            capital = true;
          if( Character.isLowerCase(c) )
            lower = true;
          if( Character.isDigit(c) )
            number = true;
        }

        // check the vars
        if( capital && lower && number )
          result = true;

      }


    // return the result
    return result;
  }

}
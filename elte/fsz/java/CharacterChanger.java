package elte.fsz.java;
/* Write a function (change) that accepts a String parameter and change its characters according to as follows: CharacterChanger.java

- Leaves all numeric characters as it is
- Changes all characters to lower case
- Changes all other characters to _

"Adria 2020!!" => "adria_2020__"
*/

public class CharacterChanger {

  public static String change(String s){
    String result = "";

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      // c is nuber?
      if( !Character.isDigit(c) ){
        // to lowercase all char
          c = Character.toLowerCase(c);
        // is letter?
          if( Character.isLetter(c) ){ result += c; }
          else { result += "_"; }
      } else {
        // if is number than leave it
        result += c;
      }
    }

    return result;
  }

}
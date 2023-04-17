package stringsLesson;

/*Given a non-empty string and an int n,
return a new string where the character at index n has been removed. T
he value of n will be a valid index of a character in the original string
 (i.e. n will be in the range 0..str.length()-1 inclusive).

removeChar("kitten", 1) → "ktten"
removeChar("kitten", 0) → "itten"
removeChar("kitten", 4) → "kittn"

 */

import java.sql.SQLOutput;

public class RemovingChar {
    public static void main(String[] args) {
        RemovingChar removingChar=new RemovingChar();
        System.out.println(removingChar.removeChar("kitten",1));
        System.out.println(removingChar.removeChar("kitten",0));
        System.out.println(removingChar.removeChar("kitten",4));
    }

    public String removeChar(String input,int toremove){

        if (input==null || input.isEmpty()) {
            return "Invalid input";
        }
        String beforeRemove=input.substring(toremove+1);
        String afterRemove =input.substring(0,toremove);
        String result= afterRemove+beforeRemove;
        //System.out.println(result);

        return result;



    }
}

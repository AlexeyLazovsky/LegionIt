package stringsLesson;

//import jdk.incubator.concurrent.StructureViolationException;

/*Given a string, write a program to check if it is palindrome or not (return boolean).
A string is said to be palindrome if the reverse of the string is the same as string. For example, “racecar” is a palindrome, but “carrace” is not a palindrome.
 Return boolean true or false.

method:

public boolean isPalindrome(String text){

//code which will check if the text is palindrome or not.

//return true if it is, false is it is not;

return.....

}

 */
public class Palindrome {
    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("racecar"));


    }


    public boolean isPalindrome(String TextToCheck) {
        String reversedText = "";
        int lastletter = TextToCheck.length() - 1;
        for (int i = lastletter; i >= 0; i--) {
           reversedText = reversedText+TextToCheck.charAt(i);
        }
        return TextToCheck.equals(reversedText);
    }
}






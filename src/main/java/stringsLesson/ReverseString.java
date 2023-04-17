package stringsLesson;

import java.awt.desktop.PreferencesEvent;

public class ReverseString {

    //dog--god
    //get the last letter (length -1) add it to the first letter of the new word.
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("dog");

    }

    public void reverseString(String texttoReverse) {

        if (texttoReverse == null || texttoReverse.isEmpty() || texttoReverse.isBlank()) {
            System.out.println("the string is null or empty");

        } else {

            System.out.println(String.format("the input string is %s",texttoReverse));
            String result = "";
            int lastletter = texttoReverse.length() - 1;
    for (int i=lastletter; i >=0; i --){
        result= result+texttoReverse.charAt(i);
    }
            System.out.println(result);
        }
    }

}


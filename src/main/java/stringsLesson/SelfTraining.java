package stringsLesson;


/*
Given a string, take the last char and return a new string with the last char added at the beginning and the end, so "dog" will become "gdogg". The original string should be length 1 or more.



backAround("dog") → "gdogg"

backAround("red") → "dredd"

backAround("xy") → "yxyy"

public String addChars(String str) {
 */

public class SelfTraining {
    public static void main(String[] args) {

        SelfTraining selfTraining = new SelfTraining();
        selfTraining.addChars("money");

    }

    public String addChars(String str){
        System.out.println (str.charAt(str.length()-1)+str+str.charAt(str.length()-1));
        return str;





    }



}



package stringsLesson;
/*endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
Given a string, return a new string where the last three characters are now in upper case.
 If the string has less than three characters, uppercase whatever is there.
 */
public class UpperCase {

    public static void main(String[] args) {
        UpperCase upperCase=new UpperCase();
        System.out.println(upperCase.endUp("Hello"));
        System.out.println(upperCase.endUp("Hi there"));
        System.out.println(upperCase.endUp("hi"));
    }

    public String endUp(String input){
        if(input==null || input.length()<=2){
            return input.toUpperCase();
        }

        char lastchar= input.charAt(input.length() - 1);
        char lastbyone= input.charAt(input.length() - 2);
        char lastbytwo= input.charAt(input.length() - 3);

String result= ""+lastbytwo+lastbyone+lastchar;

String newresult = result.toUpperCase();

String  middle = input.substring(0, input.length() - 3);
String finalresult=middle+newresult;

return finalresult;


    }
}

package stringsLesson;

/*1.Write a program (method) that will receive two strings and do the following:

1.) print if one string is part of another:
for example:
String a = Category
String b = Cat
compareStrings(a, b)
output
"Cat is the part of Category"
2.) If Strings are equal, the expected print is:
"The Strings are the same"
3.) If one of the strings is a null -  print:
"Cannot compare Strings"
method:
public void compareStrings(){
}
 */


public class StringAssighnment {
    public static void main(String[] args) {
        String first = "";
        String second = "";

        StringAssighnment stringAssighnment = new StringAssighnment();
        stringAssighnment.compareStrings(first, second);


    }


    public void compareStrings(String first, String second) {
        if (first==null || second==null) {
            System.out.println("Cannot compare Strings");
        }
         else  if (first.isEmpty() || second.isEmpty()){
                System.out.println("Cannot compare Strings, empty inputs");
        }

        else if (first.equals(second)) {
             System.out.println("The Strings are the same");
         }
        else if (first.contains(second)) {
            System.out.println(second + " is the part of " + first);
        }



         else {
            System.out.println(second + " is not the part of " + first);
        }
    }
}

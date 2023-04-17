package stringsLesson;

public class StringZ {

    char f = 'f';
    char b = 'b';

    public static void main(String[] args) {
        StringZ stringZ = new StringZ();
        System.out.println(stringZ.fizzString("fib"));
    }

    public String fizzString(String check) {
        if (check.charAt(0) == f) {
            return "Fizz";
        }
        if (check.charAt(2) == b) {
            return "buzz";

        } else if (check.charAt(0) == f || check.charAt(2) == b) {
            return "FizzBuzz";
        } else return check;
    }
}
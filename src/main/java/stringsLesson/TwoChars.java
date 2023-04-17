package stringsLesson;

public class TwoChars {

    public static void main(String[] args) {
        TwoChars twoChars = new TwoChars();
        System.out.println(twoChars.firstTwo("Hello")); // Output: oellh
        System.out.println(twoChars.firstTwo("abcde")); // Output: dbca
        System.out.println(twoChars.firstTwo("a")); // Output: a
    }

    public String firstTwo(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }

        char firstChar = input.charAt(0);

        char secondChar = input.charAt(1);
return ""+ firstChar+secondChar;

    }
}


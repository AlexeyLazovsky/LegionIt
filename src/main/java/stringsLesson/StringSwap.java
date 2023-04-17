package stringsLesson;

public class StringSwap {
    public static void main(String[] args) {
        StringSwap stringSwap = new StringSwap();
        System.out.println(stringSwap.swapFirstAndLast("hello")); // Output: oellh
        System.out.println(stringSwap.swapFirstAndLast("abcd")); // Output: dbca
        System.out.println(stringSwap.swapFirstAndLast("a")); // Output: a
    }

    public String swapFirstAndLast(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }

        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);
        String middle = input.substring(1, input.length() - 1);

        return lastChar + middle + firstChar;
    }
}

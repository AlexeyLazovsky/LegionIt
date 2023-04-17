package stringsLesson;

public class NoEnd {
    public static void main(String[] args) {
        NoEnd noEnd = new NoEnd();
        System.out.println(noEnd.withoutEnd("Hello"));
        System.out.println(noEnd.withoutEnd("java"));
        System.out.println(noEnd.withoutEnd("coding"));
    }

    public String withoutEnd(String input) {
        if (input == null || input.length() <= 2) {
            return input;
        }
        String middle = input.substring(1, input.length() - 1);
        String result=middle;
        char firstchar=input.charAt(0);
        char lastchar= input.charAt(input.length()-1);

return result;
    }

}

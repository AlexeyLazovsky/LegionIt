package stringsLesson;


/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"

stringTimes("Hi", 3) → "HiHiHi"

stringTimes("Hi", 1) → "Hi"
 */
public class Times {
    public static void main(String[] args) {
        Times times = new Times();
        times.stringTimes("Hi", 2);
    }

    public void stringTimes(String input, int timestocalculate) {
        String result = "";
        for (int i = 0; i < timestocalculate; i++) {
            result = result + input;
        }

            System.out.println(result);

        }

    }

package Lesson4;

public class ArraysCountWords {
    public static void main(String[] args) {
        ArraysCountWords arraysCountWords = new ArraysCountWords();
        String[] names = {"Alice", "Bob", "Charlie", "Bob", "Alice", "Bob"};
        String targetName = "Bob";

        // Pass the array and the target name to the wordRepeat method and print the result
        System.out.println("Occurrences of " + targetName + ": " + arraysCountWords.wordRepeat(names, targetName));
    }

    // Update the method signature to accept a String[] and a target String, and return an int
    public int wordRepeat(String[] names, String targetName) {
        int count = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(targetName)) {
                count++;
            }
        }

        // Return the count of occurrences
        return count;
    }
}

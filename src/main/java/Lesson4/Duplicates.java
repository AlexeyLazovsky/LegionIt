package Lesson4;

public class Duplicates {
    public static void main(String[] args) {
        Duplicates duplicates = new Duplicates();

        String[] inputArrays = {"A", "B", "A", "C", "D", "B", "E", "A"};
        String[] outputArray = duplicates.findDubs(inputArrays);

        // Print the elements of the outputArray
        for (String element : outputArray) {
            System.out.print(element + " ");
        }
    }

    public String[] findDubs(String[] inputArrays) {
        String[] outputArray = new String[0]; // Start with an empty output array

        // Iterate through inputArrays
        for (int i = 0; i < inputArrays.length; i++) {
            boolean alreadyExists = false;

            // Check if the element exists in the outputArray
            for (int j = 0; j < outputArray.length; j++) {
                if (inputArrays[i].equals(outputArray[j])) {
                    alreadyExists = true;
                    break;
                }
            }

            // If the element doesn't exist in the outputArray, add it
            if (!alreadyExists) {
                outputArray = addElement(outputArray, inputArrays[i]);
            }
        }

        return outputArray;
    }

    // Helper method to add an element to an array and return a new array
    public String[] addElement(String[] array, String element) {
        String[] newArray = new String[array.length + 1]; // Create a new array with one additional element

        // Copy the elements from the original array to the new array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = element; // Add the new element to the last position of the new array
        return newArray;
    }
}
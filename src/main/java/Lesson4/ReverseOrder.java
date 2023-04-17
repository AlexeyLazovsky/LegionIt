package Lesson4;

public class ReverseOrder {
    public static void main(String[] args) {
        // Create a new instance of the ReverseOrder class
        ReverseOrder reverseOrder = new ReverseOrder();
        // Declare and initialize the inputArray
        String[] inputArray = {"apple", "banana", "cherry", "date", "fig"};

        // Call the reverse method and store the result in reversedArray
        String[] reversedArray = reverseOrder.reverse(inputArray);

        // Loop through the elements in the reversedArray
        for (int i = 0; i < reversedArray.length; i++) {
            // Print each element followed by a space
            System.out.print(reversedArray[i] + " ");
        }
    }

    // Method to reverse the elements in a given inputArray
    public String[] reverse(String[] inputArray) {
        // Get the length of the inputArray
        int size = inputArray.length;
        // Create a new outputArray with the same length as the inputArray
        String[] outputArray = new String[size];

        // Loop through the elements in the inputArray
        for (int i = 0; i < size; i++) {
            // Assign the element from the inputArray to the corresponding position in the outputArray in reverse order
            outputArray[size - 1 - i] = inputArray[i];
        }

        // Return the outputArray, which contains the reversed elements
        return outputArray;
    }
}
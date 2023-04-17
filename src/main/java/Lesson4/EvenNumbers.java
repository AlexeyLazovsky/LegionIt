package Lesson4;

public class EvenNumbers {
    public static void main(String[] args) {
        EvenNumbers evenNumbers = new EvenNumbers();
        int[] inputNumbers = {1, 2, 3, 4, 5, 6};
        int[] evenNumbersArray = evenNumbers.getEvenNumbers(inputNumbers);

        // Print the even numbers array
        for (int i = 0; i < evenNumbersArray.length; i++) {
            System.out.print(evenNumbersArray[i] + " ");
        }
    }

    public int[] getEvenNumbers(int[] inputNumbers) {
        // Count the number of even numbers
        int evenCount = 0;
        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i] % 2 == 0) {
                evenCount++;
            }
        }

        // Create a new array with the size equal to the number of even numbers
        int[] evenNumbers = new int[evenCount];

        // Add the even numbers to the new array
        int index = 0;
        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i] % 2 == 0) {
                evenNumbers[index] = inputNumbers[i];
                index++;
            }
        }

        // Return the array with even numbers
        return evenNumbers;
    }
}






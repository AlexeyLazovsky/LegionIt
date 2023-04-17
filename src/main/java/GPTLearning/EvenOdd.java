package GPTLearning;

/* Write a Java program that checks if a given number is even or odd using a boolean method.

Create a Java class and a main method.
Inside the main method, instantiate the class object.
Call the custom method isEven from the object, providing an integer as an argument.
Print the result of the method call in the main method.

 */

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        int number = 7;

        if (evenOdd.isEven(number)) {
            System.out.println("The number " + number + " is even");
        } else {
            System.out.println("The number " + number + " is odd");
        }
    }




    public boolean isEven(int inputNumber) {
        if (inputNumber % 2 == 0) {

            return true;
        }

        return false;
    }

}
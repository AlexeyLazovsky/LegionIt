package GPTLearning;

/* Basics and Control Flow:
       Create a method that takes an integer as input
       and prints if the number is positive,
        negative, or zero. Also, print if the number is even or odd.


        */
public class GPT {
    public static void main(String[] args) {
        GPT gpt = new GPT();
        gpt.printNumber(5);


    }

    public void printNumber(int inputNumber) {
        if (inputNumber % 2 == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

        if (inputNumber > 0) {
            System.out.println("The number is positive " + inputNumber);
        } else if (inputNumber < 0) {
            System.out.println("The number is negative " + inputNumber);
        } else {
            System.out.println("The number is zero " + inputNumber);
        }
    }


    }

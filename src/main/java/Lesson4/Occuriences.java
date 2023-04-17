package Lesson4;

public class Occuriences {
    public static void main(String[] args) {
        Occuriences occuriences = new Occuriences();
        int[] numbers = {5, 7, 2, 9, 7, 1, 7, 6, 7, 7};
        int targetNumber = 7;

        System.out.println(occuriences.search(numbers, targetNumber));

    }

    public int search(int[] numbers, int targetNumber) {
        int size = numbers.length;
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i]==targetNumber) {
                counter++;
            }


        }

        //System.out.println(counter);
        return counter;
    }
}





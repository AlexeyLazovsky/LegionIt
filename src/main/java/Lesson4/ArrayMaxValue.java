package Lesson4;

public class ArrayMaxValue {
    public static void main(String[] args) {


        ArrayMaxValue arrayMaxValue = new ArrayMaxValue();
        int [] numbers={5,7,9,12,11,16};
        System.out.println(arrayMaxValue.searchForMax(numbers));
    }


    public int searchForMax(int[] numbers) {
        int size = numbers.length;
        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }


        }
        return max;
    }
}
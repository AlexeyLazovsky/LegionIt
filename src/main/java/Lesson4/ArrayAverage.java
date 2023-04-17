package Lesson4;

public class ArrayAverage {
    public static void main(String[] args) {
        ArrayAverage arrayAverage=new ArrayAverage();
        int [] numbers = {1,2,3,4,5,5,};
        System.out.println(arrayAverage.countAverage(numbers));

    }

    public double countAverage(int[] numbers){
        int size=numbers.length;
        int sum= 0;
        for(int i=0;i<size;i++){
            sum=sum+numbers[i];
        }
        double result = (double) sum / numbers.length;
        return result;
    }

}

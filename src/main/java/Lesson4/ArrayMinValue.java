package Lesson4;

public class ArrayMinValue {
    public static void main(String[] args) {

        ArrayMinValue arrayMinValue=new ArrayMinValue();
        int []numbers={1,5,3,2,-5};
        System.out.println(arrayMinValue.countMinimum(numbers));

    }



    public int countMinimum(int[] numbers){
        int size =numbers.length;
        int min = 0;
        for( int i=0; i<size; i++){
            if (numbers[i]<min){
                min=numbers[i];
            }
        }
        return min;

    }



}



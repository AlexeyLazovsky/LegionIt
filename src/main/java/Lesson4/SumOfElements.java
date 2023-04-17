package Lesson4;

public class SumOfElements {
    public static void main(String[] args) {
        SumOfElements sumOfElements=new SumOfElements();
        int [] inputNumbers={1,2,3,4,5,6};
        System.out.println(sumOfElements.productMaker(inputNumbers));
    }

    int  productMaker (int [] inputNumbers){
        int size= inputNumbers.length;
        int product = 1;
        for (int i=0; i<size; i++){
           product = inputNumbers[i]*product;

        }
        return product;
    }

}

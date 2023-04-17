package Trash;

import java.util.ArrayList;

public class ArrayListSum {
    public static void main(String[] args) {

        ArrayListSum arrayListsSum= new ArrayListSum();
        arrayListsSum.ArraylistCalculation();


    }

    public void  ArraylistCalculation(){

        ArrayList <Integer> numbers =new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        numbers.add(15);
        int sum=0;
        for(int number: numbers){
            sum+=number;




        }

        System.out.println("The sum of array list is " +sum);
        int size=numbers.size();
        int avg= sum/size;
        System.out.println("The average of array list is " + avg);


    }
}

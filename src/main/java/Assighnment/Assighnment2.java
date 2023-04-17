package Assighnment;

import java.util.HashMap;
import java.util.Scanner;

   /* The online Toys store has 5 different products
        – Batmobile (ID12), Light Saber(ID45),
    Wonder Woman (ID6), Hello Kitty Bag(ID201),
    and Junior QA Analyst Doll (ID56). Each product has its own unique ID.
    Please create a Method “public String getToyById(int id)”
    which will build the hashmap of ids/products described above
            (Hashmap<Integer, String>) and return the name of the toy by ID.
    For example, calling getToyById(6) from the main method will return and print “Wonder Woman”.

    Additional requirement:

    If there is no product with an id specified in the call, return “No such Toy” String instead. For example, calling getToyById(999) will return and print “No such Toy”.


    */


public class Assighnment2 {
    public static void main(String[] args) {
        Assighnment2 assighnment2=new Assighnment2();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Toy ID: ");
        int id = Integer.parseInt(scanner.next());

        String toy = assighnment2.getToyById(id);
        System.out.println(toy);
        scanner.close();
    }


    public String getToyById(int id){

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(12,"Batmobile");
        hashMap.put(45,"Light Saber");
        hashMap.put(6,"Wonder Woman");
        hashMap.put(201,"Hello Kitty Bag");
        hashMap.put(56,"Junior QA Analyst Doll");


        if (hashMap.containsKey(id)) {
            return hashMap.get(id);
        } else {
            return "Invalid toy number";
        }
    }




}

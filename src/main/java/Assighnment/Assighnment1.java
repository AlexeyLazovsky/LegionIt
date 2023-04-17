package Assighnment;

/*Assignment 1.

        Create a method with an array list of days of the week from Sunday to Saturday.
        The method can receive a number and return/print the day of the week.
        example:
public String getDay(int day){
        }
        for example, if 2 will be provided, the method should return "Monday"

 */

import java.util.ArrayList;

public class Assighnment1 {
    public static void main(String[] args) {
        Assighnment1 assighnment1=new Assighnment1();
        String day = assighnment1.getDay(2);
        System.out.println(day);

    }

    public String getDay(int day){
        ArrayList<String> days= new ArrayList<String>();
        days.add(0,"Sunday");
        days.add(1,"Monday");
        days.add(2,"Tuesday");
        days.add(3,"Wednesday");
        days.add(4,"Thursday");
        days.add(5,"Friday");
        days.add(6,"Saturday");

int receivedDay=0;
        if (day >= 1 && day <= 7) {
            return days.get(day - 1);
        } else {
            return "Invalid day number";
        }

        }


    }



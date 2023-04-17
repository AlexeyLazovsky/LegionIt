package Trash;

/*Implement a method called removeEvenNumbers() that takes
        an ArrayList of integers as an input and removes all the even numbers
        from the list.
        Call this method in your main function and test it with an
        ArrayList containing a mix of even and odd numbers.


 */
import java.util.ArrayList;
import java.util.Iterator;

public class ListEvenNumbers {
    public static void main(String[] args) {

        ListEvenNumbers listEvenNumbers = new ListEvenNumbers();
listEvenNumbers.removeEvenNumbers();

    }

    public void removeEvenNumbers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);

        System.out.println("Original ArrayList: " + numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("ArrayList after removing even numbers: " + numbers);

    }
}

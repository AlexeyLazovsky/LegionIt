package Assighnment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates remover = new RemoveDuplicates();

        List<String> names = new ArrayList<>();
        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Steve");
        names.add("Pat");
        names.add("Angela");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");

        System.out.println("Original list: " + names);

        List<String> uniqueNames = remover.removeDuplicates(names);

        System.out.println("List with no duplicates: " + uniqueNames);
    }

    public List<String> removeDuplicates(List<String> names) {
        Set<String> uniqueNamesSet = new HashSet<>(names);
        return new ArrayList<>(uniqueNamesSet);
    }
}

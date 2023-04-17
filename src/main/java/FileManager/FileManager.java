package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        String file = "Legion file.txt";

        FileManager fileManager=new FileManager();
        fileManager.createFile(file);
        fileManager.writeToFile(file, "Imagine you're playing with a remote-controlled car. Sometimes, " +
                "the " +
                "car might get stuck in a corner or" +
                " run out of battery, and you need to handle those situations. In Java, when something goes wrong" +

                " while a program is running, we call it an \"exception.\" To handle these exceptions, we use try, catch, and finally blocks.");

        fileManager.readFromFile(file);
    }


    public void createFile(String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String fileName, String text){

        try {
            FileWriter fileWriter=new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error. cant write");
            e.printStackTrace();
        }



    }
public void readFromFile(String fileName){
        File file = new File (fileName);
    try {
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String row= scanner.nextLine();
            System.out.println(row);
        }
    } catch (FileNotFoundException e) {
       e.printStackTrace();
    }

//
//    public void deleteFile(String fileName){
//        File file= new File(fileName);
//        if (file.exists()){
//            file.delete()
//        }
//    }

}


}

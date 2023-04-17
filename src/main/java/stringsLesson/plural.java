package stringsLesson;

public class plural {
    public static void main(String[] args) {
        plural plural=new plural();
        System.out.println("is the input is plural?"+ plural.plurals("change"));


    }


    public  boolean plurals(String input){
boolean plurals = true;
        if (input.endsWith("s")){
            return true;
        }
        else {
            return false;
        }
    }
}

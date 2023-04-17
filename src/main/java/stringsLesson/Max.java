package stringsLesson;

public class Max {
    public static void main(String[] args) {

        Max max=new Max();
        System.out.println(max.maxStart("mia snacks"));

    }
    public boolean maxStart(String str) {
        String ax = "ax";
        if (str.contains(ax)){
            return true;
        }
        else {
            return false;
        }

        }


}

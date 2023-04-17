package stringsLesson;

public class StringFormat {
    public static void main(String[] args) {

       String name =


               "Vasily";
       String gender = "male";
       int age = 20;
       double salary = 5000.50d;

        System.out.println("the name is " + name + " , gender is " + gender +" age is "+ age + ",salary is "+salary);

        System.out.println(String.format("the name is %s, the gender is %s, the age is %d, the salary is %f",name, gender,age,salary));


    }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Student {

    public static String college = "Metropolitan University";

    public String name;
    public int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void changeUniversityName(){
        college = "Leading University";
    }

    public void printValue(){
        System.out.println(college + " " + name + " " + age + "\n" );
    }
}
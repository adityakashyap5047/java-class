
class Student{
    String name;
    int age;

    static String schoolName = "abc";

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void getInfo(){
        System.out.println("The age of "+ this.name + " is " + this.age + " Who study in " + schoolName + " School");
    }
}

public class StaticVariable {
    
    public static void main(String[] args) {
        Student s1 = new Student("Adam", 19);
        Student s2 = new Student("Charlie", 18);

        s1.getInfo();
        s2.getInfo();

        Student.schoolName = "xyz";

        s1.getInfo();
        s2.getInfo();
    }

}

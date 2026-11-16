package LinkedList.Constructor;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kaushal");
        System.out.println(s1.name);
    }
}

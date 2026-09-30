class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parent constructor called");
    }
}

class Student extends Person {

    int marks;

    Student() {
        this("Daanny", 20, 90);
        System.out.println("Default constructor called");
    }

    Student(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class constructorchaining {

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
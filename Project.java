
class Person {
    String name;
    int age;

    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    int rollNumber;
    double marks;

    
    Student(String name, int age, int rollNumber, double marks) {
        super(name, age);  // calling Person constructor
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}


class GraduateStudent extends Student {
    String specialization;

    
    GraduateStudent(String name, int age, int rollNumber, double marks, String specialization) {
        super(name, age, rollNumber, marks); // calling Student constructor
        this.specialization = specialization;
    }

    void displayGraduateStudent() {
        displayStudent();
        System.out.println("Specialization: " + specialization);
    }
}


public class StudentManagementSystem {
    public static void main(String[] args) {

        GraduateStudent gs = new GraduateStudent(
            "Soumya Mehar",
            22,
            101,
            88.5,
            "Computer Science"
        );

        System.out.println("---- Graduate Student Details ----");
        gs.displayGraduateStudent();
    }
}

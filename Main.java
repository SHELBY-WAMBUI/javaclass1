// Parent class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonalDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Multilevel inheritance
class Student extends Person {
    String registrationNumber;
    String course;

    Student(String name, int age, String registrationNumber,
            String course) {
        super(name, age);
        this.registrationNumber = registrationNumber;
        this.course = course;
    }

    void displayAcademicDetails() {
        System.out.println("Registration Number: "
                           + registrationNumber);
        System.out.println("Course: " + course);
    }
}

// Interface for sports participation
interface Sports {
    void participateInSports();
}

// Interface for student leadership
interface Leadership {
    void performLeadershipDuties();
}

// Hybrid inheritance
class UniversityStudent extends Student
        implements Sports, Leadership {

    UniversityStudent(String name, int age,
                      String registrationNumber, String course) {
        super(name, age, registrationNumber, course);
    }

    public void participateInSports() {
        System.out.println("Activity: Member of the university football team");
    }

    public void performLeadershipDuties() {
        System.out.println("Position: Class representative");
    }

    void displayStudentReport() {
        System.out.println("===== STUDENT REPORT =====");
        displayPersonalDetails();
        displayAcademicDetails();
        participateInSports();
        performLeadershipDuties();
    }
}

// Main class
public class HybridInheritance {
    public static void main(String[] args) {
        UniversityStudent student = new UniversityStudent(
            "Mary Wanjiku",
            21,
            "SCS/2026/015",
            "Bachelor of Science in Computer Science"
        );
        student.displayStudentReport();
    }
}



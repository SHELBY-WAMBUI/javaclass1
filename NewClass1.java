

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void calculateGrade(double marks) {
        System.out.println(name + " has marks: " + marks);
    }
}

// Undergraduate student
class Undergraduate extends Student {

    Undergraduate(String name) {
        super(name);
    }

    @Override
    void calculateGrade(double marks) {
        System.out.println("Undergraduate: " + name);

        if (marks >= 70) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}

// Postgraduate student
class Postgraduate extends Student {

    Postgraduate(String name) {
        super(name);
    }

    @Override
    void calculateGrade(double marks) {
        System.out.println("Postgraduate: " + name);

        if (marks >= 80) {
            System.out.println("Grade: Distinction");
        } else if (marks >= 70) {
            System.out.println("Grade: Credit");
        } else if (marks >= 50) {
            System.out.println("Grade: Pass");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}

// Main class
public class PolymorphismDemo {

    public static void main(String[] args) {

        Student student1 = new Undergraduate("Mary");
        Student student2 = new Postgraduate("John");

        student1.calculateGrade(75);
        System.out.println();

        student2.calculateGrade(75);
    }
}

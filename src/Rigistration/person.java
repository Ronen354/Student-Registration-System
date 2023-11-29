package Rigistration;
public abstract class person implements Registrable {
    String name;
    int age;
    String Department;
    double StudentsGrade;

    public person(String name, double StudentsGrade, int age, String Department) {
        this.name = name;
        this.age = age;
        this.Department = Department;
        this.StudentsGrade = StudentsGrade;
    }

    public person() {

    }

    public abstract void dispay();{
    }
}

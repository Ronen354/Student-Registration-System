package Rigistration;

import java.util.Scanner;

public class Student extends person {
    private String StudentId;
    public Student(String name, double StudentsGrade,int age,String StudentId, String Department){
        super();
        this.StudentId = StudentId;
    }

    public Student() {
        super();
    }

    @Override
    public void dispay() {
        System.out.println("                  Student Registration platform               ");
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Student name:");
        String name =input.nextLine().toUpperCase();
        System.out.println("Enter Student department:");
        String Department = input.nextLine().toUpperCase();
        System.out.println(" Enter student ID:");
        String StudentId = input.nextLine().toUpperCase();

        String age;
        System.out.println("Enter Student Age:");
        while(true){
            age=input.nextLine();

            try{
                Integer.parseInt(age);
                break;
            }catch (NumberFormatException e){
                System.out.println("This part will only accept numbers!");
            }
        }

        String grade;

        System.out.println("Enter Student's Gread:");
        while (true){
            grade=input.nextLine();

            try{
                Double.parseDouble(grade);
                break;
            }catch (NumberFormatException e){
                System.out.println("Tis part will only accept numbers!");
            }
        }
        System.out.println("Student Name:=" + name);
        System.out.println("Age of the The student:=" +" "+ age+"years");
        System.out.println("Department of The Student:="+" " + Department);
        System.out.println("Student ID:=" + StudentId);
        System.out.println("Stdents Grade:=" + grade);
    }

    @Override
    public void register() {

    }

}
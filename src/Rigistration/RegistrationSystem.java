package Rigistration;
import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Student Registration Platform");
        System.out.println("Username And Password");

        while (true) {
            System.out.print("username: ");
            String username = input.nextLine();
            System.out.print("password: ");
            String password = input.nextLine();

            if (login(username, password)) {
                person student1 = new Student();
                student1.dispay();
                System.out.println("Student is Successfully Registered!");
                break;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
    }

    public static boolean login(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }
}
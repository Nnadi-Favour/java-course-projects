import java.util.Scanner;

public class Unit3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. View All Students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = input.nextInt();

                    input.nextLine(); // clear buffer

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Age: ");
                    int age = input.nextInt();

                    input.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = input.nextLine();

                    Student s = new Student(name, id, age, grade);
                    StudentManagement.addStudent(s);
                    break;

                case 2:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = input.nextInt();

                    input.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = input.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = input.nextInt();

                    input.nextLine();

                    System.out.print("Enter New Grade: ");
                    String newGrade = input.nextLine();

                    StudentManagement.updateStudent(updateId, newName, newAge, newGrade);
                    break;

                case 3:
                    StudentManagement.displayAllStudents();
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
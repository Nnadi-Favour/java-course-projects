import java.util.ArrayList;

public class StudentManagement {

    // Static list to store all students
    private static ArrayList<Student> students = new ArrayList<>();

    // Static variable to track total students
    private static int totalStudents = 0;

    // Add student
    public static void addStudent(Student student) {
        students.add(student);
        totalStudents++;
        System.out.println("Student added successfully!");
    }

    // Find student by ID
    public static Student findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Update student information
    public static void updateStudent(int id, String name, int age, String grade) {
        Student s = findStudent(id);
        if (s != null) {
            s.setName(name);
            s.setAge(age);
            s.setGrade(grade);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Error: Student ID not found.");
        }
    }

    // View all students
    public static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : students) {
                s.displayStudent();
                System.out.println("--------------------");
            }
        }
    }

    // Get total students
    public static int getTotalStudents() {
        return totalStudents;
    }
}
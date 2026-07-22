/**
 * Unit5.java
 * Unit 5 Programming Assignment
 * Course Enrollment and Grade Management System
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Unit5 {

    private static Scanner input = new Scanner(System.in);

    // Store all students
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println(" Course Enrollment & Grade Management ");
            System.out.println("======================================");
            System.out.println("1. Add Course");
            System.out.println("2. Add Student");
            System.out.println("3. Enroll Student");
            System.out.println("4. Assign Grade");
            System.out.println("5. Calculate Overall Grade");
            System.out.println("6. Update Student");
            System.out.println("7. Update Course");
            System.out.println("8. Display Total Enrolled Students");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    addCourse();
                    break;

                case 2:
                    addStudent();
                    break;

                case 3:
                    enrollStudent();
                    break;

                case 4:
                    assignGrade();
                    break;

                case 5:
                    calculateGrade();
                    break;

                case 6:
                    updateStudent();
                    break;

                case 7:
                    updateCourse();
                    break;

                case 8:
                    System.out.println("Total Enrolled Students: "
                            + Course.getTotalEnrolledStudents());
                    break;

                case 9:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid menu choice.");

            }

        } while (choice != 9);

    }

    // ---------------- Add Course ----------------

    private static void addCourse() {

        System.out.print("Course Code: ");
        String code = input.nextLine();

        System.out.print("Course Name: ");
        String name = input.nextLine();

        System.out.print("Maximum Capacity: ");
        int capacity = input.nextInt();
        input.nextLine();

        CourseManagement.addCourse(code, name, capacity);

    }

    // ---------------- Add Student ----------------

    private static void addStudent() {

        System.out.print("Student Name: ");
        String name = input.nextLine();

        System.out.print("Student ID: ");
        String id = input.nextLine();

        students.add(new Student(name, id));

        System.out.println("Student added successfully.");

    }

    // ---------------- Find Student ----------------

    private static Student findStudent(String id) {

        for (Student student : students) {

            if (student.getStudentId().equalsIgnoreCase(id)) {
                return student;
            }

        }

        return null;

    }

    // ---------------- Enroll Student ----------------

    private static void enrollStudent() {

        System.out.print("Student ID: ");
        String id = input.nextLine();

        Student student = findStudent(id);

        if (student == null) {

            System.out.println("Student not found.");
            return;

        }

        System.out.print("Course Code: ");
        String code = input.nextLine();

        Course course = CourseManagement.findCourse(code);

        CourseManagement.enrollStudent(student, course);

    }

    // ---------------- Assign Grade ----------------

    private static void assignGrade() {

        System.out.print("Student ID: ");
        String id = input.nextLine();

        Student student = findStudent(id);

        if (student == null) {

            System.out.println("Student not found.");
            return;

        }

        System.out.print("Course Code: ");
        String code = input.nextLine();

        Course course = CourseManagement.findCourse(code);

        System.out.print("Grade: ");
        double grade = input.nextDouble();
        input.nextLine();

        CourseManagement.assignGrade(student, course, grade);

    }

    // ---------------- Calculate Overall Grade ----------------

    private static void calculateGrade() {

        System.out.print("Student ID: ");
        String id = input.nextLine();

        Student student = findStudent(id);

        if (student == null) {

            System.out.println("Student not found.");
            return;

        }

        double average = CourseManagement.calculateOverallGrade(student);

        System.out.printf("Overall Grade: %.2f%n", average);

    }

    // ---------------- Update Student ----------------

    private static void updateStudent() {

        System.out.print("Student ID: ");
        String id = input.nextLine();

        Student student = findStudent(id);

        if (student == null) {

            System.out.println("Student not found.");
            return;

        }

        System.out.print("New Name: ");
        String name = input.nextLine();

        System.out.print("New Student ID: ");
        String newId = input.nextLine();

        CourseManagement.updateStudent(student, name, newId);

    }

    // ---------------- Update Course ----------------

    private static void updateCourse() {

        System.out.print("Course Code: ");
        String code = input.nextLine();

        Course course = CourseManagement.findCourse(code);

        if (course == null) {

            System.out.println("Course not found.");
            return;

        }

        System.out.print("New Course Name: ");
        String name = input.nextLine();

        System.out.print("New Maximum Capacity: ");
        int capacity = input.nextInt();
        input.nextLine();

        CourseManagement.updateCourse(course, name, capacity);

    }

}
/**
 * CourseManagement.java
 * Unit 5 Programming Assignment
 * Course Enrollment and Grade Management System
 */

import java.util.ArrayList;
import java.util.HashMap;

public class CourseManagement {

    // Private static variables
    private static ArrayList<Course> courses = new ArrayList<>();

    // Stores the overall grade for each student
    private static HashMap<String, Double> overallGrades = new HashMap<>();

    /**
     * Add a new course.
     */
    public static void addCourse(String code, String name, int capacity) {

        Course course = new Course(code, name, capacity);
        courses.add(course);

        System.out.println("Course added successfully.");
    }

    /**
     * Return the list of courses.
     */
    public static ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * Find a course by its course code.
     */
    public static Course findCourse(String code) {

        for (Course course : courses) {

            if (course.getCourseCode().equalsIgnoreCase(code)) {
                return course;
            }

        }

        return null;
    }

    /**
     * Enroll a student in a course.
     */
    public static void enrollStudent(Student student, Course course) {

        if (course == null) {

            System.out.println("Course not found.");
            return;

        }

        if (course.isFull()) {

            System.out.println("Course has reached maximum capacity.");
            return;

        }

        student.enrollCourse(course);
        course.enrollStudent();

        System.out.println("Enrollment completed successfully.");

    }

    /**
     * Assign a grade to a student.
     */
    public static void assignGrade(Student student,
                                   Course course,
                                   double grade) {

        if (course == null) {

            System.out.println("Course not found.");
            return;

        }

        student.assignGrade(course, grade);

        System.out.println("Grade assigned successfully.");

    }

    /**
     * Calculate the student's overall average grade.
     */
    public static double calculateOverallGrade(Student student) {

        HashMap<Course, Double> grades = student.getGrades();

        if (grades.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (double grade : grades.values()) {
            total += grade;
        }

        double average = total / grades.size();

        overallGrades.put(student.getStudentId(), average);

        return average;

    }

    /**
     * Update student information.
     */
    public static void updateStudent(Student student,
                                     String newName,
                                     String newId) {

        student.setStudentName(newName);
        student.setStudentId(newId);

        System.out.println("Student information updated successfully.");

    }

    /**
     * Update course information.
     */
    public static void updateCourse(Course course,
                                    String newName,
                                    int newCapacity) {

        course.setCourseName(newName);
        course.setMaximumCapacity(newCapacity);

        System.out.println("Course updated successfully.");

    }

}
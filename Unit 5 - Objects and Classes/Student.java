/**
 * Student.java
 * Unit 5 Programming Assignment
 * Course Enrollment and Grade Management System
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    // Private instance variables (Encapsulation)
    private String studentName;
    private String studentId;

    // Store enrolled courses
    private ArrayList<Course> enrolledCourses;

    // Store grades for each course
    private HashMap<Course, Double> grades;

    /**
     * Constructor
     */
    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        enrolledCourses = new ArrayList<>();
        grades = new HashMap<>();
    }

    // Getters

    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public HashMap<Course, Double> getGrades() {
        return grades;
    }

    // Setters

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * Enroll student in a course
     */
    public void enrollCourse(Course course) {

        if (!enrolledCourses.contains(course)) {

            enrolledCourses.add(course);

            System.out.println(studentName +
                    " enrolled successfully in "
                    + course.getCourseName());

        } else {

            System.out.println("Student is already enrolled in this course.");

        }

    }

    /**
     * Assign grade
     */
    public void assignGrade(Course course, double grade) {

        if (enrolledCourses.contains(course)) {

            grades.put(course, grade);

        } else {

            System.out.println("Student is not enrolled in this course.");

        }

    }

}
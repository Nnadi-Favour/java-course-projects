/**
 * Course.java
 * Unit 5 Programming Assignment
 * Course Enrollment and Grade Management System
 */

public class Course {

    // Private instance variables
    private String courseCode;
    private String courseName;
    private int maximumCapacity;
    private int enrolledStudents;

    // Static variable shared by all Course objects
    private static int totalEnrolledStudents = 0;

    /**
     * Constructor
     */
    public Course(String courseCode, String courseName, int maximumCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maximumCapacity = maximumCapacity;
        this.enrolledStudents = 0;
    }

    // Getters

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    // Setters

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    /**
     * Check whether the course has reached its maximum capacity.
     */
    public boolean isFull() {
        return enrolledStudents >= maximumCapacity;
    }

    /**
     * Enroll one student in the course.
     */
    public boolean enrollStudent() {

        if (isFull()) {
            return false;
        }

        enrolledStudents++;
        totalEnrolledStudents++;
        return true;
    }

    /**
     * Static method to retrieve the total number of enrolled students
     * across all courses.
     */
    public static int getTotalEnrolledStudents() {
        return totalEnrolledStudents;
    }

}
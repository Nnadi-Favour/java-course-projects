import java.util.Scanner;

public class Unit1 {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable to store number of correct answers
        int score = 0;
        String answer;

        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("--------------------------------");

        // Question 1
        System.out.println("\n1. What does CPU stand for?");
        System.out.println("A. Central Process Unit");
        System.out.println("B. Central Processing Unit");
        System.out.println("C. Computer Personal Unit");
        System.out.println("D. Control Processing Unit");

        answer = input.nextLine().toUpperCase();

        if (answer.equals("A") || answer.equals("B") ||
            answer.equals("C") || answer.equals("D")) {

            switch (answer) {
                case "B":
                    score++;
                    System.out.println("Correct!");
                    break;
                default:
                    System.out.println("Incorrect!");
            }
        } else {
            System.out.println("Invalid input.");
        }

        // Question 2
        System.out.println("\n2. Which language is used to develop Java programs?");
        System.out.println("A. Java");
        System.out.println("B. HTML");
        System.out.println("C. SQL");
        System.out.println("D. CSS");

        answer = input.nextLine().toUpperCase();

        if (answer.equals("A") || answer.equals("B") ||
            answer.equals("C") || answer.equals("D")) {

            switch (answer) {
                case "A":
                    score++;
                    System.out.println("Correct!");
                    break;
                default:
                    System.out.println("Incorrect!");
            }
        } else {
            System.out.println("Invalid input.");
        }

        // Question 3
        System.out.println("\n3. Which symbol is used to end a Java statement?");
        System.out.println("A. :");
        System.out.println("B. .");
        System.out.println("C. ;");
        System.out.println("D. ,");

        answer = input.nextLine().toUpperCase();

        if (answer.equals("A") || answer.equals("B") ||
            answer.equals("C") || answer.equals("D")) {

            switch (answer) {
                case "C":
                    score++;
                    System.out.println("Correct!");
                    break;
                default:
                    System.out.println("Incorrect!");
            }
        } else {
            System.out.println("Invalid input.");
        }

        // Question 4
        System.out.println("\n4. Which of the following is a Java keyword?");
        System.out.println("A. class");
        System.out.println("B. laptop");
        System.out.println("C. keyboard");
        System.out.println("D. monitor");

        answer = input.nextLine().toUpperCase();

        if (answer.equals("A") || answer.equals("B") ||
            answer.equals("C") || answer.equals("D")) {

            switch (answer) {
                case "A":
                    score++;
                    System.out.println("Correct!");
                    break;
                default:
                    System.out.println("Incorrect!");
            }
        } else {
            System.out.println("Invalid input.");
        }

        // Question 5
        System.out.println("\n5. Which company originally developed Java?");
        System.out.println("A. Google");
        System.out.println("B. Microsoft");
        System.out.println("C. Apple");
        System.out.println("D. Sun Microsystems");

        answer = input.nextLine().toUpperCase();

        if (answer.equals("A") || answer.equals("B") ||
            answer.equals("C") || answer.equals("D")) {

            switch (answer) {
                case "D":
                    score++;
                    System.out.println("Correct!");
                    break;
                default:
                    System.out.println("Incorrect!");
            }
        } else {
            System.out.println("Invalid input.");
        }

        // Calculate final percentage score
        double percentage = (score / 5.0) * 100;

        System.out.println("\n--------------------------------");
        System.out.println("Quiz Completed!");
        System.out.println("Correct Answers: " + score + " out of 5");
        System.out.println("Final Score: " + percentage + "%");

        input.close();
    }
}
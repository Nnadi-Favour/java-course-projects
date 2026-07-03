import java.util.ArrayList;
import java.util.Scanner;

class Book {

    String title;
    String author;
    int quantity;

    public Book(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }
}


public class Unit2 {

    static ArrayList<Book> library = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);


    // Method to add books
    public static void addBook() {

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author name: ");
        String author = scanner.nextLine();

        int quantity = getValidNumber("Enter quantity: ");


        boolean bookExists = false;


        for (Book book : library) {

            if (book.title.equalsIgnoreCase(title)) {

                book.quantity += quantity;
                bookExists = true;

                System.out.println("Book quantity updated successfully.");
                break;
            }
        }


        if (!bookExists) {

            library.add(new Book(title, author, quantity));

            System.out.println("New book added successfully.");
        }
    }



    // Method to borrow books
    public static void borrowBook() {


        System.out.print("Enter book title to borrow: ");
        String title = scanner.nextLine();


        int quantity = getValidNumber("Enter number of books to borrow: ");


        boolean found = false;


        for (Book book : library) {


            if (book.title.equalsIgnoreCase(title)) {


                found = true;


                if (book.quantity >= quantity) {


                    book.quantity -= quantity;

                    System.out.println("Book borrowed successfully.");

                }

                else {

                    System.out.println("Error: Not enough books available.");
                }


                break;
            }
        }


        if (!found) {

            System.out.println("Error: Book does not exist in library.");
        }

    }




    // Method to return books
    public static void returnBook() {


        System.out.print("Enter book title to return: ");
        String title = scanner.nextLine();


        int quantity = getValidNumber("Enter number of books to return: ");


        boolean found = false;



        for (Book book : library) {


            if (book.title.equalsIgnoreCase(title)) {


                book.quantity += quantity;

                found = true;


                System.out.println("Book returned successfully.");

                break;

            }
        }



        if (!found) {

            System.out.println(
                    "Error: This book does not belong to the library system."
            );
        }

    }





    // Display available books
    public static void displayBooks() {


        if (library.isEmpty()) {

            System.out.println("Library is currently empty.");

        }

        else {


            System.out.println("\nAvailable Books:");

            for (Book book : library) {


                System.out.println(
                        "Title: " + book.title +
                        ", Author: " + book.author +
                        ", Quantity: " + book.quantity
                );

            }
        }

    }





    // Handles invalid numeric input
    public static int getValidNumber(String message) {


        while (true) {


            try {


                System.out.print(message);

                int number = Integer.parseInt(scanner.nextLine());


                if (number > 0) {

                    return number;
                }

                else {

                    System.out.println(
                            "Please enter a number greater than zero."
                    );
                }


            }


            catch (NumberFormatException e) {


                System.out.println(
                        "Invalid input. Please enter numbers only."
                );

            }

        }

    }






    public static void main(String[] args) {


        int choice;


        do {


            System.out.println("\n===== Library Management System =====");

            System.out.println("1. Add Books");

            System.out.println("2. Borrow Books");

            System.out.println("3. Return Books");

            System.out.println("4. Display Books");

            System.out.println("5. Exit");


            choice = getValidNumber("Choose an option: ");




            switch(choice) {


                case 1:

                    addBook();

                    break;



                case 2:

                    borrowBook();

                    break;



                case 3:

                    returnBook();

                    break;



                case 4:

                    displayBooks();

                    break;



                case 5:

                    System.out.println(
                            "Exiting Library System. Goodbye!"
                    );

                    break;



                default:

                    System.out.println(
                            "Invalid option. Please try again."
                    );

            }



        } while(choice != 5);


        scanner.close();

    }

}
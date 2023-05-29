package bingAI;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LibrarySystem librarySystem = new LibrarySystem();
        System.out.println("Welcome to the Library System!");

        // Automatically register at least 7 books
        librarySystem.registerBook(new Book("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", 1960, 281));
        librarySystem.registerBook(new Book("1984", "George Orwell", "Secker & Warburg", 1949, 328));
        librarySystem.registerBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 1925, 218));
        librarySystem.registerBook(new Book("One Hundred Years of Solitude", "Gabriel García Márquez", "Harper & Row", 1967, 417));
        librarySystem.registerBook(new Book("Moby-Dick", "Herman Melville", "Richard Bentley", 1851, 927));
        librarySystem.registerBook(new Book("War and Peace", "Leo Tolstoy", "The Russian Messenger", 1869, 1225));
        librarySystem.registerBook(new Book("The Catcher in the Rye", "J. D. Salinger", "Little, Brown and Company", 1951, 277));

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Register a book");
            System.out.println("2. List books");
            System.out.println("3. Search for a book by title");
            System.out.println("4. Exit");
            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                System.out.print("Enter the title of the book: ");
                String title = input.nextLine();
                System.out.print("Enter the author of the book: ");
                String author = input.nextLine();
                System.out.print("Enter the publisher of the book: ");
                String publisher = input.nextLine();
                System.out.print("Enter the year of publication of the book: ");
                int yearOfPublication = input.nextInt();
                input.nextLine();
                System.out.print("Enter the number of pages of the book: ");
                int numberOfPages = input.nextInt();
                input.nextLine();
                librarySystem.registerBook(new Book(title, author, publisher, yearOfPublication, numberOfPages));
                System.out.println("Book registered successfully!");
            } else if (option == 2) {
                librarySystem.listBooks();
            } else if (option == 3) {
                System.out.print("Enter the title of the book: ");
                String title = input.nextLine();
                Book book = librarySystem.searchBookByTitle(title);
                if (book != null) {
                    System.out.println("\nBook found:");
                    System.out.printf("%-25s %-25s %-25s %-20s %s\n","Title", "Author", "Publisher", "Year of Publication", "Number of Pages");
                    System.out.printf("%-25s %-25s %-25s %-20d %d\n",
                        book.getTitle(), book.getAuthor(), book.getPublisher(), book.getYearOfPublication(), book.getNumberOfPages());
                } else {
                    System.out.println("Book not found.");
                }
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

class LibrarySystem {
    private ArrayList<Book> books;

    public LibrarySystem() {
        books = new ArrayList<Book>();
    }

    public void registerBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        System.out.println("\nRegistered books:");
        System.out.printf("%-25s %-25s %s\n","Title", "Author", "Year of Publication");
        for (Book book : books) {
            System.out.printf("%-25s %-25s %d\n",
                book.getTitle(), book.getAuthor(), book.getYearOfPublication());
        }
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}

class Book {
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int numberOfPages;

    public Book(String title, String author, String publisher, int yearOfPublication, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
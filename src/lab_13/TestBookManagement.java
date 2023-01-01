package lab_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestBookManagement {

    public static void main(String[] args) {
        System.out.println("====== Book Management Program (CRUD) ======");
        System.out.println("1. Add new book");
        System.out.println("2. Find a book(ISBN)");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");
        System.out.println("0. Exit!");
        System.out.println("============================================");

        Scanner sc = new Scanner(System.in);
        BookList bookListt = new BookList();
        String bookListDBFile = System.getProperty("user.dir") + "/src/lab_13/BookListDB.txt";
        boolean isContinue = true;

        while (isContinue) {
            System.out.print("Please select an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: // Add a new book the list
                    System.out.print("Please input ISBN: "); String ISBN = sc.nextLine();
                    System.out.print("Please input title: "); String title = sc.nextLine();
                    System.out.print("Please input author: "); String author = sc.nextLine();
                    System.out.print("Please input year: "); int year = sc.nextInt();
                    sc.nextLine();
                    Book newBook = new Book(ISBN, title, author, year);
                    bookListt.addNewBook(newBook);
                    break;
                case 2: // Find a book by ISBN
                    System.out.print("Please input ISBN: ");
                    String searchISBN = sc.nextLine();
                    bookListt.findBook(searchISBN);
                    break;
                case 3: // Update a book by ISBN
                     System.out.print("Please input ISBN: "); String updateISBN = sc.nextLine();
                     System.out.print("Please input new title: "); String updateTitle = sc.nextLine();
                     System.out.print("Please input new author: "); String updateAuthor = sc.nextLine();
                     System.out.print("Please input new year: "); int updateYear = sc.nextInt();
                     sc.nextLine();
                     Book updateBook = new Book(updateISBN, updateTitle, updateAuthor, updateYear);
                     bookListt.updateBook(updateBook);
                     bookListt.saveToFile(bookListDBFile);
                     break;
                case 4: // 4. Delete a book by ISBN
                     System.out.print("Please input ISBN: "); String deleteISBN = sc.nextLine();
                     Book deleteBook = new Book(deleteISBN);
                     bookListt.deleteBook(deleteBook);
                     bookListt.saveToFile(bookListDBFile);
                     break;
                case 5: // 5. Save to file
                    bookListt.saveToFile(bookListDBFile);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Option is not correct!");
            }
        }
    }
}

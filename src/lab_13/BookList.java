package lab_13;

import java.io.*;
import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList<Book>();
    }

    public BookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    // 1. Add new book
    public void addNewBook(Book newBook) {
        bookList.add(newBook);
        System.out.println("The book is saved into DB with info: " + newBook.toString());
    }

    // 2. Find a book by ISBN
    public void findBook(String ISBN) {
        for (Book book : bookList) {
            if (book.getISBN().equals(ISBN))
                System.out.println(book.toString());
        }
    }

    // 3. Update a book
    public void updateBook(Book updateBook) {
        for (Book book : bookList) {
            if (updateBook.getISBN().equals(book.getISBN()))
                System.out.println("Updated! " + updateBook.toString());
            else
                System.out.println("The book with ISBN <" + updateBook.getISBN() + "> is not found!");
        }
    }

    // 4. Delete a book by ISBN
    public void deleteBook(Book deleteBook) {
        bookList.remove(deleteBook);
        System.out.println("The book with ISBN <" + deleteBook.getISBN() + "> is deleted!");
    }

    // 5. Save book list to file
    public void saveToFile(String filename) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filename);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (int i = 0; i < bookList.size(); i++) {
                String ISBN = bookList.get(i).getISBN();
                String titleLine = bookList.get(i).getTitle();
                String author = bookList.get(i).getAuthor();
                int year = bookList.get(i).getYear();
                bufferedWriter.write("Book " + (i+1) + ": " + titleLine);
                bufferedWriter.newLine();
                bufferedWriter.write("     ISBN: " + ISBN);
                bufferedWriter.newLine();
                bufferedWriter.write("     author: " + author);
                bufferedWriter.newLine();
                bufferedWriter.write("     year: " + year);
                bufferedWriter.newLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

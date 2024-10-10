package oops;

import java.util.ArrayList;
import java.util.List;


class Book {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return name + " written by " + author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}


class BookContainer {
    List<Book> books;

    public BookContainer() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.getName() + " (" + book.getAuthor() + ")");
        }
    }
}



class BookShelf extends BookContainer {
    String shelfName;

    public BookShelf(String shelfName) {
        super();
        this.shelfName = shelfName;
    }

    public void addBook(int index, Book book) {
        books.add(index, book);
    }
    
    
    public static void main(String[] args) {
        Book b1 = new Book("Old Man and the Sea", "Ernest Hemingway");
        Book b2 = new Book("Silent Spring", "Rachel Carson");
        Book b3 = new Book("Pride and Prejudice", "Jane Austen");

        BookShelf bookshelf1 = new BookShelf("Novels");

        bookshelf1.addBook(0, b2);
        bookshelf1.addBook(1, b1);
        bookshelf1.addBook(2, b3);

        bookshelf1.listBooks();
    }
}


    


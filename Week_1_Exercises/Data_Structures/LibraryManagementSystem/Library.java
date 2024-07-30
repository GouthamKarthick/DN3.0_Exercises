package LibraryManagementSystem;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size >= books.length) {
            System.out.println("Library is full, cannot add more books.");
            return;
        }
        books[size++] = book;
    }

    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        int left = 0, right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);
            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public void sortBooksByTitle() {
        Arrays.sort(books, 0, size, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }

    public void traverseBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        Library library = new Library(10);
        library.addBook(new Book("B1", "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("B2", "1984", "George Orwell"));
        library.addBook(new Book("B3", "The Great Gatsby", "F. Scott Fitzgerald"));

        System.out.println("All Books:");
        library.traverseBooks();

        System.out.println("\nSorting books by title:");
        library.sortBooksByTitle();
        library.traverseBooks();

        System.out.println("\nSearching for '1984' using binary search:");
        Book book = library.binarySearchByTitle("1984");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }
}

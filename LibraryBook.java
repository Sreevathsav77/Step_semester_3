class LibraryBook1 {
    String title;
    String isbn;

    // Constructor 1
    public LibraryBook1(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    // Constructor 2 - constructor chaining
    public LibraryBook1(String title) {
        this(title, "PENDING");
    }

    public boolean isCatalogued() {
        return true;
    }
}

public class LibraryBook {
    public static void main(String[] args) {

        String[] titles = {"Clean Code", "Untitled Draft", "1984", "Notes"};
        String[] isbns = {"978-0132350884", "", "9780451524935", ""};

        // Single pass
        for (int i = 0; i < titles.length; i++) {

            LibraryBook1 book;

            if (isbns[i].equals("")) {
                book = new LibraryBook1(titles[i]);
            } else {
                book = new LibraryBook1(titles[i], isbns[i]);
            }

            System.out.println(book.title + " | " + book.isbn
                    + " | Catalogued: " + book.isCatalogued());
        }
    }
}
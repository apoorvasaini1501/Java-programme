class Library {
    int booksAvailable;
    static String libraryName = "City Library";

    void issue() {
        int remaining;

        if (booksAvailable > 0) {
            remaining = booksAvailable - 1;
            booksAvailable = remaining;
            System.out.println("Book Issued");
        } else {
            System.out.println("No Books Available");
        }
    }

    void returnBook() {
        int updated = booksAvailable + 1;
        booksAvailable = updated;
        System.out.println("Book Returned");
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.booksAvailable = 5;

        System.out.println("Library: " + libraryName);
        l.issue();
        System.out.println("Available: " + l.booksAvailable);

        l.returnBook();
        System.out.println("Available: " + l.booksAvailable);
    }
}

Library: City Library
Book Issued
Available: 4
Book Returned
Available: 5
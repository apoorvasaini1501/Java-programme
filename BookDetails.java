class Book {
    String title, author;
    double price;
    static String publisher = "ABC Publication";

    public static void main(String[] args) {
        String t = "Java Basics";
        String a = "James";
        double p = 250;
        Book b = new Book();
        b.title = t;
        b.author = a;
        b.price = p;

        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
        System.out.println("Price: " + b.price);
        System.out.println("Publisher: " + publisher);
    }
}

Title: Java Basics
Author: James
Price: 250.0
Publisher: ABC Publication
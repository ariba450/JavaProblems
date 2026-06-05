class Book {
    String title;
    String author;

    Book(String title) {
        this.title=title;
    }

    Book(String title, String author) {
        this.title=title;
        this.author=author;
    }

    void display() {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
    }
}

public class LibrarySystemDesign {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter2");
        Book b2 = new Book("Harry Potter 3", "J.K. Rowling");

        b1.display();
        System.out.println();
        b2.display();
    }
}
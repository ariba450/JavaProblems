class Books {
    int bookId;
    String bookName;
    String bookAuthor;
    String yearOfPub;
    float price;
    String status;

    Books(int bookId, String bookName, String bookAuthor, String yearOfPub, float price, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = status;
    }

    void displayBookDetails() {
        System.out.println(bookName + " by " + bookAuthor + " | Price: " + price);
    }
}

class User {
    int userId;
    String userName;

    User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    void bookPurchase(Books b) {
        System.out.println(userName + " purchased " + b.bookName);
    }
}

class Publisher {
    int id;
    String name;

    Publisher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void addPub() {
        System.out.println("Publisher added: " + name);
    }
}

class Librarian {
    int id;
    String name;

    Librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void searchBook(Books b) {
        System.out.println("Searching book: " + b.bookName);
    }

    void sellBook(User u, Books b) {
        System.out.println("Librarian sold " + b.bookName + " to " + u.userName);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Books b1 = new Books(1, "Java", "James", "2020", 500, "Available");

        User u1 = new User(101, "Ariba");

        Librarian l1 = new Librarian(1, "Mr. Smith");

        Publisher p1 = new Publisher(1, "ABC Pub");

        b1.displayBookDetails();

        l1.searchBook(b1);

        l1.sellBook(u1, b1);

        u1.bookPurchase(b1);

        p1.addPub();
    }
}
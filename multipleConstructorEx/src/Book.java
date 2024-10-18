public class Book {
    // Private instance variables
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        // Initialize title to "Unknown"
        this.title = "Unknown";
        // Initialize author to "Unknown"
        this.author = "Unknown";
        // Initialize price to 0.0
        this.price = 0.0;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Parameterized constructor (title, author)
    public Book(String title, String author) {
        // Initialize title with the provided parameter
        this.title = title;
        // Initialize author with the provided parameter
        this.author = author;
        // Initialize price to 0.0
        this.price = 0.0;
    }

    // Parameterized constructor (title, author, price)
    public Book(String title, String author, double price) {
        // Initialize title with the provided parameter
        this.title = title;
        // Initialize author with the provided parameter
        this.author = author;
        // Initialize price with the provided parameter
        this.price = price;
    }
}


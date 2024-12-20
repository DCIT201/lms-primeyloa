public class Book {
    private String bookId;
    private String title;
    private boolean isAvailable;
    private int yearPublished;
    private String author;

    // Constructor
    public Book(String bookId, String title, int yearPublished, String author) {
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = true;
        this.yearPublished = yearPublished;
    }
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public Book(String title, String author, int yearPublished) {
    }

    // Getters
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(){
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
    public void setYearPublished(){
        this.yearPublished = yearPublished;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Borrow book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Return book
    public void returnBook() {
        isAvailable = true;
    }
}

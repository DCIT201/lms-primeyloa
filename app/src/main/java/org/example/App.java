/*
 * This should be your main class where all your objects will be created
 */
public class App {
        public static void main(String[] args) {
            Library library = new Library();

            // Add books
            library.addBook("1984", "George Orwell", 1949);
            library.addBook("B002", "Dimitri's game", 2006);
            library.addBook("B003", "To Kill a Mockingbird", 2023);

            // Register patrons
            library.registerPatron("P001", "Alice");
            library.registerPatron("P002", "Bob");

            // Borrow books
            library.borrowBook("P001", "B001");
            library.borrowBook("P002", "B002");

            // Display books
            library.displayBooks();

            // Return books
            library.returnBook("P001", "B001");
            library.returnBook("P002", "B002");

            // Display books again
            library.displayBooks();}
    }

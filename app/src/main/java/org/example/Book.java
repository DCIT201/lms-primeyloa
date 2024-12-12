public class Book {
        //Initilalizing the necessary variables
        private String bookTitle;
        private String bookGenre;
        private String bookAuthor;
        private boolean bookAvailability;
        private String bookYear;
        private String bookISBN;


        // initializing the constructor for the book class
        public Book(String bookTitle, String bookGenre, String bookAuthor, boolean bookAvailability, String bookYear, String bookISBN) {
            this.bookTitle = bookTitle;
            this.bookGenre = bookGenre;
            this.bookAuthor = bookAuthor;
            this.bookAvailability = true;
        }

        public String getBookTitle() {
            return bookTitle;
        }
        public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
        }
        public String getBookGenre() {
            return bookGenre;
        }
        public void setBookGenre(String bookGenre) {
            this.bookGenre = bookGenre;
        }
        public String getBookAuthor() {
            return bookAuthor;
        }
        public void setBookAuthor(String bookAuthor) {
            this.bookAuthor = bookAuthor;
        }
        public boolean getBookAvailability() {
            return bookAvailability;
        }
        public void setBookAvailability(boolean bookAvailability) {

        }
        public String getBookYear() {
            return bookYear;
        }
        public void setBookYear(String bookYear) {
            this.bookYear = bookYear;
        }
        public String getBookISBN() {

            return bookISBN;
        }
        public void setBookISBN(String bookISBN) {
            this.bookISBN = bookISBN;
        }
        
}

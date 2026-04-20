class PrintedBook extends Book {

    public PrintedBook(String isbn, String title, String author) {
        super(isbn, title, author);
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Printed Book: " + getTitle() + " by " + getAuthor());
    }
}

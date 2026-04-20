public class Librarian extends User {

    private String employeeNumber;

    // Constructor
    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard | Employee No: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    // Librarian specific methods
    public void addNewBook(Book book) {
        // logic to add book
    }

    public void removeBook(Book book) {
        // logic to remove book
    }
}

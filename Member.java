public class Member extends User {

    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    // Default Constructor
    public Member() {
        super();
        this.borrowedBooksCount = 0;
    }

    // Parameterized Constructor
    public Member(String name, String contactInfo, int borrowedBooksCount) {
        super(name, contactInfo);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    // Copy Constructor
    public Member(Member other) {
        super(other);
        this.borrowedBooksCount = other.borrowedBooksCount;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard | Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}

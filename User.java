public abstract class User {

    private String userId;
    private String name;
    private String contactInfo;

    // ✅ Static counter (Task 6) 
    private static int totalUsers = 0;

    // Default Constructor
    public User() {
        this.userId = generateUniqueId();
        totalUsers++;
    }

    // Parameterized Constructor
    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUsers++;
    }

    // Copy Constructor
    public User(User other) {
        this.userId = other.userId;
        this.name = other.name;
        this.contactInfo = other.contactInfo;
        totalUsers++;
    }

    // ✅ Final method (cannot override)
    protected final String generateUniqueId() {
        return "USER-" + totalUsers;
    }

    // Static method
    public static int getTotalUsers() {
        return totalUsers;
    }

    // Getters / Setters
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }

    // Abstract methods
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}

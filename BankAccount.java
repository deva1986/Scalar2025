public class BankAccount {

    // Fields
    private double balance;
    private String ownerName;

    // Constructor
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Set to 0.");
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Getter methods
    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }

    // MAIN METHOD (Program Entry Point)
    public static void main(String[] args) {

        // Create account
        BankAccount account = new BankAccount("Rahul", 1000);

        // Display initial info
        System.out.println("\n--- Initial Account Details ---");
        account.displayAccountInfo();

        // Deposit money
        System.out.println("\n--- Deposit ---");
        account.deposit(500);

        // Withdraw money
        System.out.println("\n--- Withdraw ---");
        account.withdraw(300);

        // Try invalid withdraw
        System.out.println("\n--- Invalid Withdraw ---");
        account.withdraw(2000);

        // Final account info
        System.out.println("\n--- Final Account Details ---");
        account.displayAccountInfo();
    }
}
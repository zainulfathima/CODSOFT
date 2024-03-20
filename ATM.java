class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }
    public void withdraw(double amount) {
        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            account.withdraw(amount);
            System.out.println("Withdrawal successful.");
        }
    }
    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Deposit successful.");
    }
    public void checkBalance() {
        System.out.println("Your balance is: " + account.getBalance());
    }
    public void exit() {
        System.out.println("Thank you for using the ATM. Have a nice day!");
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        ATM atm = new ATM(account);
        atm.displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the amount to withdraw:");
                double withdrawAmount = scanner.nextDouble();
                atm.withdraw(withdrawAmount);
                break;
            case 2:
                System.out.println("Enter the amount to deposit:");
                double depositAmount = scanner.nextDouble();
                atm.deposit(depositAmount);
                break;
            case 3:
                atm.checkBalance();
                break;
            case 4:
                atm.exit();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
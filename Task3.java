import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double Amount) {
        if (Amount > 0) {
            balance += Amount;
            System.out.println("Deposited " + Amount + " successfully.");
        } else {
            System.out.println("Invalid deposit Amount.");
        }
    }

    public void withdraw(double Amount) {
        if (Amount > 0 && Amount <= balance) {
            balance -= Amount;
            System.out.println("Withdrawn " + Amount + " successfully.");
        } else {
            System.out.println("Invalid withdrawal Amount or insufficient balance.");
        }
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void DisplayOperations() {

        System.out.println("1. Check Account Balance");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Exit");
    }

    public void PerformOperation(int choice) {
        Scanner s = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.println("Your balance is " + account.getBalance());
                break;
            case 2:
                System.out.print("Enter deposit Amount: ");
                double depositAmount = s.nextDouble();
                account.deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter withdrawal Amount: ");
                double withdrawalAmount = s.nextDouble();
                account.withdraw(withdrawalAmount);
                break;
            case 4:
                System.out.println("Thank you for using this ATM.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0); // Initial balance is $1000
        ATM Myatm = new ATM(userAccount);

        while (true) {
            Myatm.DisplayOperations();
            Scanner s = new Scanner(System.in);
            System.out.print("Select an choice (1-4): ");
            int choice = s.nextInt();
            Myatm.PerformOperation(choice);
        }
    }
}

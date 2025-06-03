import java.util.Scanner;

public class SemiColonATM {

    public static void withdraw(double balance, double amount) {
        double withdrawalFee = 100;
        double totalDeduction = amount + withdrawalFee;
        double maxWithdrawable = balance * 0.9;

        if (amount > maxWithdrawable) {
            System.out.printf("You cannot withdraw more than 90%% of your balance (₦%.2f)\n", maxWithdrawable);
        } else if (balance - totalDeduction < 100) {
            System.out.println("Insufficient balance. At least ₦100 must remain in the account after withdrawal.");
        } else {
            balance -= totalDeduction;
            System.out.println("\n--- TRANSACTION SUCCESSFUL ---");
            System.out.println("Amount Withdrawn : " + amount);
            System.out.println("Withdrawal Fee   : " + withdrawalFee);
            System.out.println("Remaining Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your starting account balance : ");
        double balance = input.nextDouble();

        if (balance < 100) {
            System.out.println("You must start with at least ₦100.");
            return;
        }

        while (true) {
            System.out.println("\n=== WELCOME TO SEMICOLON ATM ===");
            System.out.println("1. Withdraw");
            System.out.println("2. View Transaction Log");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter withdrawal amount (₦): ");
                double amount = input.nextDouble();

                if (amount <= 0) {
                    System.out.println("Invalid input. Enter a positive number.");
                    continue;
                }

                if (amount % 500 != 0) {
                    System.out.println("Withdrawal must be in multiples of ₦500 or ₦1000.");
                    continue;
                }

                withdraw(balance, amount);

            } else if (choice == 2) {
                System.out.println("Transaction Log feature is not yet implemented.");
            } else if (choice == 3) {
                System.out.println("Thank you for using SEMICOLON ATM. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

       
    }
}

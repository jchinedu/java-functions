import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static List<Customer> accounts = new ArrayList<>();

    public static Customer createAccount(String name, String phoneNumber) {
        Customer acc = new Customer(name, phoneNumber);
        accounts.add(acc);
        return acc;
    }

    public static List<Customer> getName() {
        return new ArrayList<>(accounts); // return copy to avoid external modification
    }

    public static double deposit(String name, double amount, double balance) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return -1;
        }
        return balance + amount;
    }

    public static double withdraw(String name, double amount, double balance) {
        if (!accountExists(name)) {
            throw new IllegalArgumentException("Account not found.");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        return balance - amount;
    }

    public static List<Customer> getAllCustomers() {
        return new ArrayList<>(accounts);
    }

    public static Customer findCustomer(String identifier, String identifier2) {
        for (Customer acc : accounts) {
            if (acc.getName().equals(identifier) || acc.getPhoneNumber().equals(identifier2)) {
                return acc;
            }
        }
        return null;
    }

    private static boolean accountExists(String name) {
        for (Customer acc : accounts) {
            if (acc.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void resetBank() {
        accounts.clear();
    }
}

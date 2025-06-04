import java.util.Scanner;

public class SemicolonPayroll {

    static final int MAX_EMPLOYEES = 100;
    static String[] names = new String[MAX_EMPLOYEES];
    static double[] hours = new double[MAX_EMPLOYEES];
    static double[] rates = new double[MAX_EMPLOYEES];
    static double[] federalRates = new double[MAX_EMPLOYEES];
    static double[] stateRates = new double[MAX_EMPLOYEES];
    static int employeeCount = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            printMenu();
            System.out.print("Enter a number to select:  ");
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1 -> addEmployee(input);
                case 2 -> viewEmployees();
                case 3 -> updateEmployee(input);
                case 4 -> {
                    System.out.println("Exiting Payroll System...");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }

    static void printMenu() {
        System.out.println("\nWelcome to Semicolon Employees Payroll");
        System.out.println("====================================");
        System.out.println("1. Add employee payroll");
        System.out.println("2. View employees payroll");
        System.out.println("3. Update employee payroll");
        System.out.println("4. Exit");
        System.out.println("====================================");
    }

    static void addEmployee(Scanner input) {
        System.out.print("Enter employee name: ");
        String name = input.nextLine().toLowerCase();

        if (findEmployeeIndex(name) != -1) {
            System.out.println(name + " already exists");
            return;
        }

        System.out.print("Enter number of hours worked in a week: ");
        double h = input.nextDouble();
        if (h > 40) {
            System.out.println("oga, oga, oga, you cant work for more than 40 hours.");
            return;
        }

        System.out.print("Enter hourly pay rate: ");
        double r = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double fed = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double state = input.nextDouble();
        input.nextLine(); 

        System.out.print("Do you wish to continue or to go back? enter 1 to continue (1/0): ");
        String confirm = input.next();
        if (confirm.equalsIgnoreCase("b")) return;

        if (employeeCount >= MAX_EMPLOYEES) {
            System.out.println("Cannot add more employees.");
            return;
        }

        names[employeeCount] = name;
        hours[employeeCount] = h;
        rates[employeeCount] = r;
        federalRates[employeeCount] = fed;
        stateRates[employeeCount] = state;
        employeeCount++;

        System.out.println("Employee payroll added.");
    }

    static void viewEmployees() {
        if (employeeCount == 0) {
            System.out.println("No employees to display.");
            return;
        }

        for (int i = 0; i < employeeCount; i++) {
            double gross = hours[i] * rates[i];
            double fedWithhold = gross * (federalRates[i] / 100);
            double stateWithhold = gross * (stateRates[i] / 100);
            double totalDeduction = fedWithhold + stateWithhold;
            double netPay = gross - totalDeduction;

            System.out.println("\nEmployee name: " + names[i]);
            System.out.println("Hours worked: " + hours[i]);
            System.out.printf("Pay rate: $%.2f%n", rates[i]);
            System.out.printf("Gross pay: $%.2f%n", gross);
            System.out.println("Deduction:");
            System.out.printf("Federal withholding(%.1f%%): $%.2f%n", federalRates[i], fedWithhold);
            System.out.printf("State withholding(%.1f%%): $%.2f%n", stateRates[i], stateWithhold);
            System.out.printf("Total deduction: $%.2f%n", totalDeduction);
            System.out.printf("Net pay: $%.2f%n", netPay);
        }
    }

    static void updateEmployee(Scanner input) {
        System.out.print("Enter employee name to update: ");
        String name = input.nextLine().toLowerCase();

        int index = findEmployeeIndex(name);
        if (index == -1) {
            System.out.println("Employee does not exist.");
            return;
        }

        System.out.print("Enter new number of hours worked: ");
        double h = input.nextDouble();
        if (h > 40) {
            System.out.println("Error: Hours cannot exceed 40.");
            return;
        }

        System.out.print("Enter new hourly pay rate: ");
        double r = input.nextDouble();

        System.out.print("Enter new federal tax withholding rate: ");
        double fed = input.nextDouble();

        System.out.print("Enter new state tax withholding rate: ");
        double state = input.nextDouble();
        input.nextLine();

        hours[index] = h;
        rates[index] = r;
        federalRates[index] = fed;
        stateRates[index] = state;

        System.out.println("Employee payroll updated.");
    }

    static int findEmployeeIndex(String name) {
        for (int i = 0; i < employeeCount; i++) {
            if (names[i].equals(name)) return i;
        }
        return -1;
    }
}

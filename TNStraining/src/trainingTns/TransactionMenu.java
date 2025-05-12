package trainingTns;

import java.util.Scanner;

public class TransactionMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Select a payment method:");
        System.out.println("1. GPay");
        System.out.println("2. Cheque");
        System.out.println("3. Net Banking");
        System.out.print("Enter your choice (1/2/3): ");
        
        // Read the user's choice
        int choice = scanner.nextInt();
        
        // Handling each payment method
        switch (choice) {
            case 1: // GPay
                handleGPay(scanner);
                break;
            case 2: // Cheque
                handleCheque(scanner);
                break;
            case 3: // Net Banking
                handleNetBanking(scanner);
                break;
            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }
        
        scanner.close();
    }

    // Method to handle GPay transactions
    public static void handleGPay(Scanner scanner) {
        System.out.print("Enter the amount for GPay transaction: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter your GPay registered phone number: ");
        String phoneNumber = scanner.next();
        
        // Display transaction details
        System.out.println("Transaction initiated with GPay.");
        System.out.println("Amount: ₹" + amount);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Transaction successful!");
    }

    // Method to handle Cheque transactions
    public static void handleCheque(Scanner scanner) {
        System.out.print("Enter the amount for Cheque transaction: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the cheque number: ");
        String chequeNumber = scanner.next();
        System.out.print("Enter the bank name: ");
        String bankName = scanner.next();
        
        // Display transaction details
        System.out.println("Transaction initiated with Cheque.");
        System.out.println("Amount: ₹" + amount);
        System.out.println("Cheque Number: " + chequeNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Transaction successful!");
    }

    // Method to handle Net Banking transactions
    public static void handleNetBanking(Scanner scanner) {
        System.out.print("Enter the amount for Net Banking transaction: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter the bank name: ");
        String bankName = scanner.next();
        
        // Display transaction details
        System.out.println("Transaction initiated with Net Banking.");
        System.out.println("Amount: ₹" + amount);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Transaction successful!");
    }
}
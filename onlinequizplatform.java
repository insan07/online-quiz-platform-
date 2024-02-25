import java.util.Scanner;

public class onlinequizplatform 
{

    private static double balance = 0;
    private static Scanner scanner = new Scanner(System.in);

    private static void deposit() 
    {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited successfully.");
        } else 
        {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    private static void withdraw() 
    {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    private static void checkBalance()
    {
        System.out.println("Your balance: " + balance);
    }
    public static void main(String[] args) 
    {
        boolean quit = false;
        int choice;

        while (!quit) 
        {
            System.out.println("1. Deposit ");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice... Please enter a number between 1 and 4.");
            }
        }
    }
}

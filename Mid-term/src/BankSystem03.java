import java.util.Scanner;

public class BankSystem03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance;
        boolean exit = false;
        int attempt = 0;
        System.out.print("Insert your amount: ");
        balance = input.nextDouble();
        System.out.println("Hello user, your balance is $" + balance);

        while (!exit) {
            System.out.println("1. Deposit money.");
            System.out.println("2. Withdraw money.");
            System.out.println("3. Check balance.");
            System.out.println("4. Exit.");
            System.out.print("Choose menu: ");
            String menu = input.next();
            

            switch (menu) {
                case "1":
                    System.out.print("Enter Deposit Amount: ");
                    double amount = input.nextDouble();
                    if (amount <= 0) {
                        System.out.println("There should be a mistake");
                        attempt++;
                        
                    } else {
                        balance += amount;
                        System.out.printf("Deposit successful! Your new balance is $%.2f.\n", balance);
                        attempt = 0;
                    }
                    break;
                case "2":
                    System.out.print("How much do you want withdraw: ");
                    double withdraw = input.nextDouble();
                    if (withdraw <= balance && withdraw <= 500) {
                        balance -= withdraw;
                        System.out.printf("Alright, your new balance is $%.2f.\n", balance);
                        attempt = 0;
                        break;

                    } else {
                        System.out.println("Invalid withdrawal amount");
                        attempt++;
                        break;
                    }
                case "3":
                    System.out.printf("your balance right now is $%.2f.\n", balance);
                    attempt = 0;
                    break;
                case "4":
                    exit = true;
                    System.out.print("Happy to Help, Bye-bye :3");
                    attempt = 0;
                    break;
                default:
                    System.out.println("Sorry, Try again!");
                    return;
            }
            if (attempt ==3) {
                System.out.println("Account locked due to 3 unsuccessful transactions for security reasons.");
                exit = true;
            }
        }
        input.close();
    }
}
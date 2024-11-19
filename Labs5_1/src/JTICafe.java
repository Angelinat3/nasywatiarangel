import java.util.Scanner;
public class JTICafe {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        char cupSize;
        boolean membership;
        String menu;
        int amount;
        double discount, totalPrice, grantTotal;
        
        System.out.print("Enter the menu: ");
        menu = sc.nextLine(); 

        System.out.print("Enter the cup size: ");
        cupSize = sc.next().charAt(0);

        System.out.print("Enter the amount of item: ");
        amount = sc.nextInt();

        System.out.print("Is the customer our member? (true/false): ");
        membership = sc.nextBoolean();

        double itemPrice = 0;
    
        switch (menu.toLowerCase()) {
            case "coffee":
                itemPrice = 12000;
                break;
            case "tea":
                itemPrice = 7000;
            case "chocolate":
                itemPrice = 20000;
        }
        
         totalPrice = itemPrice * amount;

        switch (cupSize) {
            case 'S':
            case 'M':
                totalPrice += 0.25 * totalPrice;

            case 'L':
                totalPrice += 0.4 *totalPrice;

                discount = membership ? 0.1 :0;
                grantTotal = totalPrice - (discount *totalPrice);
       
                System.out.println("Purchased item: " +amount+ " " +menu+ " cup size " +cupSize);
                System.out.println("Grand Total: " +grantTotal);
                break;

            default:
            System.out.println ("unidentified cup size.");
            
        
        }
         sc.close();
    }   
}

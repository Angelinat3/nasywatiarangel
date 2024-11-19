import java.util.Scanner;

public class DoWhileLeaveEntitlement03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement, numLeave;
        String confirmation;
        System.out.print("Input The Number of Leave Entitlement: ");
        leaveEntitlement = input.nextInt();
        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("t")) {
                System.out.println("Exiting the program.");
                break;
            }

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = input.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                } else  {
                    System.out.println("You don't have enough leave entitlement. You have " + leaveEntitlement + " day(s) remaining.");
                    
                }
            }
        } while (leaveEntitlement > 0);
        input.close();
    }
}

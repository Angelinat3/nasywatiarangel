import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1, angle2, angle3;
        System.out.print("insert the 1st angle: ");
        angle1 = sc.nextInt();
        System.out.print("Insert the 2nd angle: ");
        angle2 = sc.nextInt();
        System.out.print("Insert the 3rd angle: ");
        angle3 = sc.nextInt();

        int result = angle1 + angle2 + angle3;
        System.out.println("okey the angles SUM = " +result);

         if (result != 180) {
            System.out.println("It's not triangle");
            return;
            }
            else  {
                if (angle1 == angle2 && angle2 == angle3) {
                    System.out.println( "The triangle is equiangular.");
                    System.exit(0);
                } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                    System.out.println("The triangle is right-angled.");
                    System.exit(0);
                } else if (angle1 > 90 || angle2 > 90 || angle3 > 90); {
                    System.out.println("The triangle is obtuse-angled.");
                    System.exit(0);
                } if(angle1 < 90 && angle2 < 90 && angle3 < 90) {
                    System.out.println("The triangle is acute-angled.");
                }
            return;
         }
    }    
}
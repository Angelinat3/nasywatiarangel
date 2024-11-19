import java.util.Scanner;

public class case3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int collom = scanner.nextInt();
        System.out.print("Enter the columns: ");
        int row = scanner.nextInt();
        for (int i = 0; i < collom; i++) {
            for (int j = 0; j < row; j++) {
                if (i == 0 || i == collom - 1 || j == 0 || j == row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  
                }
            }
            System.out.println();  
        }
        scanner.close();
    }
}

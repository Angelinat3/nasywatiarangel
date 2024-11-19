import java.util.Scanner;

public class case4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input a number: ");
        int rows = scanner.nextInt();
        char letter = 'A';  
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(letter + " ");  
                letter++;  
            }
            System.out.println();  
        }
        scanner.close();
    }
}

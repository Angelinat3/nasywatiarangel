import java.util.Scanner;

public class case2_modification {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println(); 
        }
        input.close();
    }
}

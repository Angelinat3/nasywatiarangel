import java.util.Scanner;

public class DisplayTwo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numinput;
        System.out.print("Input some number: ");
        numinput = input.nextInt();
        for (int i = 2; i <= numinput; i += 2) {
                System.out.printf(" %d ", i);
        }
        input.close();
    }
}

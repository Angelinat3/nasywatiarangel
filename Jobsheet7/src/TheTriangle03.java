import java.util.Scanner;

public class TheTriangle03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numinput;
        System.out.print("Input some number: ");
        numinput = input.nextInt();
        for (int i = numinput ; i > 0 ; i--) {
            String s = " ";
            for (int j = 0; j < i; j++){
            s += " *";
            }
            System.out.println(s);
            
        }
        input.close();
    }
}

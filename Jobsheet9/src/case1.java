import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numinput;
        String s = "";
        System.out.print("Input some number: ");
        numinput = input.nextInt();
        for (int i = 0; i < numinput; i++) {
            s += " *";
            System.out.println(s);
           
        }
        input.close();
    }
}

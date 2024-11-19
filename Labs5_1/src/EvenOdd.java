import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input an integer number: ");
        int number = sc.nextInt();
        String result = (number % 2 == 0)? "The " +number+ " Is even number" : "The " +number+ " Is odd number";
        System.out.println(result);
        sc.close();
    }
}

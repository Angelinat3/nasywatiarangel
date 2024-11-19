import java.util.Scanner;

public class OutputInput03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base, height, area;
       
        base = input.nextInt();
        height = input.nextInt();
        area = base * height / 2 ;

        System.out.println(area);
       
    }
}
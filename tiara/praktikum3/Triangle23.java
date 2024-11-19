import java.util.Scanner;

public class Triangle23 {


    public static void main(String[] args) {
        int base, height;
        float area;

        Scanner sc = new Scanner(System.in);

        System.out.println("*****WELCOME******");

        System.out.println("Input base :");
        base =  sc.nextInt();
        System.out.println("Input height :");
        height =  sc.nextInt();    
        
        
        area = base * height / 2;

        System.out.println("Are of the triangle : "+area);


        
    }
}

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("> java PartTwo");
        System.out.print("Enter temperature in F: ");
        double fahrenheit = scanner.nextDouble();
        double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
        
        System.out.println("The temperature in Kelvin is " + String.format("%.2f", kelvin));
        
    }
}



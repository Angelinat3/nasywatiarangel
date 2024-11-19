import java.util.Scanner;
public class CondWithIf03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();
  
    if (number >= 1 && number <6 ) {
    System.out.println("Weekday");

    }else if (number >=6 && number <7){
    System.out.println("Weekend");

    }else {
      System.out.println("Invalid number");

  sc.close();
}
}
}
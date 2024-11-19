import java.util.Scanner;

public class Part1 {

  public static void main(String[] args) {
      System.out.println("Welcome to Suniclo");
      System.out.println("==========================================================");
      System.out.println("Puchased Items");
      System.out.println("-----------------------------------------------------------");
      System.out.println("1. Men Oversize T-shirt Black L ");
      System.out.println("2. Airismi Polkadot Kids Sock");
      System.out.println("3. Unisex Casual Cap Cream ");
      System.out.println("4. Unisex Windbreaker Jacket Purple L");
      System.out.println("5. Men Heatechy Jogger Pants L ");
      System.out.println("6. Women Casual Blazer Navy M ");
      System.out.println("7. Women Ripped Jeans Casual Cut Navy M");
      System.out.println("----------------------------------------------------------");


      Scanner sc = new Scanner(System.in);

      int motb = 300000;
      int apks = 150000;
      int uccc = 200000;
      int uwjp = 350000;
      int mhjp = 500000;
      int wcbn = 800000;
      int wrjccn = 1200000;
      int total;
       
        

      double discount2 = 0.05;
      double discount4 = 0.15;
      double discount5 = 0.175;
      double result1, result2, result3, result4, result5, result6, result7, grand_Total;
      double fdiscount;
      total = motb + apks + uccc + uwjp + mhjp + wcbn + wrjccn;
      result1 = motb * discount2;
      result4 = uwjp * discount2;
      result5 = mhjp * discount2;
      result6 = wcbn * discount4;
      result7 = wrjccn * discount5;
      fdiscount = result1 + result4 + result5 + result6 + result7 ; //discount

     
      grand_Total = total - fdiscount;
      
    System.out.println( "Total \t\t: IDR " + total);
    System.out.println("Dicount \t: IDR " + fdiscount);
    System.out.println("Grand Total \t: IDR " + grand_Total);
    
    }
}
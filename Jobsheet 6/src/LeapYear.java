import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int tahun;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tahun : ");
        tahun = sc.nextInt();
        if (tahun % 400 == 0) {
          System.out.print(" Tahun Kabisat");
        } else if (tahun % 100 == 0) {
          System.out.print(" Bukan Tahun Kabisat");
        } else if (tahun % 4 == 0) {
          System.out.print("Tahun Kabisat");
        } else {
          System.out.print(" Bukan Tahun Kabisat");
       }
      sc.close();
}
}


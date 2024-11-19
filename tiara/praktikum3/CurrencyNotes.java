import java.util.Scanner;

public class CurrencyNotes {

    public static void main(String[] args) {
        // Deklarasi pecahan uang
        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 1};
        // Array untuk menyimpan jumlah lembar dari setiap pecahan
        int[] notesCount = new int[denominations.length];
        // Input jumlah uang
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang: ");
        int amount = scanner.nextInt();
        // Loop melalui setiap denominasi untuk menghitung lembar yang dibutuhkan
        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                notesCount[i] = amount / denominations[i]; // Hitung berapa lembar
                amount = amount % denominations[i]; // Kurangi amount dengan nilai yang telah diambil
            }
        }
        // Cetak hasil
        System.out.println("Jumlah minimum lembar yang dibutuhkan:");
        for (int i = 0; i < denominations.length; i++) {
            if (notesCount[i] != 0) {
                System.out.println(denominations[i] + " : " + notesCount[i] + " lembar");
            }
        }
        scanner.close();
    }
}
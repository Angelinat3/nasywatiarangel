import java.util.Scanner;
public class GradeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerical grade (Nilai Angka): ");
        double nilaiAngka = scanner.nextDouble();

        String nilaiHuruf;

        if (nilaiAngka > 80 && nilaiAngka <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAngka > 73 && nilaiAngka <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAngka > 65 && nilaiAngka <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAngka > 60 && nilaiAngka <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAngka > 50 && nilaiAngka <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAngka > 39 && nilaiAngka <= 50) {
            nilaiHuruf = "D";
        } else if (nilaiAngka <= 39) {
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "Invalid Grade";
        }
        System.out.println("Alphabetical Grade (Nilai Huruf): " + nilaiHuruf);

        scanner.close();
    }
}
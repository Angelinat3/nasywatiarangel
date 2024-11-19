import java.util.Scanner;

public class SIAKAD03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, kualifikasi;
        Integer tugas, ujian, kuis, absen, kelas, nim, nilaiakhir;

        System.out.print("Masukkan nama: ");
        name = sc.nextLine();

        System.out.println("Masukkan NIM: ");
        nim = sc.nextInt();

        System.out.println("Masukkan kelas: ");
        kelas = sc.nextInt();

        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextInt();

        System.out.println("Masukkan nilai kuis: ");
        kuis = sc.nextInt();

        System.out.println("Masukkan nilai tugas: ");
        tugas = sc.nextInt();

        System.out.println("Masukkan nilai ujian: ");
        ujian = sc.nextInt();

        System.out.println("Mahasiswa dengan nama " + name + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);

        nilaiakhir = (kuis + tugas + ujian) / 3;
        System.out.println("Nilai akhir: " + nilaiakhir);
        System.out.print("Nilai akhir huruf: ");

        if (nilaiakhir > 80 && nilaiakhir <= 100) {
            System.out.print("A");
            kualifikasi = "A";
        } else if (nilaiakhir >= 73 && nilaiakhir <= 80) {
            System.out.print("B+");
            kualifikasi = "B+";
        } else if (nilaiakhir >= 65 && nilaiakhir <= 73) {
            System.out.print("B");
            kualifikasi = "B";
        } else if (nilaiakhir >= 60 && nilaiakhir <= 65) {
            System.out.print("C+");
            kualifikasi = "C+";
        } else if (nilaiakhir >= 50 && nilaiakhir <= 60) {
            System.out.print("C");
            kualifikasi = "C";
        } else if (nilaiakhir >= 39 && nilaiakhir <= 50) {
            System.out.print("D");
            kualifikasi = "D";
        } else {
            System.out.print("E");
            kualifikasi = "E";
        }

        System.out.println("Kualifikasi: ");
        switch (kualifikasi) {
            case "A":
                System.out.print("Sangat Baik");
                break;
            case "B":
                System.out.print("Lebih dari Baik");
                break;
            case "B+":
                System.out.print("Baik");
                break;
            case "C+":
                System.out.print("Lebih dari Cukup");
                break;
            case "C":
                System.out.print("Cukup");
                break;
            case "D":
                System.out.print("Kurang");
                break;
            case "E":
                System.out.print("Gagal");
                break;
        }
    }
}
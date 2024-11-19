import java.util.Scanner;
public class JTICafe03 {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String member;
        Double diskon, harga, menu, total_bayar= 0.00, pembayaran, Qris= 1000.0, bayarqris; 
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        menu = sc.nextDouble();
        sc.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = sc.nextLine();
        System.out.println("-----------------------------------");
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu == 1) {
                harga = 14000.0;
                System.out.println("Harga ricebowl = " + harga);
            } else if (menu == 2) {
                harga = 3000.0;
                System.out.println("Harga ice tea = " + harga);
            } else if (menu == 3) {
                harga = 15000.0;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                sc.close();
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar); }

        else if  (member.equalsIgnoreCase("n")) {
                if (menu == 1) {
                    harga = 14000.0;
                    System.out.println("Harga ricebowl = " + harga);
                } else if (menu == 2) {
                    harga = 3000.0;
                    System.out.println("Harga ice tea = " + harga);
                } else if (menu == 3) {
                    harga = 15000.0;
                    System.out.println("Harga bundling = " + harga);
                } else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    sc.close();
                    return;
                    
                }
                System.out.println("Total bayar = " + harga); }
            else {
                System.out.println("Member tidak valid");
            }
            System.out.println("----------------------------------------");
            
            System.out.println("Pilih pembayaran dengan nomor : " );
            System.out.println("1. Qris");
            System.out.println("2. Tunai");
            System.out.println("3. Debit");
            pembayaran = sc.nextDouble();
        if (pembayaran == 1) {
                bayarqris = total_bayar - Qris; System.out.println("Total bayar setelah potongan QRIS = " + bayarqris);
            } else if (pembayaran == 2 || pembayaran == 3) {
                System.out.println("Total bayar = " + total_bayar);
            } else {
                System.out.println("Metode pembayaran tidak valid");
            }

    } 
} 

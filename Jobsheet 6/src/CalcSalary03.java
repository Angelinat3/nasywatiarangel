import java.util.Scanner;
public class CalcSalary03 {
    public static void main(String[] args) {
        Scanner noAbsen = new Scanner(System.in);
        String kategori;
        int Penghasilan, gajiBersih;
        double pajak = 0;
        System.out.print("Masukkan Kategori : ");
        kategori = noAbsen.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        Penghasilan = noAbsen.nextInt();
        if (kategori.equals("pekerja")) {
            if (Penghasilan <= 2000000)
                pajak = 0.1;
                else if (Penghasilan <= 3000000)
                    pajak = 0.15;
                else
                    pajak = 0.2;
                gajiBersih = (int) (Penghasilan - (pajak *Penghasilan));
                System.out.print("Penghasil Bersih : " + gajiBersih);
        } else if (kategori.equals("pebisnis")){
            if (Penghasilan <= 2500000)
                pajak = 0.15;
            else if (Penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (Penghasilan - (pajak * Penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih); 
        } else
            System.out.println("Masukkan Kategori Salah");
        noAbsen.close();
            }
        }
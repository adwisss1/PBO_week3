package week3.Perulangan;
import java.util.Scanner;

public class total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah hari parkir: ");
        int hari = scanner.nextInt();
        scanner.nextLine();

        String[] kendaraanPerHari = new String[hari];
        for (int i = 0; i < hari; i++) {
            System.out.print("Hari ke-" + (i+1) + ", jenis kendaraan (mobil/motor): ");
            kendaraanPerHari[i] = scanner.nextLine();
        }

        hariKendaraan hk = new hariKendaraan();
        int total = hk.hitungTotal(hari, kendaraanPerHari);

        System.out.println("Total biaya parkir selama " + hari + " hari adalah: Rp " + total);
        scanner.close();
    }
}
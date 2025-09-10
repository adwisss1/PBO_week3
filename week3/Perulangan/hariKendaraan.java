package week3.Perulangan;

public class hariKendaraan {
    public int hitungTotal(int hari, String[] kendaraanPerHari) {
        int total = 0;
        for (int i = 0; i < hari; i++) {
            if (kendaraanPerHari[i].equalsIgnoreCase("mobil")) {
                total += 20000;
            } else if (kendaraanPerHari[i].equalsIgnoreCase("motor")) {
                total += 10000;
            }
        }
        return total;
    }
}
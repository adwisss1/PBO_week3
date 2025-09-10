package week3.input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.println("Nama yang dimasukkan: " + nama);
        scanner.close();
    }
}

import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan operasi (+, -, *, /): ");
        String operasiInput = scanner.nextLine();
        System.out.print("Masukkan nilai pertama: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        int b = scanner.nextInt();

        Operasi op = new Operasi(0);
        switch(operasiInput) {
            case "+":
                System.out.println("Hasil: " + a + " + " + b + " = " + op.tambah(a, b));
                break;
            case "-":
                System.out.println("Hasil: " + op.kurang(a, b));
                break;
            case "*":
                System.out.println("Hasil: " + op.kali(a, b));
                break;
            case "/":
                System.out.println("Hasil: " + op.bagi(a, b));
                break;
            default:
                System.out.println("Operasi tidak dikenali.");
        }
        scanner.close();
    }
}
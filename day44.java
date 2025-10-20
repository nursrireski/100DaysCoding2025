import java.util.Scanner;
public class day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Cek Kelipatan 3 dan 5 ===");
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan 3 dan 5.");
        } else if (angka % 3 == 0) {
            System.out.println(angka + " adalah kelipatan 3.");
        } else if (angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan 5.");
        } else {
            System.out.println(angka + " bukan kelipatan 3 maupun 5.");
        }
    }
}

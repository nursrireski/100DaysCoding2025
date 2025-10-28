

import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        // Perulangan dari 1 sampai 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + angka + " = " + (i * angka));
        }
    }
}

import java.util.Scanner;

public class day90 {

    // Method untuk mencari nilai terbesar
    static int maxx(int a, int b) {
        return (a > b) ? a : b;
    }

    // Method untuk mencari nilai terkecil
    static int minn(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("      PROGRAM PENCARI MAX & MIN       ");
        System.out.println("======================================");

        System.out.print("Masukkan bilangan pertama : ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua   : ");
        int angka2 = input.nextInt();

        int nilaiMax = maxx(angka1, angka2);
        int nilaiMin = minn(angka1, angka2);

        System.out.println("--------------------------------------");
        System.out.println("Nilai Maksimum : " + nilaiMax);
        System.out.println("Nilai Minimum  : " + nilaiMin);
        System.out.println("======================================");
    }
}

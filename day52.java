import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka = -1; 
        int total = 0;

        // Perulangan akan berhenti ketika angka == 0
        while (angka != 0) {
            System.out.print("Masukkan angka (atau 0 untuk berhenti): ");
            angka = sc.nextInt();

            total += angka; 
        }

        System.out.println("Total penjumlahan: " + total);
    }
}

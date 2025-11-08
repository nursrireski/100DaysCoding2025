import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, total = 0;

        System.out.print("Masukkan batas angka (N): ");
        N = input.nextInt();

        System.out.print("Proses penjumlahan: ");
        for (int i = 1; i <= N; i++) {
            total += i; // menambahkan setiap angka ke total
            System.out.print(i); 
            if (i < N) {
                System.out.print(" + "); // memberi tanda tambah di antara angka
            }
        }

        System.out.println(" = " + total);
        System.out.println("Total penjumlahan dari 1 sampai " + N + " adalah: " + total);
    }
}

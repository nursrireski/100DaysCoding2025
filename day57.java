import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran persegi: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {           // perulangan baris
            for (int j = 1; j <= n; j++) {       // perulangan kolom
                // Kondisi untuk membuat persegi bolong
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");       // sisi luar
                } else {
                    System.out.print("  ");       // bagian dalam bolong
                }
            }
            System.out.println(); // pindah ke baris baru
        }
    }
}

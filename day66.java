import java.util.Scanner;

public class day66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (N): ");
        int N = input.nextInt();

        // Mencetak pola vertikal sebanyak N baris
        for (int i = 1; i <= N; i++) {
            System.out.println(".");
        }
    }
}

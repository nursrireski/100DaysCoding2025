import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka (N): ");
        int N = input.nextInt();

        System.out.print("\nAngka Ganjil: ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) { // jika sisa bagi 2 adalah 1, berarti ganjil
                System.out.print(i + " ");
            }
        }

        System.out.print("\nAngka Genap: ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) { // jika sisa bagi 2 adalah 0, berarti genap
                System.out.print(i + " ");
            }
        }

        
    }
}

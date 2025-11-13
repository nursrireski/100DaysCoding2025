import java.util.Scanner;
public class day67 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan tinggi pola (N): ");
        int n = i.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.print(".");
        }
    }
}

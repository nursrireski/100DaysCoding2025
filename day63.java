import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Masukkan batas angka (N): ");
        int N = input.nextInt();
        int total = 1;
        for (int i = 1; i <= N; i++) {
            total *= i; 
            System.out.print(i); 
            if (i < N) {
                System.out.print(" x "); 
            }
        }
        System.out.println(" = " + total);
        System.out.println("Total Perkalian dari 1 sampai " + N + " adalah: " + total);
    }
}

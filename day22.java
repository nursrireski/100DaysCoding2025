
import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG LUAS PERSEGI ===");
        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = input.nextInt();

        int luas = sisi * sisi;

        System.out.println("-----------------------------");
        System.out.printf("Sisi persegi   : %d%n", sisi);
        System.out.printf("Luas persegi   : %d%n", luas);
    }
}  


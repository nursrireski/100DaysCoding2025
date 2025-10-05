
import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka 1: ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka 2: ");
        int angka2 = sc.nextInt();
        boolean sama = (angka1 == angka2);
        boolean tidakSama = (angka1 != angka2);
        
        System.out.println("Apakah "+angka1+" sama dengan "+angka2+"? "+sama);
        System.out.println("Apakah "+angka1+" tidak sama dengan "+angka2+"? "+tidakSama);
    }
    
}

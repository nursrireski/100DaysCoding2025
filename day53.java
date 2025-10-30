import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Masukkan angka (1-3): ");
        int angka = sc.nextInt();
        System.out.println("break dalam switch case: ");
        switch (angka) {
            case 1:
                System.out.println("Kamu memilih angka 1");
                break; // menghentikan eksekusi switch setelah case 1
            case 2:
                System.out.println("Kamu memilih angka 2");
                break; // menghentikan eksekusi switch setelah case 2
            case 3:
                System.out.println("Kamu memilih angka 3");
                break; // menghentikan eksekusi switch setelah case 3
            default:
                System.out.println("Angka tidak valid!");
        
        }
        System.out.println("\nbreak dalam perulangan:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Perulangan ke-" + i);

            if (i == 5) {
                System.out.println("Break dijalankan! Perulangan berhenti di angka " + i);
                break; // menghentikan loop ketika i == 5
            }
        }

        System.out.println("\nProgram selesai dijalankan. Terima kasih!");
    }
}
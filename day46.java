import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menu Pilihan ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Ayam Bakar");
        System.out.println("4. Es Teh");
        System.out.println("====================");

        System.out.print("Masukkan pilihan menu (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih Nasi Goreng ");
                break;
            case 2:
                System.out.println("Kamu memilih Mie Goreng ");
                break;
            case 3:
                System.out.println("Kamu memilih Ayam Bakar ");
                break;
            case 4:
                System.out.println("Kamu memilih Es Teh ");
                break;
            default:
                System.out.println("Menu tidak tersedia, silakan pilih 1-4 saja.");
        }

        
    }
}

import java.util.Scanner;
public class day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        int total = 0;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Nasi Kuning      Rp 10.000");
            System.out.println("2. Es Teh Panas     Rp 5.000");
            System.out.println("3. Kopi Susu        Rp 5.000");
            System.out.println("4. Bakso Kuah       Rp 10.000");
            System.out.println("5. Selesaikan Pembayaran");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    total += 10000;
                    System.out.println(">> Nasi Kuning ditambahkan");
                    break;
                case 2:
                    total += 5000;
                    System.out.println(">> Es Teh Panas ditambahkan");
                    break;
                case 3:
                    total += 5000;
                    System.out.println(">> Kopi Susu ditambahkan");
                    break;
                case 4:
                    total += 10000;
                    System.out.println(">> Bakso Kuah ditambahkan");
                    break;
                case 5:
                    if (total == 0) {
                        System.out.println("Anda tidak jadi belanja.");
                    } else {
                        System.out.println("\nTotal belanja anda: Rp " + total);
                    }
                    break;
                default:
                    System.out.println(">> Pilihan tidak tersedia!");
            }

        } while (pilihan != 5);
    }
}

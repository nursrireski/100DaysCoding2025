import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int angka = input.nextInt();

        // Mengecek angka dan mencetak nama hari
        switch (angka) {
            case 1:
                System.out.println("Sekarang adalah hari Senin");
                break;
            case 2:
                System.out.println("Sekarang adalah hari Selasa");
                break;
            case 3:
                System.out.println("Sekarang adalah hari Rabu");
                break;
            case 4:
                System.out.println("Sekarang adalah hari Kamis");
                break;
            case 5:
                System.out.println("Sekarang adalah hari Jumat");
                break;
            case 6:
                System.out.println("Sekarang adalah hari Sabtu");
                break;
            case 7:
                System.out.println("Sekarang adalah hari Minggu");
                break;
            default:
                System.out.println("Jumlah hari hanya 7");
        }

        
    }
}

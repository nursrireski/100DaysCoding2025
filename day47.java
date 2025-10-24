import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int angka = input.nextInt();

        String hari = "";
        String status = "";

        switch (angka) {
            case 1:
                hari = "Senin";
                status = "Hari Kerja";
                break;
            case 2:
                hari = "Selasa";
                status = "Hari Kerja";
                break;
            case 3:
                hari = "Rabu";
                status = "Hari Kerja";
                break;
            case 4:
                hari = "Kamis";
                status = "Hari Kerja";
                break;
            case 5:
                hari = "Jumat";
                status = "Hari Kerja";
                break;
            case 6:
                hari = "Sabtu";
                status = "Hari Libur";
                break;
            case 7:
                hari = "Minggu";
                status = "Hari Libur";
                break;
            default:
                System.out.println("Jumlah hari hanya 7!");
                return;
        }

        System.out.println("Sekarang adalah hari " + hari + " (" + status + ")");
    }
}

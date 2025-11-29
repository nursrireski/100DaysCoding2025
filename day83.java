import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] pengeluaran = new int[7];
        int total = 0;

        System.out.println("Masukkan pengeluaran jajan selama 7 hari:");

        for (int i = 0; i < pengeluaran.length; i++) {
            System.out.print("Hari ke-" + (i + 1) + ": Rp ");
            pengeluaran[i] = input.nextInt();
            total += pengeluaran[i];
        }

        System.out.println("\n--- Rincian Pengeluaran ---");

        for (int i = 0; i < pengeluaran.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": Rp " + pengeluaran[i]);
        }

        System.out.println("---------------------------");
        System.out.println("Total Pengeluaran Seminggu: Rp " + total);
    }
}

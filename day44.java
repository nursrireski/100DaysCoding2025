import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Penilaian Mahasiswa ===");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nama mata kuliah: ");
        String mataKuliah = input.nextLine();

        System.out.print("Masukkan nilai (0 - 100): ");
        double nilai = input.nextDouble();

        String predikat;

        if (nilai > 90 && nilai <= 100) {
            predikat = "A";
        } else if (nilai > 80 && nilai <= 90) {
            predikat = "B";
        } else if (nilai > 70 && nilai <= 80) {
            predikat = "C";
        } else if (nilai > 60 && nilai <= 70) {
            predikat = "D";
        } else if (nilai <= 60 && nilai >= 0) {
            predikat = "E";
        } else {
            predikat = "Nilai tidak valid";
        }

        System.out.println();
        System.out.println("=== Hasil Pembelajaran Selama 1 Semester ===");
        System.out.println("Nama           : " + nama);
        System.out.println("Mata Kuliah    : " + mataKuliah);
        System.out.println("Nilai Angka    : " + nilai);
        System.out.println("Predikat Nilai : " + predikat);

        
    }
}

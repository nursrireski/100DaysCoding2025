import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("=== PROGRAM EKSPERIMEN TERNARY OPERATOR ===\n");

        //contoh pada tipe data int
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        String hasilAngka = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " adalah: " + hasilAngka + "\n");

        // contoh pada tipe data double
        System.out.print("Masukkan nilai ujian (0-100): ");
        double nilai = input.nextDouble();
        String a = (nilai >= 90) ? "A (Istimewa)"
                    : (nilai >= 80) ? "B (Baik)"
                    : (nilai >= 70) ? "C (Cukup)"
                    : "D (Perlu belajar lagi)";
        System.out.println("Nilai kamu " + nilai + " mendapat grade: " + a + "\n");

        // contoh pada tipe data boolean
        System.out.print("Apakah kamu sudah login? (true/false): ");
        boolean login = input.nextBoolean();
        String status = login ? "Kamu sudah login, selamat datang!"
                              : "Kamu belum login, silakan masuk dulu.";
        System.out.println("️Status login: " + status + "\n");

        // contoh pada operasi matematis
        System.out.print("Masukkan angka pertama: ");
        int b = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int c = input.nextInt();
        int terbesar = (b > c) ? b : c;
        System.out.println("Nilai terbesar antara " + b + " dan " + c + " adalah: " + terbesar + "\n");

        // contoh pada tipe data string
        System.out.print("Masukkan waktu (1 = pagi, 2 = siang, 3 = sore, 4 = malam): ");
        int waktu = input.nextInt();
        String aktivitas = (waktu == 1) ? "Sarapan dan berangkat sekolah"
                         : (waktu == 2) ? "Istirahat dan makan siang"
                         : (waktu == 3) ? "Waktu berolahraga"
                         : "Waktunya istirahat dan tidur";
        System.out.println("Aktivitas kamu sekarang: " + aktivitas + "\n");

        // contoh yang menghasilkan nilai selain true atau false
        System.out.print("Masukkan suhu ruangan (C): ");
        float suhu = input.nextInt();
        String kondisi = (suhu < 20) ? "Dingin ️"
                        : (suhu <= 30) ? "Nyaman ️"
                        : "Panas ";
        System.out.println("Suhu " + suhu + " C terasa: " + kondisi);

        System.out.println("\n=== PROGRAM SELESAI ===");
        
    }
}


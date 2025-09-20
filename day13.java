
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Evaluasi 1");
        System.out.print("Judul : ");
        final String JUDUL = sc.nextLine();
        System.out.print("Masukkan Tahun: " );
        short tahun = sc.nextShort();
        System.out.print("Masukkan Jarak: ");
        byte jarak = sc.nextByte();
        System.out.print("Masukkan harga: ");
        int harga = sc.nextInt();
  System.out.print("Masukkan Jumlah Kota : ");
        char kota = sc.next().charAt(0);
        System.out.print("Masukkan Jumlah hari: ");
        float waktu = sc.nextFloat();
         System.out.print("Masukkan Kecepatan : ");
        double kecepatan = sc.nextDouble();
       System.out.print("Masukkan Total Biaya: ");
        long perjalan = sc.nextLong();
        System.out.print("Status Perjalan (true/false): ");
        boolean statusPerjalanan = sc.hasNextBoolean();
        
        System.out.println("Judul : "+JUDUL);
        System.out.println("Pada tahun "+tahun+", seorang mahasiswi bernama Dina melakukan perjalanan sejauh "+jarak+" km hanya demi makan ayam geprek seharga "+harga
        +" rupiah.\nia mengunjungi "+kota+" kota dengan menggunakan kendaraan berinisial M. Perjalanan tersebut memakan waktu "+waktu+" dengan rata-rata kecepatan "+kecepatan
        +"\ntotal biaya perjalanan mencapai "+perjalan +" rupiah.");
        System.out.println("Status Perjalanan : "+ statusPerjalanan);
    }
    
}

// soal 2

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Universitas : ");
        String univ = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Semester : ");
        short semester = sc.nextShort();
        System.out.print("Masukkan Jumlah SKS: ");
        int sks = sc.nextInt();
        System.out.print("Masukkan Tahun Masuk : ");
        int tahun = sc.nextInt();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        System.out.print("Masukkan Tinggi Badan: ");
        double tinggi = sc.nextDouble();
        System.out.print("Masukkan Gender (L/P): ");
        char gender = sc.next().charAt(0);
        System.out.print("Masukkan Perkuliahan: ");
        boolean status = sc.hasNextBoolean();
        
        System.out.println("=====BIODATA MAHASISWA=====");
        System.out.printf("%-15s : %-10s %n","Universitas ", univ);
        System.out.printf("%-15s : %-10s %n","Nama ",nama);
        System.out.printf("%-15s : %-10s %n","NIM ",nim);
        System.out.printf("%-15s : %-10d %n","Semester ",semester);
        System.out.printf("%-15s : %-10d %n","Jumlah SKS ",sks);
        System.out.printf("%-15s : %-10d %n","Tahun Masuk ",tahun);
        System.out.printf("%-15s : %-10f %n","IPK ",ipk);
        System.out.printf("%-15s : %-10f %n","Tinggi Badan ",tinggi);
        System.out.printf("%-15s : %-10c %n","Jenis Kelamin ",gender);
        System.out.printf("%-15s : %-10b %n","Status Aktif ",status);
    
    }
}
//soal 3
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai: ");
        double nilair = sc.nextDouble();
        final double phi = 3.14;
        double luasL = phi*(nilair*nilair);
        double keliling =( 2* phi)*nilair;
        
        System.out.println("Jadi, luas Lingkaran adalah "+luasL+"cm2 dan keliling lingkaran adalah "+keliling+"cm jika nilai r- nya adalah "+nilair+"cm");
        
        System.out.print("Masukkan lagi nilai: ");
        nilair = sc.nextDouble();
         
         luasL = phi*(nilair*nilair);
         keliling = 2* phi*nilair;
         System.out.println("jika nilai r kali ini adalah "+nilair+"cm, maka luas lingkaran adalah "+luasL+"cm2 dan keliling lingkaran adalah "+keliling+"cm");

        
        
    }
    
}


import java.util.Scanner;
public class day16 {
    public static void main(String[] args) {   
        /*
 Tugas commitan pada hari ini adalah soal cerita yaitu
Untuk acara liburan akhir semester, prodimu menyewa X bus untuk pergi ke sebuah taman rekreasi. 
Diketahui bahwa setiap bus memiliki kapasitas final 50 kursi penumpang.
Total biaya final sewa untuk 1 bus tersebut adalah Rp 7.500.000.
( X adalah angka inputan )
Buatlah program untuk menghitung dua hal:
1. Berapa total kapasitas penumpang dari semua bus yang disewa?
2. Jika biaya sewa dibagikan rata sesuai total kapasitas penumpang, berapa biaya per kursi/penumpang?
        */
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai X : ");
    int X = sc.nextInt();
    final int KAPASITAS = 50;
    final int SEWA_SATU_BUS = 7500000;
    int kapasitasSemuaBus = KAPASITAS * X;
    int sewaKursiPenumpang = (X * SEWA_SATU_BUS) / kapasitasSemuaBus;
    
        System.out.println("Total Kapasitas Penumpang dari semua BUS yang di sewa: "+ kapasitasSemuaBus);
        System.out.println("Total biaya Per Kursi Penumpang: "+ sewaKursiPenumpang);
}
}
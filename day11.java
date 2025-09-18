import java.util.Scanner;
public class day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=====FORMULIR PENDAFTARAN KRU BAJAK LAUT TOPI JERAMI=====");
        //String
        System.out.print("Masukkan nama Bajak Laut: ");
        String nama = sc.nextLine();
        
        //byte
        System.out.print("Umur: ");
        byte umur = sc.nextByte();
        
        //short
        System.out.print("Tahun Pertama Berlayar: ");
        short tahunBerlayar = sc.nextShort();
        
        //int
        System.out.print("Nomor Bounty: ");
        int bounty = sc.nextInt();
        
        //long
        System.out.print("Nomor Den Den Mushi: ");
        long denDen =sc.nextLong();
        
        //float
        System.out.print("Tinggi Kapal (Float): ");
        float tinggiKapal = sc.nextFloat();
        
        //double
        System.out.print("Jumlah Berry yang dimiliki (Double): ");
        double berry = sc.nextDouble();
        
        //boolean
        System.out.print("Apakah sudah bisa membaca Poneglyph? (true/false): ");
        boolean poneglyph = sc.nextBoolean();
        sc.nextLine();
        //char(khusus)
        System.out.print("Masukkan ABCDEF sebagai kode rahasia Harta Karung: ");
        String kodeRahasia = sc.nextLine();
        char hurufKunci = kodeRahasia.charAt(2);
        
        
        System.out.println("\n==========DATA PENDAFTARAN KRU==========");
        System.out.printf("%-25s : %s%n", "NAMA BAJAK LAUT", nama);
        System.out.printf("%-25s : %d Tahun%n", "UMUR", umur);
        System.out.printf("%-25s : %d%n", "TAHUN BERLAYAR", tahunBerlayar);
        System.out.printf("%-25s : %d Berry%n", "BOUNTY", bounty);
        System.out.printf("%-25s : %s%n", "DEN DEN MUSHI", denDen);
        System.out.printf("%-25s : %.2f Meter%n", "TINGGI KAPAL", tinggiKapal);
        System.out.printf("%-25s : %.2f Berry%n", "HARTA BERRY", berry);
        System.out.printf("%-25s : %b%n", "BISA BACA PONEGLYPH", poneglyph);
        System.out.printf("%-22s : %c%n", "HURUF KUNCI HARTA KARUNG", hurufKunci);
        System.out.println();
        System.out.println("Selamat "+ nama + " Kamu Resmi Menjadi bagian KRU Topi Jerami");

    }
}

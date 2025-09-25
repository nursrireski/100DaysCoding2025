public class day18 {
    public static void main(String[] args) {
        /*

Kamu adalah seorang kasir di sebuah toko dan sedang menghitung total belanjaan. 
Pelanggan membeli 1 Roti , 1 Susu , 1 Beras , 1 Minyak goreng dan 6 Frozen food, 
belanjaannya dikenai pajak 10% untuk total barang yang dibelinya dan 1% pajak 
untuk tiap barang yang dibelinya.
Diketahui 
Harga Roti = 16500
Harga susu = 65000
Harga beras = 55000
Harga minyak goreng = 43500
Harga Frozen food = 20000
        */
        // Harga barang
        int hargaRoti = 16500;
        int hargaSusu = 65000;
        int hargaBeras = 55000;
        int hargaMinyak = 43500;
        int hargaFrozen = 20000;

        // Jumlah barang
        int jumlahRoti = 1;
        int jumlahSusu = 1;
        int jumlahBeras = 1;
        int jumlahMinyak = 1;
        int jumlahFrozen = 6;

        
        int totalHarga = (hargaRoti * jumlahRoti) +
                         (hargaSusu * jumlahSusu) +
                         (hargaBeras * jumlahBeras) +
                         (hargaMinyak * jumlahMinyak) +
                         (hargaFrozen * jumlahFrozen);
        
        
        double pajak_10 = totalHarga * 0.10;
        double pajak_1 = totalHarga * 0.01;
        double totalBayar = totalHarga + pajak_10 + pajak_1;
        
       
        System.out.println("======= Struk Belanja =======");
        System.out.println("Total harga barang : Rp " + totalHarga);
        System.out.println("Pajak 10%          : Rp " + pajak_10);
        System.out.println("Pajak 1%/barang    : Rp " + pajak_1);
        System.out.println("-----------------------------");
        System.out.println("Total yang dibayar : Rp " + totalBayar);
    
         }
    
}

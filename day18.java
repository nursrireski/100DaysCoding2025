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
        int jumlahBarang = 1+1+1+1+6;
        int hargaBarang = 16500+65000+55000+43500+(20000*6);
        double pajak_10 = hargaBarang * 0.10;
        double pajak_1 = hargaBarang * 0.01;
        double totalBayar = hargaBarang + pajak_10+pajak_1;
        
       
        System.out.println("======= Struk Belanja =======");
        System.out.println("Total harga barang : Rp " + hargaBarang);
        System.out.println("Pajak 10%          : Rp " + pajak_10);
        System.out.println("Pajak 1%/barang    : Rp " + pajak_1);
        System.out.println("-----------------------------");
        System.out.println("Total yang dibayar : Rp " + totalBayar);
    
         }
    
}

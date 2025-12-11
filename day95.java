public class day95 {

    static void gambarSegitiga(int tinggi, char simbol) {
        System.out.println("Segitiga Tinggi " + tinggi + " | Simbol: " + simbol);

        for (int i = 1; i <= tinggi; i++) {     // Loop baris
            for (int j = 1; j <= i; j++) {     // Loop kolom (bertambah tiap baris)
                System.out.print(simbol + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------");
    }

    
    static void cetakStruk(String namaBarang, int harga, int jumlah) {
        int total = harga * jumlah;

        System.out.println("Barang : " + namaBarang);
        System.out.println("Qty    : " + jumlah + " x " + harga);
        System.out.println("Total  : Rp " + total);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        
        gambarSegitiga(5, '*');
        gambarSegitiga(3, '$');
        gambarSegitiga(7, '#');

        
        cetakStruk("Indomie Goreng", 3500, 3);
        cetakStruk("Teh Botol Sosro", 5000, 2);
        cetakStruk("Beras 5kg", 60000, 1);
    }
}

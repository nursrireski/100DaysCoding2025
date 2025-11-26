public class day80 {
    public static void main(String[] args) {
        // Array berisi 5 karakter anime favorit pilihanmu
        String[] karakter = {
            "Monkey D. Luffy",        
            "Roronoa Zoro",           
            "Naruto Uzumaki",         
            "Sasuke Uchiha",          
            "Mukouda Tsuyoshi"        
        };

        // Cetak karakter paling favorit (index 0)
        System.out.println("Karakter Juara: " + karakter[0]);

        // Cetak karakter terakhir (index 4)
        System.out.println("Karakter Terakhir: " + karakter[4]);

        // Ubah karakter ke-3 (index 2)
        System.out.println("Wah, saya bosan dengan " + karakter[2] + ". Ganti jadi Rimuru Tempest.");
        karakter[2] = "Rimuru Tempest";

        // Cetak kembali karakter ke-3
        System.out.println("Karakter ke-3 sekarang: " + karakter[2]);

        // Cetak total karakter
        System.out.println("Total karakter: " + karakter.length);
    }
}

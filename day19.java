public class day19 {
    public static void main(String[] args) {
               // Posisi karakter dengan presisi tinggi
        double posisiX = 15.85;
        double posisiY = 9.25;

        // Narrowing casting dari double ke int (koordinat grid)
        int gridX = (int) posisiX;
        int gridY = (int) posisiY;

        // Cetak posisi asli dan posisi grid
        System.out.println("Posisi asli karakter (double): X = " + posisiX + ", Y = " + posisiY);
        System.out.println("Posisi pada grid (int): X = " + gridX + ", Y = " + gridY);

        // Lokasi item kunci
        int kunciX = 15;
        int kunciY = 9;

        // Logika if-else untuk memeriksa apakah karakter berhasil mengambil kunci
        if (gridX == kunciX && gridY == kunciY) {
            System.out.println("Karakter berhasil mengambil Kunci!");
        } else {
            System.out.println("Karakter gagal mengambil Kunci.");
        }
    }
}
    
    


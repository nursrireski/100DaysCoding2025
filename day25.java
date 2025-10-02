public class day25 {
    
    public static void main(String[] args) {
        int a = 5;
        int b, c;

        // Contoh Pre-Increment
        b = ++a; // a ditambah dulu, lalu disimpan ke b
        System.out.println("=== Contoh Pre-Increment ===");
        System.out.println("Nilai a: " + a); 
        System.out.println("Nilai b (hasil ++a): " + b);

        // Reset nilai
        a = 5;

        // Contoh Post-Increment
        c = a++; // a digunakan dulu, baru ditambah
        System.out.println("\n=== Contoh Post-Increment ===");
        System.out.println("Nilai a: " + a); 
        System.out.println("Nilai c (hasil a++): " + c);

        // Contoh penerapan di kasir
        System.out.println("\n=== Penerapan di Kasir ===");
        int pelanggan = 0;

        // Post-Increment: pelanggan masuk dulu, baru dihitung
        System.out.println("Pelanggan datang (post): nomor antrian = " + pelanggan++);
        System.out.println("Pelanggan datang (post): nomor antrian = " + pelanggan++);

        // Pre-Increment: hitung dulu baru dipakai
        System.out.println("Pelanggan datang (pre) : nomor antrian = " + ++pelanggan);
        System.out.println("Pelanggan datang (pre) : nomor antrian = " + ++pelanggan);
    }
}   
    
    


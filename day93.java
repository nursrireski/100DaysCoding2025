public class day93 {
    public static void main(String[] args) {
        
        double angka1 = 3.1;
        double angka2 = 3.9;
        double angka3 = 3.4;

        // Ceil = pembulatan ke atas
        System.out.println("Math.ceil(3.1) = " + Math.ceil(angka1));
        System.out.println("Math.ceil(3.9) = " + Math.ceil(angka2));

        // Floor = pembulatan ke bawah
        System.out.println("Math.floor(3.1) = " + Math.floor(angka1));
        System.out.println("Math.floor(3.9) = " + Math.floor(angka2));

        // Round = pembulatan terdekat
        System.out.println("Math.round(3.4) = " + Math.round(angka3)); // 3
        System.out.println("Math.round(3.6) = " + Math.round(3.6));   // 4
    }
}

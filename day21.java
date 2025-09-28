public class day21 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("=== SEBELUM DITUKAR ===");
        System.out.printf("Nilai a = %d%n", a);
        System.out.printf("Nilai b = %d%n", b);

        // Proses menukar nilai tanpa variabel tambahan
        a = a + b; // a = 30
        b = a - b; // b = 10
        a = a - b; // a = 20

        System.out.println("\n=== SETELAH DITUKAR ===");
        System.out.printf("Nilai a = %d%n", a);
        System.out.printf("Nilai b = %d%n", b);
    }
}    


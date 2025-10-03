public class day26 {
    public static void main(String[] args) {
        int x = 10; 
        System.out.println("=== Operator Penugasan Aritmatika ===");
        System.out.println("Nilai awal x = " + x);

        x += 5; 
        System.out.println("x += 5  -> " + x);

        x -= 3; 
        System.out.println("x -= 3  -> " + x);

        x *= 2; 
        System.out.println("x *= 2  -> " + x);

        x /= 4; 
        System.out.println("x /= 4  -> " + x);

        x %= 3; 
        System.out.println("x %= 3  -> " + x);

        // Reset nilai x agar bitwise lebih mudah dilihat
        x = 6; 
        System.out.println("\n=== Operator Penugasan Bitwise ===");
        System.out.println("Nilai awal x = " + x );

        x &= 3; 
        System.out.println("x &= 3  -> " + x);

        x |= 8; 
        System.out.println("x |= 8  -> " + x);

        x ^= 5; 
        System.out.println("x ^= 5  -> " + x);

        x <<= 1; 
        System.out.println("x <<= 1 -> " + x);

        x >>= 2; 
        System.out.println("x >>= 2 -> " + x);
    }
}    


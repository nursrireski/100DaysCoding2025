public class day15 {
    public static void main(String[] args) {
        // Data awal berupa String
        String s = "20";
        String g = "5";

        // Operasi sebelum parse (masih String, jadi hanya digabungkan)
        System.out.println("Sebelum parse (penjumlahan): " + (s + g));
        // Tidak bisa langsung dikurangkan karena String tidak bisa dikurang

        // Parse ke integer
        int b = Integer.parseInt(s);
        int c = Integer.parseInt(g);

        // Operasi setelah parse (benar-benar dihitung)
        System.out.println("Setelah parse (penjumlahan): " + (b + c));
        System.out.println("Setelah parse (pengurangan): " + (b - c));
    }
}
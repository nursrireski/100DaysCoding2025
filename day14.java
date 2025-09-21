public class day14 {
    public static void main(String[] args) {
        // String yang akan diubah
        String nami = "1";
        String usopp = "23";
        String tony = "4";
        String sanji = "56";
        String brook = "78.9";
        String jinbe = "10.11";
        String shanks = "true";

        // Konversi ke 6 tipe data angka
        byte F = Byte.parseByte(nami);
        short r = Short.parseShort(usopp);
        int a = Integer.parseInt(tony);
        long n = Long.parseLong(sanji);
        float k = Float.parseFloat(brook);
        double y = Double.parseDouble(jinbe);

        // Konversi ke tipe data kondisi
        boolean RoronoaZoro = Boolean.parseBoolean(shanks);

        // Cetak hasil
        System.out.println("Byte   : " + F);
        System.out.println("Short  : " + r);
        System.out.println("Int    : " + a);
        System.out.println("Long   : " + n);
        System.out.println("Float  : " + k);
        System.out.println("Double : " + y);
        System.out.println("Boolean: " + RoronoaZoro);
    }
}
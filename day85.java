public class day85 {
    public static void main(String[] args) {
        int[] nilai = {45, 70, 95, 30, 88, 65};

        System.out.println("--- Daftar Nilai Siswa ---");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
        System.out.println("\n--------------------------");

        int maks = nilai[0];
        for (int n : nilai) {
            if (n > maks) {
                maks = n;
            }
        }

        System.out.println("\nNilai Tertinggi di Kelas: " + maks);
    }
}

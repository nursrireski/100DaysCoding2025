public class day3 {
    public static void main(String[] args) {
        System.out.println("Saya suka nonton Film ");//film yang saya suka adalah film aksi dan film yang dapat memotifasi
        System.out.println();
        
        System.out.print("Hidden ");
        System.out.print("Figures");/*
        Hidden Figures adalah film yang saya sukai film ini di rilis pada tahun 2016,film ini bercerita tentang tiga ilmuan
        perempuan kulit hitam yang bekerja di NASA pada era 1960-an di mana pada saat itu deskriminasi ras dan gender masih
        sangat kuat di Amerika.Mereka bertiga berjuang melawan deskriminasi rasial dan gender,serta berkontribusi besar dalam
        keberhasilan Amerika meluncurkan astronaut ke luar angkasa
        */
        System.out.println("");
        System.out.println();
      
        
        System.out.println("Tiga ilmuan Di film tersebut");
        String Katherine = "Ahli matematika yang menghitung lintas orbit untuk misi luar angkasa";
        String Dorothy = "Ahli komputer yang menguasai bahasa pemrograman Fotran dan meminpin tim programmer wanita di NASA ";
        String Mary = "Insinyur wanita kulit hitam pertama di NASA ";
        System.out.printf("|%-5s : %-100s | %n","Katherine Johnson","(" + Katherine + ")");
        System.out.printf("|%-17s : %-20s | %n","Dorothy Vaughan","(" + Dorothy + ")");
        System.out.printf("|%-17s : %-100s | %n","Mary Jackson","(" + Mary + ")");
        
        System.out.println();
    }
}

/*Nama  : Kaila Talitha Putri 
 *Nim   : 24060123140179
  Kelas : C
 */

 public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi
        // BangunDatar B1 = new BangunDatar(); //Tidak dapat dijalankan karena BangunDatar merupakan abstract class sehingga tidak bisa dibuat objeknya
        // BangunDatar P1 = new Persegi(10); //Harusnya itu ditambahin warna dan border
        // Persegi P2 = new Persegi(5);
        // BangunDatar L1 = new Lingkaran(7);
        // Lingkaran L1 = new Lingkaran (14);
        // System.out.println("=== Info Persegi ===");
        // persegi.printInfo();
        
        // System.out.println();

        BangunDatar P1 = new Persegi(10, "Merah", "Kuning");
        Persegi P2 = new Persegi(5, "Kuning", "Biru");
        BangunDatar L1 = new Lingkaran(7, "Hijau", "Putih");
        Lingkaran L2 = new Lingkaran(14, "Ungu", "Abu-abu");

        // Menampilkan informasi Persegi
        System.out.println("\n=== Info Persegi P1 ===");
        P1.printInfo();
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());

        System.out.println("\n=== Info Persegi P2 ===");
        P2.printInfo();
        System.out.println("Luas: " + P2.getLuas());
        System.out.println("Keliling: " + P2.getKeliling());

        // Menampilkan informasi Lingkaran
        System.out.println("\n=== Info Lingkaran L1 ===");
        L1.printInfo();
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());

        System.out.println("\n=== Info Lingkaran L2 ===");
        L2.printInfo();
        System.out.println("Luas: " + L2.getLuas());
        System.out.println("Keliling: " + L2.getKeliling());

        // Cek kesamaan luas dan keliling dari persegi dan lingkaran 
        System.out.println("\nApakah P1 dan L1 memiliki luas yang sama? " + P1.isEqualLuas(L1));
        System.out.println("Apakah P2 dan L2 memiliki keliling yang sama? " + P2.isEqualKeliling(L2));

        // ZoomIn dan ZoomOut
        System.out.println("Sisi P1 sebelum zoomIn : " + ((Persegi)P1).getSisi());
        ((Persegi)P1).zoomIn();
        System.out.println("Sisi P1 setelah zoomIn : " + ((Persegi)P1).getSisi());

        // ZoomIn dan ZoomOut
        System.out.println("\nSisi P2 sebelum zoomOut : " + ((Persegi)P2).getSisi());
        ((Persegi)P2).zoomOut();
        System.out.println("Sisi P2 setelah zoomOut : " + ((Persegi)P2).getSisi());

        //ZoomPercent
        System.out.println("\nSisi L2 sebelum zoomOut : " + ((Lingkaran)L2).getJari());
        ((Lingkaran)L2).zoom(15);
        System.out.println("Sisi L2 setelah zoomOut : " + ((Lingkaran)L2).getJari());
    }
}

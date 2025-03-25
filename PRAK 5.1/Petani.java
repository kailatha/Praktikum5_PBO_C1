/*Nama  : Kaila Talitha Putri 
 *Nim   : 24060123140179
  Kelas : C
 */

import java.time.LocalDate;

class Petani extends Manusia implements Pajak {
    private String asalKota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    public String getAsalKota() {
        return this.asalKota;
    }

    @Override
    public int hitungMasaKerja() {
        int now = LocalDate.now().getYear();
        return (now - tglMulaiKerja.getYear()) + 1; //NIM digit ke 12 yaitu 1
    }

    @Override
    public double hitungPajak() {
        return 0;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
    }
}

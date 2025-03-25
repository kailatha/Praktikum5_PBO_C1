
/*Nama  : Kaila Talitha Putri 
 *Nim   : 24060123140179
  Kelas : C
 */

import java.time.LocalDate;

class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return this.nip;
    }

    @Override
    public int hitungMasaKerja() {
        int now = LocalDate.now().getYear();
        return (now - tglMulaiKerja.getYear()) + 9; //NIM digit terakhir ke 14 yaitu 9
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("nip : " + getNip());
    }
}

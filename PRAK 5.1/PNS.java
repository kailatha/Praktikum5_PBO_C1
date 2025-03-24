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
        int A = Character.getNumericValue(nip.charAt(13));
        return (now - tglMulaiKerja.getYear()) + A;
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
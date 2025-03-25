import java.time.LocalDate;


class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getNpwp() {
        return this.npwp;
    }

    @Override
    public int hitungMasaKerja() {
        int now = LocalDate.now().getYear();
        return (now - tglMulaiKerja.getYear()) + 7; //NIM digit ke 13 yaitu 7
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("npwp: " + getNpwp());
    }
}

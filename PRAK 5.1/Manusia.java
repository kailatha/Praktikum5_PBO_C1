/*Nama  : Kaila Talitha Putri 
 *Nim   : 24060123140179
  Kelas : C
 */

import java.time.LocalDate;

abstract class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public LocalDate getTglMulaiKerja() {
        return this.tglMulaiKerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public double getPendapatan() {
        return this.pendapatan;
    }
    
    public abstract int hitungMasaKerja();

    public abstract double hitungPajak();

    public void cetakInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Mulai Kerja: " + getTglMulaiKerja());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
    }
}

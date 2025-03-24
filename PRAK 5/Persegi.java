/*Nama  : Kaila Talitha Putri 
 *Nim   : 24060123140179
  Kelas : C
 */


public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    // public Persegi(double sisi, String warna, String border){
    //     this.sisi = sisi;
    //     this.warna = warna;
    //     this.border = border;
    //     this.jmlsisi = 4;
    // }
    //Ini tidak boleh dan tidak bisa dikarenakan memanggil secara langsung atribut pada BangunDatar yang private jadi untuk mengakses menggunakan method BangunDatar yang telah di public.

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }
    
    @Override
    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(2)*sisi;
    }

    @Override
    public void zoomIn(){
        sisi = sisi*1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi*0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi* percent/100;
    }


    // @Override
    // public void printInfo(){
    //     System.out.println("Jumlah sisi: " + sisi);
    //     System.out.println("Luas: " + getLuas());
    //     System.out.println("Warna: " + getWarna());
    //     System.out.println("Border: " + getBorder());
    //     System.out.println("Keliling: " + getKeliling());
    //     System.out.println("Diagonal: " + getDiagonal());
    // }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }
}

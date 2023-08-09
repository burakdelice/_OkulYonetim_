package lesson23.Odev;

import java.util.ArrayList;
import java.util.List;

public class Okul {

    private static  List<Memur> memurlar= new ArrayList<>();
    private static List<Sinif> siniflar= new ArrayList<>() ;
    private static List<Ogretmen> ogretmenler= new ArrayList<>();
    private static List<Ogrenci> ogrenciler= new ArrayList<>();
    private static List<Ders> dersler = new ArrayList<>();

    public Okul() {
        this.memurlar = memurlar;
        this.siniflar= siniflar;
        this.ogretmenler  = ogretmenler;
        this.ogrenciler = ogrenciler;
        this.dersler = dersler;
    }

    public List<Memur> getMemurlar() {
        return memurlar;
    }

    public void setMemurlar(List<Memur> memurlar) {
        this.memurlar = memurlar;
    }

    public List<Sinif> getSiniflar() {
        return siniflar;
    }

    public void setSiniflar(List<Sinif> siniflar) {
        this.siniflar = siniflar;
    }

    public List<Ogretmen> getOgretmenler() {
        return ogretmenler;
    }

    public void setOgretmenler(List<Ogretmen> ogretmenler) {
        this.ogretmenler = ogretmenler;
    }

    public List<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(List<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public List<Ders> getDersler() {
        return dersler;
    }

    public void setDersler(List<Ders> dersler) {
        this.dersler = dersler;
    }

    public void sinifEkle(Sinif sinif){
        siniflar.add(sinif);
    }
    public void ogretmenEkle(Ogretmen ogretmen){
        ogretmenler.add(ogretmen);
    }
    public void ogrenciEkle(Ogrenci ogrenci){
        ogrenciler.add(ogrenci);
    }


    @Override
    public String toString() {
        return "Okul{" +
                "memurlar=" + memurlar +
                ", siniflar=" + siniflar +
                ", ogretmenler=" + ogretmenler +
                ", ogrenciler=" + ogrenciler +
                ", dersler=" + dersler +
                '}';
    }
}

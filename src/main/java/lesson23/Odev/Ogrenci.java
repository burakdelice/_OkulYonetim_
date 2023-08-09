package lesson23.Odev;

import java.util.ArrayList;
import java.util.List;

public class Ogrenci extends Kisi {
    private Sinif sinif;
    private List<Double> notlar = new ArrayList<>();

    private List<Ders> dersListesi = new ArrayList<>();

    public Sinif getSinif() {
        return sinif;
    }

    public void setSinif(Sinif sinif) {
        this.sinif = sinif;
    }

    public List<Double> getNotlar() {
        return notlar;
    }

    public void setNotlar(List<Double> notlar) {
        this.notlar = notlar;
    }

    public Ogrenci(String isim, String soyisim, String no) {
        super(isim, soyisim, no);
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "sinif=" + sinif +
                ", notlar=" + notlar +
                "} " + super.toString();
    }
    public void dersEkle(Ders ders) {
        dersListesi.add(ders);
    }
}

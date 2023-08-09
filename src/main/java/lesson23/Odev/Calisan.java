package lesson23.Odev;

import java.time.LocalDate;

public class Calisan extends Kisi{
    private LocalDate iseBaslamaTarihi;

    public LocalDate getIseBaslamaTarihi() {
        return iseBaslamaTarihi;
    }

    public Calisan(String isim, String soyisim, String no, LocalDate iseBaslamaTarihi) {
        super(isim, soyisim, no);
        this.iseBaslamaTarihi = iseBaslamaTarihi;
    }

    public Calisan(String isim, String soyisim, String no) {
        super(isim, soyisim, no);
    }

    public Calisan(LocalDate iseBaslamaTarihi) {
        this.iseBaslamaTarihi = iseBaslamaTarihi;
    }

    public void setIseBaslamaTarihi(LocalDate iseBaslamaTarihi) {
        this.iseBaslamaTarihi = iseBaslamaTarihi;
    }

    public Sinif getSinif() {
        return sinif;
    }

    public void setSinif(Sinif sinif) {
        this.sinif = sinif;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    Sinif sinif;
    private int maas;
    public void maasHesaplama(){

    }
}

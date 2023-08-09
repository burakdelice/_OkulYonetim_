package lesson23.Odev;

import java.time.LocalDate;

public class Ogretmen extends Calisan implements ICalisan{
    private EnumDersler ders;

    public Ogretmen(String isim, String soyisim, String no, LocalDate iseBaslamaTarihi, EnumDersler ders) {
        super(isim, soyisim, no,iseBaslamaTarihi);
        this.ders = ders;
    }

    public EnumDersler getDers() {
        return ders;
    }

    public void setDers(EnumDersler ders) {
        this.ders = ders;
    }

    @Override
    public void yillikIzinIste() {

    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "ders=" + ders +
                "} " + super.toString();
    }
}

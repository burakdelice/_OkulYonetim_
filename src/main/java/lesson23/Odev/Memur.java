package lesson23.Odev;

import java.time.LocalDate;

public class Memur extends Calisan{

    public Memur(String isim, String soyisim, String no, LocalDate iseBaslamaTarihi) {
        super(isim, soyisim, no, iseBaslamaTarihi);
    }

    public void dersAtamasi(){

    }

    @Override
    public String toString() {
        return "Memur{} " + super.toString();
    }
}

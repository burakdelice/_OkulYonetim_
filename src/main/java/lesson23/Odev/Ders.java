package lesson23.Odev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ders {
   private Ogretmen ogretmen;
    private EnumDersler ders;
    private List<Ogrenci> dersAlanOgrenciler  = new ArrayList<>();

    public List<Ogrenci> getDersAlanOgrenciler() {
        return dersAlanOgrenciler ;
    }

    public void setDersAlanOgrenciler(List<Ogrenci> dersAlanOgrenciler) {
       dersAlanOgrenciler = dersAlanOgrenciler;
    }

    public Ders() {
        this.ogretmen = ogretmen;
        this.ders = ders;
        this.dersAlanOgrenciler = dersAlanOgrenciler;
    }

    @Override
    public String toString() {
        return "Ders{" +
                "ogretmen=" + ogretmen +
                ", ders=" + ders +
                '}';
    }
    public Ders(EnumDersler ders) {
        this.ders = ders;
    }

    public Ogretmen getOgretmen() {
        return ogretmen;
    }

    public void setOgretmen(Ogretmen ogretmen) {
        this.ogretmen = ogretmen;
    }

    public EnumDersler getDers() {
        return ders;
    }

    public void setDers(EnumDersler ders) {
        this.ders = ders;
    }
    public void dersAta(Ogrenci ogrenci){
        dersAlanOgrenciler.add(ogrenci);
    }

}


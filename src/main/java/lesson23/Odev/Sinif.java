package lesson23.Odev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sinif {

    private static List<Ogretmen> sinifOgretmenleri= new ArrayList<>();
    private static List<Ogrenci> sinifOgrencileri= new ArrayList<>();
    private static List<Ders> sinifDersleri= new ArrayList<>();
    private int sinifSeviyesi;

    public Sinif(int sinifSeviyesi) {
        this.sinifSeviyesi = sinifSeviyesi;
    }

    @Override
    public String toString() {
        return "Sinif{" +
                "sinifSeviyesi=" + sinifSeviyesi +
                '}';
    }

    public static List<Ogretmen> getSinifOgretmenleri() {
        return sinifOgretmenleri;
    }

    public static void setSinifOgretmenleri(List<Ogretmen> sinifOgretmenleri) {
        Sinif.sinifOgretmenleri = sinifOgretmenleri;
    }

    public static List<Ogrenci> getSinifOgrencileri() {
        return sinifOgrencileri;
    }

    public static void setSinifOgrencileri(List<Ogrenci> sinifOgrencileri) {
        Sinif.sinifOgrencileri = sinifOgrencileri;
    }

    public static List<Ders> getSinifDersleri() {
        return sinifDersleri;
    }

    public static void setSinifDersleri(List<Ders> sinifDersleri) {
        Sinif.sinifDersleri = sinifDersleri;
    }

    public int getSinifSeviyesi() {
        return sinifSeviyesi;
    }

    public void setSinifSeviyesi(int sinifSeviyesi) {
        this.sinifSeviyesi = sinifSeviyesi;
    }

    public void sinifaOgrenciKaydet(Ogrenci ogrenci){
        this.sinifOgrencileri.add(ogrenci);
}
    public void sinifaDersKaydet(Ders ders){
        this.sinifDersleri.add(ders);
    }
}


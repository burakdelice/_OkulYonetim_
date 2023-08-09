package lesson23.Odev;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class OkulYonetim {

    private Okul okul = new Okul();

    public OkulYonetim() {

    }

    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }

    void sinifYarat() {
        Sinif sinif1 = new Sinif(1);
        Sinif sinif2 = new Sinif(2);
        Sinif sinif3 = new Sinif(3);
        okul.sinifEkle(sinif1);
        okul.sinifEkle(sinif2);
        okul.sinifEkle(sinif3);


    }

    void ogretmenYarat() {
        Ogretmen ogretmen1 = new Ogretmen("Burak", "Delice", "T-1", LocalDate.of(2011, 6, 6), EnumDersler.MATEMATIK);
        Ogretmen ogretmen2 = new Ogretmen("Ahmet", "Altay", "T-2", LocalDate.of(2001, 5, 7), EnumDersler.FIZIK);
        Ogretmen ogretmen3 = new Ogretmen("Orkun", "Uysal", "T-3", LocalDate.of(2002, 4, 18), EnumDersler.BIYOLOJI);
        Ogretmen ogretmen4 = new Ogretmen("Buğra", "Dinler", "T-4", LocalDate.of(2003, 3, 19), EnumDersler.KIMYA);
        Ogretmen ogretmen5 = new Ogretmen("Emre", "Demirtaş", "T-5", LocalDate.of(2004, 2, 16), EnumDersler.GEOMETRI);
        Ogretmen ogretmen6 = new Ogretmen("Mert", "Alabay", "T-6", LocalDate.of(2005, 1, 14), EnumDersler.TURKCE);

        okul.ogretmenEkle(ogretmen1);
        okul.ogretmenEkle(ogretmen2);
        okul.ogretmenEkle(ogretmen3);
        okul.ogretmenEkle(ogretmen4);
        okul.ogretmenEkle(ogretmen5);
        okul.ogretmenEkle(ogretmen6);
        kayitEt(okul.getOgretmenler(), ogretmen1);
        kayitEt(okul.getOgretmenler(), ogretmen2);
        kayitEt(okul.getOgretmenler(), ogretmen3);
        kayitEt(okul.getOgretmenler(), ogretmen4);
        kayitEt(okul.getOgretmenler(), ogretmen5);
        kayitEt(okul.getOgretmenler(), ogretmen6);

    }

    void ogrenciveDersYarat() {
        Ogrenci ogrenci1 = new Ogrenci("Burak", "Kılıç", "S-1");
        Ogrenci ogrenci2 = new Ogrenci("Mert", "Özdemir", "S-2");
        Ogrenci ogrenci3 = new Ogrenci("Berat", "Er", "S-3");
        Ogrenci ogrenci4 = new Ogrenci("Ayberk", "Doğan", "S-4");
        Ogrenci ogrenci5 = new Ogrenci("Burak", "Oğuz", "S-5");
        Ogrenci ogrenci6 = new Ogrenci("Kadir", "İşman", "S-6");

        okul.getSiniflar().get(0).sinifaOgrenciKaydet(ogrenci1);
        okul.getSiniflar().get(0).sinifaOgrenciKaydet(ogrenci2);
        okul.getSiniflar().get(1).sinifaOgrenciKaydet(ogrenci3);
        okul.getSiniflar().get(1).sinifaOgrenciKaydet(ogrenci4);
        okul.getSiniflar().get(2).sinifaOgrenciKaydet(ogrenci5);
        okul.getSiniflar().get(2).sinifaOgrenciKaydet(ogrenci6);

        kayitEt(okul.getOgrenciler(), ogrenci1);
        kayitEt(okul.getOgrenciler(), ogrenci2);
        kayitEt(okul.getOgrenciler(), ogrenci3);
        kayitEt(okul.getOgrenciler(), ogrenci4);
        kayitEt(okul.getOgrenciler(), ogrenci5);
        kayitEt(okul.getOgrenciler(), ogrenci6);

        Ders kimyaDersi = new Ders(EnumDersler.KIMYA);
        Ders turkceDersi = new Ders(EnumDersler.TURKCE);
        Ders geometriDersi = new Ders(EnumDersler.GEOMETRI);
        Ders biyolojiDersi = new Ders(EnumDersler.BIYOLOJI);
        ogrenci1.dersEkle(kimyaDersi);
        ogrenci1.dersEkle(turkceDersi);
        ogrenci2.dersEkle(geometriDersi);
        ogrenci2.dersEkle(turkceDersi);
        ogrenci2.dersEkle(biyolojiDersi);
        ogrenci3.dersEkle(turkceDersi);
        ogrenci4.dersEkle(kimyaDersi);
        ogrenci5.dersEkle(biyolojiDersi);
        ogrenci6.dersEkle(geometriDersi);
        kimyaDersi.dersAta(ogrenci1);
        turkceDersi.dersAta(ogrenci1);
        geometriDersi.dersAta(ogrenci2);
        turkceDersi.dersAta(ogrenci2);
        biyolojiDersi.dersAta(ogrenci2);
        turkceDersi.dersAta(ogrenci3);
        kimyaDersi.dersAta(ogrenci4);
        biyolojiDersi.dersAta(ogrenci5);
        geometriDersi.dersAta(ogrenci6);

        okul.getSiniflar().get(0).sinifaDersKaydet(turkceDersi);
        okul.getSiniflar().get(1).sinifaDersKaydet(turkceDersi);
        okul.getSiniflar().get(2).sinifaDersKaydet(turkceDersi);
        okul.getSiniflar().get(0).sinifaDersKaydet(geometriDersi);
        okul.getSiniflar().get(1).sinifaDersKaydet(kimyaDersi);
        okul.getSiniflar().get(2).sinifaDersKaydet(turkceDersi);
        okul.getSiniflar().get(0).sinifaDersKaydet(biyolojiDersi);

        okul.getOgrenciler().get(0).setSinif(okul.getSiniflar().get(0));
        okul.getOgrenciler().get(1).setSinif(okul.getSiniflar().get(0));
        okul.getOgrenciler().get(2).setSinif(okul.getSiniflar().get(1));
        okul.getOgrenciler().get(3).setSinif(okul.getSiniflar().get(1));
        okul.getOgrenciler().get(4).setSinif(okul.getSiniflar().get(2));
        okul.getOgrenciler().get(5).setSinif(okul.getSiniflar().get(2));

    }

    void memurYarat() {
        Memur memur1 = new Memur("Fatih", "Sandalcı", "OF-1", LocalDate.of(2013, 06, 06));
        Memur memur2 = new Memur("Melih", "Sandalcı", "OF-2", LocalDate.of(2016, 07, 13));
        Memur memur3 = new Memur("Semih", "Sandalcı", "OF-3", LocalDate.of(2019, 04, 22));
        kayitEt(okul.getMemurlar(), memur1);
        kayitEt(okul.getMemurlar(), memur2);
        kayitEt(okul.getMemurlar(), memur3);
    }

    public void menuGetir() {

        Scanner scanner = new Scanner(System.in);
        int secenek;

        do {
            System.out.println("Menü Seçenekleri:");
            System.out.println("1. Sınıfları Gör");
            System.out.println("2. Öğrencileri Gör");
            System.out.println("3. Öğretmenleri Gör");
            System.out.println("4. Memurları Gör");
            System.out.println("5. Okul işlemleri Yap");
            System.out.println("6. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    siniflariGorMenu();
                    break;
                case 2:
                    ogrencileriGorMenu();
                    break;
                case 3:
                    ogretmenleriGorMenu();
                    break;
                case 4:
                    memurlariGorMenu();
                    break;
                case 5:
                    okulIslemMenusu();
                    break;
                case 6:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız!");
                    break;
            }
        } while (secenek != 6);
    }

    public void siniflariGorMenu() {
        Scanner scanner = new Scanner(System.in);
        int secenek;

        do {
            System.out.println("===Sınıflar===");
            System.out.println("1. Sınıfları Listele");
            System.out.println("2. Sınıf Oluştur");
            System.out.println("3. Sınıf sil");
            System.out.println("4. Geri Dön");
            System.out.print("Seçiminizi yapın: ");
            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    siniflariListele();
                    break;
                case 2:
                    sinifOlustur();
                    break;
                case 3:
                    sinifSil();
                    break;
                case 4:
                    System.out.println("Geri dönülüyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız!");
                    break;
            }
        } while (secenek != 4);
    }

    public void ogrencileriGorMenu() {
        Scanner scanner = new Scanner(System.in);
        int secenek;

        do {
            System.out.println("===Öğrenciler===");
            System.out.println("1. Öğrencileri Listele");
            System.out.println("2. Öğrenci Ekle");
            System.out.println("3. Öğrenci Sil");
            System.out.println("4. Geri Dön");
            System.out.print("Seçiminizi yapın: ");
            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    System.out.println("Öğrencileri listele seçildi.");
                    ogrencileriListele();
                    break;
                case 2:
                    ogrenciEkle();
                    break;
                case 3:
                    ogrenciSil();
                    break;
                case 4:
                    System.out.println("Geri dönülüyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız!");
                    break;
            }
        } while (secenek != 4);
    }

    public void ogretmenleriGorMenu() {
        Scanner scanner = new Scanner(System.in);
        int secenek;

        do {
            System.out.println("===Öğretmenler===");
            System.out.println("1. Öğretmenleri Listele");
            System.out.println("2. Öğretmen Ekle");
            System.out.println("3. Öğretmen Sil");
            System.out.println("4. Geri Dön");
            System.out.print("Seçiminizi yapın: ");
            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    ogretmenleriListele();
                    break;
                case 2:
                    ogretmenEkle();
                    break;
                case 3:
                    ogretmenSil();
                    break;
                case 4:
                    System.out.println("Geri dönülüyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız!");
                    break;
            }
        } while (secenek != 4);
    }

    private void memurlariGorMenu() {
        Scanner scanner = new Scanner(System.in);
        int secenek;

        do {
            System.out.println("Memur Menüsü:");
            System.out.println("1. Memurları Listele");
            System.out.println("2. Memur Oluştur");
            System.out.println("3. Memur sil");
            System.out.println("4. Geri Dön");
            System.out.print("Seçiminizi yapın: ");
            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    System.out.println("===Memurlar===");
                    memurlariListele();
                    break;
                case 2:
                    memurEkle();
                    break;
                case 3:
                    memurSil();
                    break;

                case 4:
                    System.out.println("Geri dönülüyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız!");
                    break;
            }
        } while (secenek != 4);
    }

    private void okulIslemMenusu() {
        Scanner scanner = new Scanner(System.in);
        int secenek;
        do {
            System.out.println("===Okul İşlem Menüsü===");
            System.out.println("1. Maaş Hesaplama");
            System.out.println("2. Ortalama Hesaplama");
            System.out.println("3. İsmi A ile başlayan öğrencileri listele");
            System.out.println("4. Rastgele bir öğrencinin bir ders ortalamasını getir");
            System.out.println("5. 1.sınıftaki öğrencileri getir");
            System.out.println("6. 2.sınıftaki öğrenci isimlerini sırala");
            System.out.println("7. 1.sınıftaki öğrencilerin not ortalamasını getir");
            System.out.println("8. Öğrencileri sınıflara göre grupla");
            System.out.println("9. Öğretmenleri ders verdikleri sınıflara göre listele");
            System.out.println("10. Öğrencileri okul numarasına göre yazdır");
            System.out.println("11. Öğrencileri aldıkları derse göre grupla");
            System.out.println("12. Geç kalan öğrencileri listele en geç 5 tane 10 tur atsın, diğerleri 5 ");
            System.out.println("13. Öğrencilerden on tanesini sınıflarına göre öncelikle");
            System.out.println("14. Çıkış Yap");
            secenek = scanner.nextInt();

            switch (secenek) {
                case 1:
                    maasHesapla();
                    break;
                case 2:
                    ortalamaHesapla();
                    break;
                case 3:
                    aileBaslayanlar();
                    break;
                case 4:
                    rastgeleOgrenciOrtalmasi();
                    break;
                case 5:
                    birinciSinifOgrencileri();
                    break;
                case 6:
                    ikinciSinifOgrenciIsimleri();
                    break;
                case 7:
                    birinciSinifOrt();
                    break;
                case 8:
                    sinifaGoreOgrenciler();
                    break;
                case 9:
                    derseGoreOgretmenler();
                    break;
                case 10:
                    okulNumarasinaGoreOgrenciler();
                    break;
                case 11:
                    derseGoreOgrenciler();
                    break;
                case 12:
                    gecKalanlaraTurAttir();
                    break;
                case 13:
                    sinifaGoreOncelikle();
                    break;
                case 14:
                    System.out.println("Geri dönülüyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız!");
                    break;
            }
        } while (secenek != 14);
    }

    private void maasHesapla() {
    }

    private void ortalamaHesapla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci idsi girerek ortalamasını hesaplayın");
        String id = scanner.nextLine();
        int id2 = Integer.parseInt(id.substring(2));
        Ogrenci secilenOgrenci = okul.getOgrenciler().get(id2);
        double ort = secilenOgrenci.getNotlar().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("Ortalama " + ort);
    }

    private void rastgeleOgrenciOrtalmasi() {
        Random random = new Random();
        Ogrenci secilenOgrenci = okul.getOgrenciler().get(random.nextInt(okul.getOgrenciler().size()));
        System.out.println("Seçilen öğrenci: " + secilenOgrenci.getIsim());
        double ort = secilenOgrenci.getNotlar().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("Ortalama " + ort);
    }

    private void aileBaslayanlar() {
        okul.getOgrenciler().stream().map(x -> x.getIsim()).filter(x -> x.startsWith("A") || x.startsWith("a")).forEach(System.out::println);
    }

    private void birinciSinifOgrencileri() {
        okul.getOgrenciler().stream()
                .filter(ogrenci -> ogrenci.getSinif().getSinifSeviyesi() == 1)
                .forEach(ogrenci -> System.out.println(ogrenci));
    }

    private void ikinciSinifOgrenciIsimleri() {
        okul.getOgrenciler().stream()
                .filter(ogrenci -> ogrenci.getSinif().getSinifSeviyesi() == 2)
                .forEach(ogrenci -> System.out.println(ogrenci.getIsim()));
    }

    private void birinciSinifOrt() {
        int toplamNot = 0;
        int ogrenciSayisi = 0;
        double notOrtalamasi = 0;
        List<Ogrenci> ogrenciler = okul.getSiniflar().get(1).getSinifOgrencileri();
        System.out.println(ogrenciler);
        if (ogrenciler.size() != 0) {
            for (Ogrenci ogrenci : ogrenciler) {
                List<Double> notlar = ogrenci.getNotlar();
                if (notlar.size() != 0) {
                    for (int i = 0; i < ogrenciler.size(); i++) {
                        toplamNot += (double) notlar.get(i);
                        ++ogrenciSayisi;
                        notOrtalamasi = toplamNot / ogrenciSayisi;
                    }
                }
            }
            System.out.println("Birinci sınıfın not ortalaması: " + notOrtalamasi);
        } else {
            System.out.println("1.sınıfta öğrenci bulunmamaktadır.");
        }
    }

    private void sinifaGoreOgrenciler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sınıf seviyesi girin.");
        int id = scanner.nextInt();
        scanner.nextLine();
        Sinif sinif = okul.getSiniflar().get(id-1);
        okul.getOgrenciler().stream().filter(x->x.getSinif().getSinifSeviyesi()==id).forEach(System.out::println);
    }

    private void derseGoreOgretmenler() {
      Map<Ogretmen,Sinif> derseGoreOgretmen = okul.getOgretmenler().stream().collect(Collectors.toMap(x->x,x->x.getSinif()));
        for (Map.Entry<Ogretmen,Sinif> entry : derseGoreOgretmen.entrySet()) {
            System.out.println("Ogretmen: " + entry.getKey() + ", Ders: " + entry.getKey());
        }
    }

    private void okulNumarasinaGoreOgrenciler() {
        Map<Ogrenci, String> isimNumaraMap = okul.getOgrenciler().stream().collect(Collectors.toMap(x->x,x->x.getNo()));
        for (Map.Entry<Ogrenci, String> entry : isimNumaraMap.entrySet()) {
            System.out.println("Öğrenci: " + entry.getKey() + ", Numara: " + entry.getValue());
        }
    }

    private void derseGoreOgrenciler() {
        Map<Ders, List<Ogrenci>> derseGoreOgrencilerMap = okul.getDersler().stream().collect(Collectors.toMap(x->x, y->y.getDersAlanOgrenciler()));
        for (Map.Entry<Ders, List<Ogrenci>> entry : derseGoreOgrencilerMap.entrySet()) {
            System.out.println("Ders: " + entry.getKey() + "Öğrenci: " + entry.getValue());
        }
    }

    private void gecKalanlaraTurAttir() {
        Stack<Ogrenci> gecKalanOgrenciler = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(okul.getOgrenciler().size());
            Ogrenci ogrenci = okul.getOgrenciler().get(randomIndex);
            gecKalanOgrenciler.push(ogrenci);
            okul.getOgrenciler().remove(randomIndex);
        }

        System.out.println("=== 10 Tur Atan Öğrenciler ===");
        for (int i = 0; i < 5; i++) {
            Ogrenci ogrenci = gecKalanOgrenciler.pop();
            System.out.println(ogrenci.getIsim() + " 10 tur atıyor.");
        }

        // Diğer 5 öğrenciye 5 tur atalım
        System.out.println("=== 5 Tur Atan Öğrenciler ===");
        for (int i = 0; i < 5; i++) {
            Ogrenci ogrenci = gecKalanOgrenciler.pop();
            System.out.println(ogrenci.getIsim() + " 5 tur atıyor.");
        }
    }

    private void sinifaGoreOncelikle() {
        for (int i = 0; i < okul.getSiniflar().size(); i++) {
            okul.getSiniflar().get(i).getSinifOgrencileri().forEach(System.out::println);
        }
    }


    public void ogretmenleriListele() {
        System.out.println(okul.getOgretmenler().toString());
    }

    public void ogrencileriListele() {
        System.out.println(okul.getOgrenciler().toString());
    }

    public void dersleriListele() {
        System.out.println(okul.toString());
    }
    public void siniflariListele() {
        System.out.println("====Sınıf listesi====");
        System.out.println(okul.getSiniflar().toString());
    }

    private void memurlariListele() {
        System.out.println(okul.getMemurlar().toString());
    }

    private void sinifSil() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silinecek sinifin seviyesini girin.");
        int silinenSinifseviyesi = scanner.nextInt();
        if (okul.getSiniflar().stream().mapToInt(x -> x.getSinifSeviyesi()).equals(silinenSinifseviyesi)) {
            okul.getSiniflar().remove(silinenSinifseviyesi);
        }
    }

    public void sinifOlustur() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sınıf seviyesini girin.");
        int sinifSeviyesi=scanner.nextInt();
        Sinif sinif = new Sinif(sinifSeviyesi);
        System.out.println(sinif.getClass() + " sınıfı oluşturuldu.");
    }

    private void ogretmenSil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silinecek öğretmenin adını girin: ");
        String silinecekIsim = scanner.nextLine();

        Ogretmen silinecek = null;
        for (Ogretmen ogretmen : okul.getOgretmenler()) {
            if (ogretmen.getIsim().equals(silinecekIsim)) {
                silinecek = ogretmen;
                break;
            }
        }
        if (silinecek != null) {
            okul.getOgretmenler().remove(silinecek);
            System.out.println(silinecek + " isimli öğretmen listeden silindi.");
        } else {
            System.out.println(silinecekIsim + " isimli öğretmen listede bulunamadı.");
        }
        System.out.println("Güncellenmiş öğretmen listesi:");
        for (Ogretmen ogretmen : okul.getOgretmenler()) {
            System.out.println(ogretmen);
        }
    }

    private void ogretmenEkle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eklenecek Öğretmenin sınıf seviyesini girin: ");
        int seviye = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Eklenecek Öğretmenin ismini girin.");
        String isim = scanner.nextLine();
        System.out.println("Eklenecek Öğretmenin soyismini girin.");
        String soyisim = scanner.nextLine();
        System.out.println("Eklenecek Öğretmenin numarasını girin.(T-1 şeklinde)");
        String no = scanner.nextLine();
        System.out.println("Eklenecek Öğretmenin dersini girin: ");
        String dersAdi = scanner.nextLine();

        EnumDersler ders = null;
        for (EnumDersler enumDers : EnumDersler.values()) {
            if (enumDers.name().equalsIgnoreCase(dersAdi)) {
                ders = enumDers;
                break;
            }
        }

        if (ders != null) {
            Ogretmen ogretmen = new Ogretmen(isim, soyisim, no, LocalDate.now(), ders);
            okul.getOgretmenler().add(ogretmen);
            System.out.println("Yeni öğretmen başarıyla eklendi.");
        } else {
            System.out.println("Geçersiz ders adı!");
        }
    }


    private void ogrenciSil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silinecek öğrencinin adını girin: ");
        String silinecekIsim = scanner.nextLine();

        Ogrenci silinecek = null;
        for (Ogrenci ogrenci : okul.getOgrenciler()) {
            if (ogrenci.getIsim().equals(silinecekIsim)) {
                silinecek = ogrenci;
                break;
            }
        }
        if (silinecek != null) {
            okul.getOgrenciler().remove(silinecek);
            System.out.println(silinecek + " isimli öğrenci listeden silindi.");
        } else {
            System.out.println(silinecekIsim + " isimli öğrenci listede bulunamadı.");
        }
        System.out.println("Güncellenmiş öğrenci listesi:");
        for (Ogrenci ogrenci : okul.getOgrenciler()) {
            System.out.println(ogrenci);
        }
    }

    private void ogrenciEkle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eklenecek Öğrencinin ismini girin.");
        String isim = scanner.nextLine();
        System.out.println("Eklenecek Öğrencinin soyismini girin.");
        String soyisim = scanner.nextLine();
        System.out.println("Eklenecek Öğrencinin numarasını girin.(S-1 şeklinde)");
        String no = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Eklenecek sınıfın numarasını girin.");
        int sinifNo = scanner.nextInt();

        Ogrenci ogrenci = new Ogrenci(isim, soyisim, no);
        ogrenci.setSinif(okul.getSiniflar().get(sinifNo));
        okul.getOgrenciler().add(ogrenci);
        System.out.println("Yeni öğrenci başarıyla " + ogrenci.getSinif() + ". sınıfa eklendi.");
    }

    private void memurSil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silinecek memurun adını girin: ");
        String silinecekIsim = scanner.nextLine();

        Memur silinecek = null;
        for (Memur memur : okul.getMemurlar()) {
            if (memur.getIsim().equals(silinecekIsim)) {
                silinecek = memur;
                break;
            }
        }
        if (silinecek != null) {
            okul.getMemurlar().remove(silinecek);
            System.out.println(silinecek + " isimli memur listeden silindi.");
        } else {
            System.out.println(silinecekIsim + " isimli memur listede bulunamadı.");
        }
        System.out.println("Güncellenmiş memur listesi:");
        for (Memur memur : okul.getMemurlar()) {
            System.out.println(memur);
        }
    }

    private void memurEkle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eklenecek Memurun ismini girin.");
        String isim = scanner.nextLine();
        System.out.println("Eklenecek Memurun soyismini girin.");
        String soyisim = scanner.nextLine();
        System.out.println("Eklenecek Memurun numarasını girin.(OF-1 şeklinde)");
        String no = scanner.nextLine();

        Memur memur = new Memur(isim, soyisim, no, LocalDate.now());
        okul.getMemurlar().add(memur);
        System.out.println("Yeni Memur başarıyla eklendi.");
    }

    public void sinifaDersEkle(Sinif sinif){
        Ders ders = new Ders();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ders ekleyin");
        String secilen = scanner.nextLine();

        if(secilen.equalsIgnoreCase(Arrays.toString(EnumDersler.values()))){
            EnumDersler eklenenDers = EnumDersler.valueOf(secilen.toUpperCase());
            ders.setDers(eklenenDers);
            System.out.println("Ders " + sinif.getClass() + " sınıfına eklendi.");
        }else {
            System.out.println("Bu isimde bir ders bulunmamaktadır.");
        }
    }
    public <E> void kayitEt(List<E> list, E object) {
        list.add(object);
    }

    public <E> void kayitSil(List<E> list, E object) {
        list.remove(object);
    }

    public <E> void verileriGetir(List<E> list) {
        list.stream().forEach(x -> System.out.println(x));
    }
}






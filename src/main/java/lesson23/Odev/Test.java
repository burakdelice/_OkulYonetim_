package lesson23.Odev;

public class Test {
    public static void main(String[] args) {

        OkulYonetim yonetim = new OkulYonetim();

        yonetim.ogretmenYarat();

        yonetim.sinifYarat();
        yonetim.ogrenciveDersYarat();
        yonetim.memurYarat();

        System.out.println(yonetim.getOkul().getSiniflar().get(0));

        yonetim.menuGetir();




    }


}

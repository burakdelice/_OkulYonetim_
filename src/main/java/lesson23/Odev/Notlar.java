package lesson23.Odev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notlar {
    private Map<String, List<Integer>> dersNotlari;

    public Notlar() {
        dersNotlari = new HashMap<>();
    }

    public void notEkle(String dersAdi, int not) {
        if (dersNotlari.containsKey(dersAdi)) {
            List<Integer> notlar = dersNotlari.get(dersAdi);
            notlar.add(not);
        } else {
            List<Integer> notlar = new ArrayList<>();
            notlar.add(not);
            dersNotlari.put(dersAdi, notlar);
        }
    }

    public void notlariGetir(String dersAdi) {
        if (dersNotlari.containsKey(dersAdi)) {
           dersNotlari.get(dersAdi);
        } else {
            System.out.println("Bu derse ait bir not bulunamadı.");
        }
    }

    public void notlariGoster() {
        for (Map.Entry<String, List<Integer>> entry : dersNotlari.entrySet()) {
            String dersAdi = entry.getKey();
            List<Integer> notlar = entry.getValue();

            System.out.print(dersAdi + ": ");
            for (int not : notlar) {
                System.out.print(not + " ");
            }
            System.out.println();
        }
    }
}


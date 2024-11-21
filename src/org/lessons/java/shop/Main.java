package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        Prodotto libro = new Prodotto();
        libro.nome = "Achille";
        libro.prezzo = 10;
        libro.iva = 0.22f;
        libro.descrizione = "libro";

        System.out.println(libro.mostraIlPrezzo());
        System.out.println(libro.prezzoComprensivoIva());
        System.out.println(libro.nomeEsteso());
    }


}

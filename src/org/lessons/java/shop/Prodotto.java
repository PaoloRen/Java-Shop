package org.lessons.java.shop;

public class Prodotto {
    int codice = (int)(Math.random() * 101);
    String nome;
    String descrizione;
    int prezzo;
    int iva;



//* Metodi di prodotto
    public int mostraIlPrezzo(){
        return prezzo;
    }

    public int prezzoComprensivoIva(){
        return prezzo + (prezzo/100*iva);
    }

    public String nomeEsteso(){
        return String.valueOf(codice)+"-"+nome;
    }

}
package org.lessons.java.shop;

public class Prodotto {
    int codice = (int)(Math.random() * 101);
    String nome;
    String descrizione;
    float prezzo;
    float iva;



//* Metodi di prodotto
    public float mostraIlPrezzo(){
        return prezzo;
    }

    public float prezzoComprensivoIva(){
        return prezzo +(prezzo*iva);
    }

    public String nomeEsteso(){
        return String.valueOf(codice)+"-"+nome;
    }

}
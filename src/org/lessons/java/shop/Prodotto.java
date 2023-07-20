package org.lessons.java.shop;
import java.util.Random;

/*
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva*/
public class Prodotto {
    // ATTRIBUTI
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;


    //COSTRUTTORI

    public Prodotto( String nome, String descrizione, double prezzo,double iva) {
        // Create a Random object
        Random random = new Random();

        // Generate a random number between 1 and 999,999,999
        int randomNumber = random.nextInt(999999999) + 1;
        this.codice=randomNumber;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo=prezzo;
        this.iva = iva;
    }

    //GETTER &SETTTER

    public int getCodice() {
        return codice;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


    //METODI


    @Override
    public String toString() {
        return "Prodotto{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                '}';
    }
    // metodo prezzo base
    public double getBasePrice(){
        return prezzo;
    }

    // prezzo con iva

    public double getTaxedPrice(){
        return prezzo*(1+iva);
    }


    // metodo concatenazione codice -nome

    public String getCodeName( int number){
        // dobbiamo trovare il codicice in forma di zeri
        // converti il numero a una sstr
        String numberStr = String.valueOf(number);

        // calcolare quanti zeri devo aggiungere
        int zerosToAdd = 8 - numberStr.length();

        // Crea una stringa con gli zeri da concatenare al numero (nel caso)
        StringBuilder zeri = new StringBuilder();
        for (int i = 0; i < zerosToAdd; i++) {
            zeri.append("0");
        }

        // Concatena gli zeri con il numero originale
        zeri.append(numberStr);

        return zeri.toString();

    }
}

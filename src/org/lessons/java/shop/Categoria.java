package org.lessons.java.shop;

public class Categoria {
    // ATTRIBUTI
    private  String nome;
    private String descrizione;

    // COSTRUTTORE

    public Categoria(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    //GETT E SETT

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    //METODI
}

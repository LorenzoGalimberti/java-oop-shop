package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // richiesta dei dati
        System.out.print("inserisci il nome del prodotto : ");
        String nomeProdotto= scan.nextLine();

        System.out.print("inserisci la descrizione del prodotto : ");
        String descrizioneProdotto= scan.nextLine();

        System.out.print("inserisci il prezzo del prodotto : ");
        double prezzoProdotto= Double.parseDouble(scan.nextLine());

        System.out.print("inserisci l' iva del prodotto in decimali : ");
        double ivaProdotto= Double.parseDouble(scan.nextLine());

        // costruzione e creazione dell' istanza

        Prodotto product= new Prodotto(nomeProdotto,descrizioneProdotto,prezzoProdotto,ivaProdotto);

        System.out.println(product);


        System.out.println(product);

        System.out.println(product.getBasePrice());
        System.out.println(product.getCodeName(product.getCodice()));
        //chiusura scanner
        scan.close();
    }
}

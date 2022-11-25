package Osoba;

import java.util.Scanner;

public class Kadra extends Osoba{
    String Wyksztalcenie, Stanowisko;

    public Kadra() {
        Inicjuj1();
    }

    public void Inicjuj1(){
        Scanner scan = new Scanner(System.in);
        //Inicjuj();
        System.out.println("Proszę podać Wykształcenie:");
        Wyksztalcenie = scan.nextLine();
        System.out.println("Proszę podać Stanowisko:");
        Stanowisko = scan.nextLine();
    }
    public void Drukuj1(){
        System.out.println("Nazwisko: " + Nazwisko + "\nImie: " + Imie + "\nUlica: " + Ulica + "\nKod: " + Kod + "\nMiasto: " + Miasto + "\nWykształcenie: " + Wyksztalcenie + "\nStanowisko: " + Stanowisko);
    }
}

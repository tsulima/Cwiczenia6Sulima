package Osoba;

import java.util.Scanner;

class Kadra extends Osoba{
    String Wykształcenie, Stanowisko;

    public Kadra() {
        Inicjuj1();
    }

    public void Inicjuj1(){
        Scanner scan = new Scanner(System.in);
        Inicjuj();
        System.out.println("Proszę podać Wykształcenie:");
        Wykształcenie = scan.nextLine();
        System.out.println("Proszę podać Stanowisko:");
        Stanowisko = scan.nextLine();
    }
    public void Drukuj1(){
        System.out.println("Nazwisko: " + Nazwisko + "\nImie: " + Imie + "\nUlica: " + Ulica + "\nKod: " + Kod + "\nMiasto: " + Miasto + "\nWykształcenie: " + Wykształcenie + "\nStanowisko" + Stanowisko);
    }
}

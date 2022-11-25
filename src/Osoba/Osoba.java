package Osoba;

import java.util.Scanner;

public class Osoba {
    String Nazwisko, Imie, Ulica, Kod, Miasto;

    public Osoba() {
        Inicjuj();
    }

    public void Inicjuj(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podać Nazwisko:");
        Nazwisko = scan.nextLine();
        System.out.println("Proszę podać Imię:");
        Imie = scan.nextLine();
        System.out.println("Proszę podać Ulicę:");
        Ulica = scan.nextLine();
        System.out.println("Proszę podać Kod:");
        Kod = scan.nextLine();
        System.out.println("Proszę podać Miasto:");
        Miasto = scan.nextLine();
    }
    public void Drukuj(){
        System.out.println("Nazwisko: " + Nazwisko + "\nImie: " + Imie + "\nUlica: " + Ulica + "\nKod: " + Kod + "\nMiasto: " + Miasto);
    }

    static class Kadra extends Osoba{
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

}




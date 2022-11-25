import java.util.Scanner;
import Osoba.*;

public class Cwiczenia6Sulima {
    public static void main(String[] args) {
        System.out.println("Wpisz numer zadania");
        Scanner scanSulima = new Scanner(System.in);
        int ExcersizeIdSulima = scanSulima.nextInt();
        switch (ExcersizeIdSulima) {
            case 1: {
                Zadanie1Sulima();
                break;
            }
            case 2: {
                Zadanie2Sulima();
                break;
            }
        }
    }

    public static void Zadanie1Sulima(){
        System.out.println("Dodawanie nowej osoby:");
        Osoba osoba1 = new Osoba();
        osoba1.Drukuj();
        //System.out.println("Dodawanie nowej kadry");

    }

    public static void Zadanie2Sulima(){

    }
}

import java.util.Scanner;

import Osoba.*;
import Animal.*;

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
        //Osoba osoba1 = new Osoba();
        //osoba1.Drukuj();
        Kadra kadra = new Kadra();
        //kadra.Inicjuj1();
        kadra.Drukuj1();
        //System.out.println("Dodawanie nowej kadry");

        double zaNadgodziny, pensja = 50, wyplata;
        wyplata = kadra.wynagrodzenieDoWypłacenia(pensja, 160);
        zaNadgodziny = kadra.wynagrodzeniaZaNadgodziny(10,pensja);
        System.out.println("\nZarobki: " + (zaNadgodziny+wyplata) + "\nW tym:" +"\nZa normalną pracę: " + wyplata + "\nZa Nadgodziny: " + zaNadgodziny);



    }

    public static void Zadanie2Sulima(){
        Animal[] Zwierzeta = new Animal[6];
        Zwierzeta[0] = new Mammal("Kot", 5,7f);
        Zwierzeta[1] = new Dog("Pies", 4, 6.5f, "Czarny");
        Zwierzeta[2] = new Fish("Złota Rybka", 1,0.4f);
        Zwierzeta[3] = new Blowfish();
        Zwierzeta[4] = new Bird("Skowronek", 3,2f);
        Zwierzeta[5] = new Pigeon("Gołąb", 2, 1.5f, "Szary");
        for (Animal x:Zwierzeta) {
            x.eat();
            System.out.println(x.getAge());
            x.getVoice();
        }


    }
}

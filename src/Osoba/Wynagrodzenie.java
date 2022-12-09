package Osoba;

public interface Wynagrodzenie {

    double wynagrodzenieDoWypłacenia(double pensja, double przepracowaneGodziny);

    default double wynagrodzeniaZaNadgodziny(double nadgodziny, double pensja){
        return nadgodziny*pensja ;
    }

    static int Premia(int yearsOfExperience){
        if(yearsOfExperience>5){
            return 100;
        }
        else{
            return 0;
        }
    }
}

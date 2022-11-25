package Animal;

public class Pigeon extends Bird{
        //Zmienne
    String specie;

        //Konstruktory
    public Pigeon(){
        age=0;
        weight=0f;
    }
    public Pigeon(String name, Integer age, Float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Pigeon(String name, Integer age, Float weight,String featherColor){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.featherColor = featherColor;
    }
    public Pigeon(String name, Integer age, Float weight,String featherColor, String specie){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.featherColor = featherColor;
        this.specie = specie;
    }

        //Funkcje
    public void lookingForBread(){
        System.out.println("/looking for bread/");
    }

    public void getVoice(){
        System.out.println("/chirping/");
    }

    public void eat(){
        System.out.println("/eating bread/");
    }

        //Get & Set
    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    //ToString

    @Override
    public String toString() {
        return "Pigeon{" +
                "specie='" + specie + '\'' +
                ", featherColor='" + featherColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

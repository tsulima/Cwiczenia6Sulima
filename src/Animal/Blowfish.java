package Animal;

public class Blowfish extends Fish{
        //Zmienne
    String specie;

        //Konstruktory
    public Blowfish(){
        age=0;
        weight=0f;
    }
    public Blowfish(String name, Integer age, Float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Blowfish(String name, Integer age, Float weight,String scalesColor){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.scalesColor = scalesColor;
    }
    public Blowfish(String name, Integer age, Float weight,String scalesColor, String specie){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.scalesColor = scalesColor;
        this.specie = specie;
    }

        //Funkcje
    public void Inflating(){
        System.out.println("/inflating/");
    }

    public void getVoice(){
        System.out.println("/not making a sound/");
    }

    public void eat(){
        System.out.println("/eating fish food/");
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
        return "Blowfish{" +
                "specie='" + specie + '\'' +
                ", scalesColor='" + scalesColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

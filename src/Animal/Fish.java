package Animal;

public class Fish extends Animal {
        //Zmienne
    String scalesColor;

        //Konstruktory
    public Fish(){
        age=0;
        weight=0f;
    }
    public Fish(String name, Integer age, Float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Fish(String name, Integer age, Float weight,String scalesColor){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.scalesColor = scalesColor;
    }

        //Funkcje
    public void Swim(){
        System.out.println("/swimming/");
    }

        //Get & Set
    public String getScalesColor() {
        return scalesColor;
    }

    public void setScalesColor(String scalesColor) {
        this.scalesColor = scalesColor;
    }

    //ToString
    @Override
    public String toString() {
        return "Fish{" +
                "scalesColor='" + scalesColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

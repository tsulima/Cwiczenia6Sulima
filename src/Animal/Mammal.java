package Animal;

public class Mammal extends Animal{
        //Zmienne
    String furColor;

        //Konstruktory
    public Mammal(){
        age=0;
        weight=0f;
    }
    public Mammal(String name, Integer age, Float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Mammal(String name, Integer age, Float weight,String furColor){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.furColor = furColor;
    }

        //Funkcje
    public void running(){
        System.out.println("/running/");
    }

        //Get & Set
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    //ToString
    @Override
    public String toString() {
        return "Mammal{" +
                "furColor='" + furColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

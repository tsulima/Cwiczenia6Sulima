package Animal;

public class Bird extends Animal{
        //Zmienne
    String featherColor;

        //Konstruktory
    public Bird(){
        age=0;
        weight=0f;
    }
    public Bird(String name, Integer age, Float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Bird(String name, Integer age, Float weight,String featherColor){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.featherColor = featherColor;
    }

        //Funkcje
    public void flying(){
        System.out.println("/flying/");
    }

        //Get & Set
    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    //ToString
    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

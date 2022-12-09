package Animal;
import java.util.Scanner;


public abstract class Animal {
        //Zmienne
    String name;
    Integer age;
    Float weight;

        //Konstruktory
    public Animal(String name, Integer age, Float weight){
        //Scanner scan = new Scanner(System.in);
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Animal(String name){
        this.name = name;
    }
    public Animal(){
        age=0;
        weight=0f;
    }

        //Funkcje
    public void eat(){
        System.out.println("/eating/");
    }
    public void getVoice(){
        System.out.println("/Making a sound/");
    }

        //Get & Set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    //ToString
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

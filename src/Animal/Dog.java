package Animal;

public class Dog extends Mammal{
        //Zmienne
    String breed;
        //Konstruktory
    public Dog(){
        age=0;
        weight=0f;
    }
    public Dog(String name, Integer age, Float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Dog(String name, Integer age, Float weight,String furColor){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.furColor = furColor;
    }
    public Dog(String name, Integer age, Float weight,String furColor, String breed){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.furColor = furColor;
        this.breed = breed;
    }
        //Funkcje
    public void tailWagging(){
        System.out.println("/wagging tail/");
    }

    public void getVoice(){
        System.out.println("/barking/");
    }

    public void eat(){
        System.out.println("/eating dog food/");
    }

        //Get & Set
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //ToString
    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", furColor='" + furColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

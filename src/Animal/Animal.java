package Animal;
import java.util.Scanner;


public class Animal {
    String name;
    Integer age;
    Float weight;

    public Animal(String name, Integer age, Float weight){
        //Scanner scan = new Scanner(System.in);
        name = this.name;
        age = this.age;
        weight = this.weight;
    }
    public Animal(String name){
        name = this.name;
    }
    public Animal(){

    }

    public void eat(){
        System.out.println("/eating/");
    }
    public void getVoice(){
        System.out.println("/Making a sound/");
    }

}

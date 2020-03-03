package org.example;

public class Cat extends Animal implements SoundAnimal {

    public Cat(String name , String coluor){
        super(name, coluor);
    }

    public void sound(){
        System.out.println("Meewww!!!!!!!");
    }
}

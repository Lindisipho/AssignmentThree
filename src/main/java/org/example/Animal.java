package org.example;

public class Animal {

    private String name;
    private String colour;

    public Animal(String name, String coluor) {
        this.name = name;
        this.colour = coluor;
    }

    public String getName(){
        return name;

    }

    public String getColour() {
        return colour;
    }

    public void sound(){
        System.out.println("Sound ...");
    }

    public String toString(){
        return "Animal{" + "name=' " + name+ '\'' + "colour=' " + colour +'}';
    }
}

package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //System.out.println(animal1.equals(animal2)); //Equals
        //System.out.println(animal1); //To string

    Animal animal1 = new Animal(01, "Tiger", "Raubkatze", 5);
    Animal animal2 = new Animal(02, "Löwe", "Raubkatze", 2);
    Animal animal3 = new Animal(03, "Kugelfisch", "Meerestier", 6);
    Animal animal4 = new Animal(04, "Krokodil", "Raubtier", 25);



    Owner owner1 = new Owner("Christian", 37, "Harz");
    Owner owner2 = new Owner("Sanela", 34, "München");
    Owner owner3 = new Owner("Barbara", 39, "Hamburg");
    Owner owner4 = new Owner("Dominik", 33, "Dorf im Norden");

    Species species1 = new Species(animal1.species(), 300);
    Species species2 = new Species(animal1.species(), 300);
    Species species3 = new Species(animal3.species(), 200);
    Species species4 = new Species(animal4.species(), 600);


    Map<Owner, Animal> JavaFarm = new HashMap<>();

        JavaFarm.put(owner1, animal1);
        JavaFarm.put(owner2, animal1);
        JavaFarm.put(owner2, animal2);
        JavaFarm.put(owner3, animal3);
        JavaFarm.put(owner4, animal4);
        System.out.println(JavaFarm);

        for(Map.Entry<Owner, Animal> entry : JavaFarm.entrySet()){
            Owner owner = entry.getKey();
            Animal animal = entry.getValue();

            System.out.println(owner.name() +" has a " + animal.name());
        }


    }
}


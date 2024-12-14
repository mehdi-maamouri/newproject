package edu.zoomanagementcs.tests;

import edu.zoomanagementcs.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        //Constructeur
        Animal lion = new Animal("Carnivore", "Lion", 4, true);
        System.out.println(lion.getName());
        System.out.println(lion.getAge());

        //Constructeur paramètré
        Animal chat = new Animal("Carnivore", "Chat", 2, true);
        System.out.println(chat.getName());
        System.out.println(chat.getAge());

        Animal daulphin = new Animal("Carnivore", "Dauphin", 3);
        System.out.println(daulphin.isMammal());

        Zoo myZoo = new Zoo("Belvedere", "Tunis");
        Zoo myZoo2 = new Zoo("Friguia", "Bouficha");
        // System.out.println(myZoo.animals.length);


        myZoo.addAnimal(lion);
        System.out.println(myZoo.addAnimal(chat));
        System.out.println("----> "+myZoo.addAnimal(daulphin));
        myZoo.displayZoo();
        System.out.println("-----------");
       // System.out.println(lion);

        System.out.println(myZoo);


        Animal oiseau = new Animal("Herbivore","Canard",2,false);

        System.out.println(myZoo.searchAnimal(oiseau));
        System.out.println("===========================");
        System.out.println("nbAnimaux dans myZoo:" + myZoo.getNbAnimaux());
        System.out.println("nbTotal:" + myZoo.nbTotal);
        myZoo2.addAnimal(oiseau);
        System.out.println("nbAnimaux dans myZoo2:" + myZoo2.getNbAnimaux());
        System.out.println("nbTotal:" + myZoo2.nbTotal);
        System.out.println("===========================");
        System.out.println(myZoo.isZooFull());

        Zoo myZoo3 = new Zoo("Carthage land","Hammamet");
        System.out.println(Zoo.comparerZoo(myZoo,myZoo2));

        Aquatic tortue = new Aquatic();
        Animal animal = new Animal();
        Terrestrial giraffe = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        System.out.println("==========TOSTRING()============");
        System.out.println(tortue.toString());
        System.out.println(animal);
        System.out.println(giraffe.toString());
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());

        System.out.println("============SWIM()=========");

        tortue.swim();
        dolphin.swim();
        penguin.swim();
    }

}

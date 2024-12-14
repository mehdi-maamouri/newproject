package edu.zoomanagementcs.entities;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    public final int NB_CAGES = 25;
    private int nbAnimaux;
    public static int nbTotal=0;


    public Zoo() {

        animals = new Animal[NB_CAGES];
        this.name="ZooName";
    }

    public Zoo(String name, String city) {
        if(!name.isEmpty())
        this.name = name;
        else {
            System.out.println("Nom du Zoo ne doit pas etre vide");
            this.name="ZooName";
        }
        this.city = city;
        //this.nbCages = nbCages;
        this.animals = new Animal[NB_CAGES];
    }

    public void displayZoo() {
        System.out.println("Name: " + name + " , city:" + city + ", nbCages:" + NB_CAGES + ", nbAnimaux:" + nbAnimaux);
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].getName() + " , " + animals[i].getAge());
            } else break;
        }
    }

    public void displayZoo2() {
        System.out.println("Name: " + name + " , city:" + city + ", nbCages:" + NB_CAGES + ", nbAnimaux:" + nbAnimaux);
        for (int i = 0; i < nbAnimaux; i++) {
            System.out.println(animals[i].getName() + " , " + animals[i].getAge());
        }
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) == -1) {
            if (!isZooFull()) {
                animals[nbAnimaux] = animal;
                nbAnimaux++;
                nbTotal++;
                System.out.println(animal.getName() + " est ajouté dans le zoo");
                return true;
            } else return false;
        } else {
            System.out.println("Animal existant");
            return false;
        }
    }

    public String toString() {
        String ch1 = "", ch2 = "";
        ch1 = "Name: " + name + " ,city:" + city + " ,nbAnimaux:" + nbAnimaux + "\n";
        for (int i = 0; i < nbAnimaux; i++) {
            ch2 = ch2 + animals[i] + "\n";
        }
        return ch1 + ch2;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbAnimaux; i++) {
            if (animals[i].getName().equals(animal.getName()) == true) {
                return i;
            }
        }
        return -1;
    }


    public boolean isZooFull() {
    /*
        if (nbAnimaux < NB_CAGES) {
            return true;
        } else
            return false;

     */
        return (nbAnimaux == NB_CAGES);
        // return (nbAnimaux < NB_CAGES ? true : false);
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbAnimaux > z2.nbAnimaux)
            return z1;
        else if(z1.nbAnimaux < z2.nbAnimaux)
            return z2;
        else
            System.out.println("Les deux zoos sont égaux");
        return z2;
    }

    public Animal[] getAnimals(){
        return animals;
    }

    public void setAnimals(Animal[] animals){
        this.animals = animals;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public int getNbAnimaux(){
        return nbAnimaux;
    }

    public void setNbAnimaux(int nbAnimaux){
        this.nbAnimaux = nbAnimaux;
    }
}

package edu.zoomanagementcs.entities;
public sealed class Animal permits Aquatic,Terrestrial {

    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal(){

    }


    /*
    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

     */

    public Animal(String familyA, String nameA, int ageA, boolean isMammalA){
        family = familyA;
        name = nameA;
        age = ageA;
        isMammal = isMammalA;
    }

    public Animal(String family, String name, int age){
        this.family = family;
        this.name = name;
        if(age>0)
        this.age = age;
        else
        {
            System.out.println("Age ne doit pas etre négatif");
            this.age =0;
        }
    }

    @Override //Redéfiniton
    public String toString(){
        return "Family: "+family +", Name:"+name +", age:"+age;
    }

    public String getFamily(){
        return family;
    }

    public void setFamily(String family){
        this.family = family;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isMammal(){
        return isMammal;
    }

    public void setMammal(boolean isMammal){
        this.isMammal = isMammal;
    }

    public void traiter(){

    }
    public void traiter(int x){

    }
    public void traiter(String m){

    }

    public void traiter(int x, String m){

    }

    public void traiter(String m, int x){

    }

    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }
}

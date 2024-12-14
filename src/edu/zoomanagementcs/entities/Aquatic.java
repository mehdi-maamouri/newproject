package edu.zoomanagementcs.entities;

public sealed class Aquatic extends Animal permits Penguin,Dolphin {

    protected String habitat;

    public Aquatic(){
        super();
    }

    /*
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
        super(family,name,age,isMammal);
        this.habitat = habitat;
    }

     */

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
        //super();
        this.family =family;
        this.name = name;
        this.age = age;
        this.isMammal =isMammal;
        this.habitat = habitat;
    }

    public String getHabitat(){
        return habitat;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    @Override
    public String toString(){
     return super.toString()+", habitat:"+habitat;
    }

    public final void tester(){

    }

}
// bonjour world
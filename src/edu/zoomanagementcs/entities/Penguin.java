package edu.zoomanagementcs.entities;

public non-sealed class Penguin extends Aquatic{
    private float swimmingDepth;

    public Penguin(){
        super();
    }
    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth){

        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;

    }

    public float getSwimmingDepth(){
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth){
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString(){
        return super.toString()+", swimming depth:"+swimmingDepth;
    }

}
//merci
package com.company;

public class Animal {
    //field variables
    private boolean isVegetarian;
    private boolean isCarnivore;
    private String eats;
    private int numOfLegs;

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void setCarnivore(boolean carnivore) {
        isCarnivore = carnivore;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
public void sound(){
    System.out.println("Animals have sound");
}
    //constructor
   public Animal(){

   }
    public Animal(boolean veg,boolean carn,String food,int legs){
this.isVegetarian=veg;
this.isCarnivore=carn;
this.eats=food;
this.numOfLegs=legs;

    }


}

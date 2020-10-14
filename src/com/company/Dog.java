package com.company;

public class Dog extends Animal{
    public Dog(boolean veg,boolean carn,String food,int legs){
        super(veg,carn,food,legs);
        this.color="brown";

    }


    public String getColor() {
        return color;
    }



    public void setColor(String sound) {
        this.color = color;
    }

    private String color;


}

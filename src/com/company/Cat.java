package com.company;

public class Cat extends Animal {
    public Cat(boolean veg,boolean carn,String food,int legs) {
        super(veg,carn,food,legs);
        this.color = "white";
    }
    public String getColor() {
        return color;
    }



    private String color;


    public void setColor(String color) {
        this.color = color;
    }




}

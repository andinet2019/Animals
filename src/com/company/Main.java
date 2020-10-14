package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat cat=new Cat(false,true,"Milk",4);
        Dog dog=new Dog(false,true,"Meat",4);
        System.out.println(" Is Cat a Vegeterian? "+ cat.isVegetarian());
        System.out.println(" Is Dog a Vegeterian? "+ dog.isVegetarian());
        System.out.println(" Is Dog a Carnivore? "+ dog.isCarnivore());
        System.out.println(" Is Cat a Carnivore? "+ cat.isCarnivore());
        System.out.println(" Cat eats "+ cat.getEats());
        System.out.println(" Dog eats "+ dog.getEats());
        System.out.println("Cat has "+cat.getNumOfLegs()+" legs");
        System.out.println("Dog has "+dog.getNumOfLegs()+" legs");

        System.out.println("The Dog color is "+dog.getColor());
        System.out.println("The Cat color is "+cat.getColor());
        System.out.println();

    }
}

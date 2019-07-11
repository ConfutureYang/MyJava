package com.confuture.china;

import com.confuture.animal.Animal;

public class Dog extends Animal {
//    public  String category = "Dog";
    public int age = 10;
    public String name = "china dog";

    public void spark (){
        Animal ani = new Animal();
        System.out.println("Dog.category:"+ Dog.category);

        System.out.println("catogry:"+ category);
        System.out.println("China Dog Spark");
        System.out.println("name:"+ name);
//        System.out.println("");

    }

    @Override
    public void run() {
        System.out.println("china dog run");
    }

    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.spark();
        dog1.run();

    }
}


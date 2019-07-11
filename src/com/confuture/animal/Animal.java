package com.confuture.animal;


public class Animal {
    public static String category = "Animal";
    private String IdNo = "001";
    protected String name = "momo";
    int age = 3;

    public void walk(){
        System.out.println("Animal walk");
    }

    public static void main(String[] args){
//        Dog dog1 = new Dog();
//        dog1.spark();
//        System.out.println("IdNo:"+ this.IdNo);
//        System.out.println();
    }

    protected void run(){
        System.out.println("Animal run");
    }

}
//
//class Dog extends Animal {
//    public int age = 5;
//
//    public void spark (){
//
//        Animal ani = new Animal();
//        System.out.println("ani.age:"+ ani.name);
//        System.out.println("age:"+ this.age);
//        ani.run();
//
//        System.out.println("China Dog Spark");
//        System.out.println("name:"+ this.name);
//        System.out.println("age:"+ this.age);
////        System.out.println("IdNo:"+ this.IdNo);
//
//    }
//}

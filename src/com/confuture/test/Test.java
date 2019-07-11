package com.confuture.test;

import com.confuture.china.Dog;


public class Test {
    String a = "aaa";
    static String className = "Test";


    void variables (){
        System.out.println("a:" + this.a);
        System.out.println("className:" + this.className);
    }

    public static void main(String[] args){
        Test test = new Test();
        test.variables();

    }
}

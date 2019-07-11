package com.confuture.collections;

import java.util.*;

public class Collections {


    void testArrayList(){
        List array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add("a");
        array.add(0,"bcbcb");
        System.out.println("array:" + array.toString());
        System.out.println("array length:" + array.size());
    }

    void testHashMap(){
        HashMap map = new HashMap();
        map.put("name","yangfeihu");
        map.put("age",26);
        for (Object key:map.keySet()){
            System.out.println("key:" + key + " value:" + map.get(key));
        }
        System.out.println("map:"+map.toString());
    }

    void testArray(){
        int[] array = new int[5];
        array[2] = 11;
        System.out.println("array[2]:"+ Arrays.toString(array));
    }

    void testGeneric(){
        Map<String,String> map = new HashMap<>();
        map.put("age","26");
        System.out.println("map:"+map.toString());
    }

    void testLinkList(){
        List linkList = new LinkedList();
        linkList.add("1");
        linkList.add("2");
        System.out.println("linkList:"+linkList.toString());
    }

    public static void main(String[] args){
        Collections collections = new Collections();
//        collections.testArray();
//        collections.testArrayList();
//        collections.testHashMap();
//        collections.testGeneric();
//        collections.testLinkList();
    }
}

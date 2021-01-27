package main.com.kaptsiug.study.project.controller;

import main.com.kaptsiug.study.project.model.OwnArrayList;

public class Main {

    public static void main(String[] args) {
        //creating new own collection
        OwnArrayList<Integer> arrayList = new OwnArrayList<>();

        //adding elements in collection
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(4); //in this operation array length is increasing
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(7);

        //check array size
        System.out.println(arrayList.size());

        //delete element in array and check
        Integer removedElem = arrayList.remove(4);
        System.out.println(removedElem);

        //check. that array size has decreased
        System.out.println(arrayList.size());

        //check getting element
        System.out.println(arrayList.get(1));

        //set new element into collection and check
        arrayList.set(1, 6);
        System.out.println(arrayList.get(1));

        //Iterating elements in collection
        for(Integer item : arrayList) {
            System.out.print(item + " ");
        }

    }
}

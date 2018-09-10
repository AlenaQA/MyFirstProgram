package com.sidenis.robots;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*String [] catName = new String[5];

        catName[0] = "Barsik";
        catName[1] = "Myaut";g
        catName[2] = "Rafael";
        catName[3] = "Gosha";
        catName[4] = "Leopold";

        /*for(int i = 0; i < 5; i++) {
            System.out.println(catName[i]);
        } */

        /*int i = 0;
        while (i < catName.length) {
            System.out.println(catName[i]);
            i++;
        }

        System.out.println("Array length is " + catName.length); */

        //Map<String, Cat> mapOfCats = new HashMap<String, Cat>();

        List<Cat> listOfCats = new ArrayList<Cat>();

        Cat catOne = new Cat("Barsik", 2);
        Cat catTwo = new Cat("Barsik", 2);
        Cat catThree = new Cat("Rafael", 3);
        Cat catFour = new Cat("Gosha", 7);
        Cat catFive = new Cat("Leopold", 9);

        listOfCats.add(catOne);
        listOfCats.add(catTwo);
        listOfCats.add(catThree);
        listOfCats.add(catFour);
        listOfCats.add(catFive);

        /*mapOfCats.put(catOne.name, catOne);
        mapOfCats.put(catTwo.name, catTwo);
        mapOfCats.put(catThree.name, catThree);
        mapOfCats.put(catFour.name, catFour);
        mapOfCats.put(catFive.name, catFive); */

        System.out.println("-------------------------------------------");
        System.out.println(listOfCats.get(1).name);
        listOfCats.get(1).move();




        /*System.out.println(catOne.hashCode());
        System.out.println(catTwo.hashCode());
        System.out.println(catThree.hashCode());
        System.out.println(catFour.hashCode());
        System.out.println(catFive.hashCode());*/
    }
}

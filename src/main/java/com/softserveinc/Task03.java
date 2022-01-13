package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = (int) scanner.nextInt();
        System.out.println(">>> Write how many ml of milk the coffee machine has: ");
        int milk = (int) scanner.nextInt();
        System.out.println(">>> Write how many grams of coffee beans the coffee machine has: ");
        int beans = (int) scanner.nextInt();
        System.out.println(">>> Write how many cups of coffee you will need: ");
        int cups = (int) scanner.nextInt();

//My initial solution
/*      int waterneed = cups*200;
        int milkneed = cups*50;
        int beansneed = cups*15;
        if (((waterneed + 200) <= water) && ((milkneed + 50) <= milk) && ((beansneed + 15) <= beans)) {
            int waterleft = (water - waterneed) / 200;
            int milkleft = (milk - milkneed) / 50;
            int beansleft = (beans - beansneed) / 15;
            int min = Math.min(waterleft, milkleft);
            min = Math.min(min, beansleft);
            System.out.println(">>> Yes, I can make that amount of coffee (and even " + min + " more than that)");
        }
        else if ((water < waterneed) || (milk < milkneed) || (beans < beansneed)) {
            int waterallowed = water / 200;
            int milkallowed = milk / 50;
            int beansallowed = beans / 15;
            int min = Math.min(waterallowed, milkallowed);
            min = Math.min(min, beansallowed);
            System.out.println(">>> No, I can make only " + min + " cup(s) of coffee");
        }
        else{
            System.out.println(">>> Yes, I can make that amount of coffee");
        }*/


  //adjusted solution
        int min = Math.min(Math.min(water/200, milk/50), beans);
        if (cups == min){
            System.out.println(">>> Yes, I can make that amount of coffee");
        }
        else if (cups<min){
            System.out.printf(">>> Yes, I can make that amount of coffee (and even %d more than that)", min-cups);
        }
        else{
            System.out.printf(">>> No, I can make only %d cup(s) of coffee", min);
        }
    }


}

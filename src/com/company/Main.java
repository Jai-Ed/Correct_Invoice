package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // create array list
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        products.add("Bison Sweater");
        products.add("Bison Tee");
        products.add("Bison Hoodie");
        products.add("Bison Bumper Sticker");
        prices.add(55.99);
        prices.add(14.99);
        prices.add(23.99);
        prices.add(4.99);

        // add loop
        ArrayList<String> purchases = new ArrayList<>();


        int input = 0;

        while (input != 4)
        {
            System.out.println();
            System.out.println("What would you like to do?");

            System.out.println("0. buy sweater ($55.99), 1. buy tee ($14.99), 2.buy hoodie ($23.99), 3. buy stickers ($4.99), 4.finish");
            Scanner key = new Scanner(System.in);
            input = key.nextInt();
            if (input >= 0 && (input < 4)) {
                purchases.add (products.get(input));}
            double totalcost = 0.0;
            for (int i = 0; i < purchases.size(); i++)
            {
                int b = 0;
                do {
                    if (purchases.get(i). equals(products.get(b)) )
                    {
                        totalcost= totalcost + prices.get(b);
                    }
                    b++;
                } while (b < products.size());



            } System.out.println("You bought the following items and this is your total : "+ "$" + totalcost);
            System.out.println(purchases);
        }}}



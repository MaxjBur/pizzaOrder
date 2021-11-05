package com.company;

import java.util.ArrayList;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        boolean y = true;
        boolean z = true;
        boolean w = true;
        double total = 0;
String toppingchoice;
int size=0;
        ArrayList<String> toppingslist = new ArrayList<>();

        int toppings = 0;
        try {

            while (x) {

                while (z) {
                    System.out.println("What size pizza do you want, 1, 2 or 3?");
                     size = scanner.nextInt();
                    if (size == 1) {
                        total = 7.99;
                        z = false;
                    } else if (size == 2) {
                        total = 10.99;
                        z = false;
                    } else if (size == 3) {
                        total = 13.99;
                        z = false;
                    } else {
                        System.out.println("Choose a correct size");
                    }
                }
                while (y) {
                    System.out.println("How many extra toppings, maximum 5 ");
                    toppings = scanner.nextInt();
                    if (toppings > 5) {
                        System.out.println("Number is too big");
                    } else if (toppings < 0) {
                        System.out.println("Number is too small");
                    } else {
                        y = false;
                    }
                    for (int i = 0; i < toppings; i++) {
                        System.out.println("What topping would you like?");
                         scanner.nextLine();
                        toppingchoice = scanner.nextLine();
                        toppingslist.add(toppingchoice);

                    }


                }


                total = total + (1.25 * toppings);
                System.out.println("your total is £" + total);
                System.out.println("Your size is " + size + " Your toppings are " + toppingslist);

                while (w) {
                    System.out.println("Would you like another pizza, Y or N?");
                    String morePizza = scanner.nextLine();
                    if (morePizza.equals("Y")){
                        w = false;
                    } else if (morePizza.equals("N")) {
                        x = false;
                        w = false;

                    } else {
                        System.out.println("enter Y or N");
                    }
                }


            }
        } catch (Exception e) {
            System.out.println("Exception occurred " + e);
            scanner.next();
        }


    }
}




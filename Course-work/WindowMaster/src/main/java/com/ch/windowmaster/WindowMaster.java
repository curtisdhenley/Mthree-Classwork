package com.ch.windowmaster;

import java.util.Scanner;

/**
 *
 * @author Curtis Henley email: henleydcurtis@gmail.com date created: 08-02-2022
 */
public class WindowMaster {

    public static void main(String[] args) {
        //        declare vars for height and width that will be converted from strings
        float height;
        float width;

        //        delcare string vars to take in user provided height and width
        String stringHeight;
        String stringWidth;

//        declare vars that will hold cost, area, and perimeter of window
        float area;
        float perimeter;
        float cost;

//        declare and import scanner
        Scanner sc = new Scanner(System.in);

// create user interface
        System.out.println("Please enter the height of the window");
        stringHeight = sc.nextLine();
        System.out.println("Please enter the width of the window");
        stringWidth = sc.nextLine();

//        convert user input into float numbers
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

//        create car that holds teh area
        area = width * height;

// create var that holds the perimeter
        perimeter = (width * 2) + (height * 2);

//        calculate cost
        cost = ((3.50f * area) + (2.25f * perimeter));

//        display results
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + area);
        System.out.println("Window perimeter = " + perimeter);
        System.out.println("The total = " + cost);

    }
}

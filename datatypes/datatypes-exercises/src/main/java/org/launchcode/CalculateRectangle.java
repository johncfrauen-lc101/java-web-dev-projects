package org.launchcode;
import java.util.Scanner;
public class CalculateRectangle {
    public static void main(String[] args){
        double length;
        double height;

        Scanner input = new Scanner(System.in);
        System.out.println("Please provide the length of the rectangle");
        length = input.nextDouble();

        System.out.println("Please provide the width of the rectangle");
        height = input.nextDouble();

        input.close();

        System.out.println("The area of the rectangle is " + (length * height));

    }
}

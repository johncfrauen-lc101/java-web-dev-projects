package org.launchcode;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("hello, what is your name?");
        String name = input.nextLine();
        input.close();

        System.out.println("Hello " + name);
    }
}

import java.util.Scanner;

public class WhatToWear {

    public static void main(String[] args){

//        Ask what the weather is first
        System.out.println("What is the weather?");

        Scanner reader = new Scanner(System.in);
        String weatherToday = reader.nextLine();

//        Now ask the temperature
        System.out.println("What is the temperature?");

        Scanner reader2 = new Scanner(System.in);
        int tempToday = reader2.nextInt();

        if (weatherToday.equals("Sunny") && tempToday >= 11){
            System.out.println("Wear a t-shirt and jeans!");
        } else if (weatherToday.equals("rainy") || weatherToday.equals("cloudy")){
            System.out.println("Better bring a raincoat!");
        } else if (weatherToday.equals("hail") || weatherToday.equals("snow")){
            System.out.println("Wear lots of layers");
        } else {
            System.out.println("You choose");
        }
    }
}

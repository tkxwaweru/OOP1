package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("This system will determine if you qualify for University admission.");
        System.out.println("You will be required to enter your KCSE grade, Interview question and confidence level scores.");
        System.out.println("Kindly enter your KCSE grade score: ");
        int kcse = input.nextInt();
        System.out.println("Kindly enter your Interview questions score: ");
        int intq = input.nextInt();
        System.out.println("Kindly enter your confidence level score: ");
        int conf = input.nextInt();
        if(kcse >=65){
            if(intq >=6 || conf >=5){
                System.out.println("You qualify for University admission.");
            }
            else{
                System.out.println("Unfortunately you are rejected.");
            }
        }
        else{
            System.out.println("Unfortunately you are rejected.");
        }







    }
}

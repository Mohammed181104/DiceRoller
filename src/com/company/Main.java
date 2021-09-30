package com.company;


import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter number of sides for your dice:");
        int diceSides = input.nextInt();
        System.out.println("How many rolls:");
        double diceRolls = input.nextDouble();

        int[] results = new int[diceSides];

        for(int i = 0; i < diceRolls; i++){
            int roll = random.nextInt(diceSides);
            results[roll] = results[roll] + 1;
        }
        for(int j = 0; j < diceSides;j++){
            double percent = results[j]/diceRolls*100;
            int k = j+1;
            System.out.println(k + " = "+percent+"%");
        }
        //System.out.println(Arrays.toString(results));
    }
}

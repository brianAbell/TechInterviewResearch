package com.company;

import java.util.Random;
import java.util.Scanner;


public class Inventory {
    public static void main(String[] args) {
        Inventory invent = new Inventory();
        invent.solveProb();
    }


    private void solveProb() {
        int numbers;
        Scanner input = new Scanner(System.in);
        numbers = input.nextInt();
        int c1,k1;
        c1 = input.nextInt();
        k1 = input.nextInt();


        int []de = new int[numbers];
        Random rand = new Random();
        for (int i = 0; i < numbers; i++) {
            de[i] = rand.nextInt(10) + 1;
        }

        int st = rand.nextInt(20) + 1;
        int [][]dp = new int[numbers + 1][st + 1];

        for (int i = 0; i < numbers; i++) {
            for (int j = 0; j <= st; j++) {
                if (i == 0){
                    dp[i][j] = k1;
                }
                else {
                    if (j >= de[i]){
                        dp[i][j - de[i]] = Math.min(dp[i - 1][j] + c1*j, dp[i][j - de[i]]);
                    }
                    dp[i][j] = dp[i - 1][0] + k1;
                }
            }
        }
        
        for (int i = 0; i < numbers; i++) {
            System.out.print(de[i]+" ");
        }
        System.out.println("\n"+st);
        System.out.println(dp[numbers - 1][0]);


    }
}

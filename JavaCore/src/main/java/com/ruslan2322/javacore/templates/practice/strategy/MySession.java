package com.company.practice.strategy;

import java.util.Scanner;

public class MySession {
    private final int YES = 1;
    private final int NO = 2;



    public static void confirmOperation(){
        Scanner sc1 = new Scanner(System.in);
        int confirm = sc1.nextInt();
        int trying = 0;
        System.out.println("If you really want to do this procedure" +
                "Please push number and Enter:" +
                "\n1.For Confirm.\"" +
                "\n2.For Cancel.");
        while(trying <= 10){
            if (confirm == 1){
                System.out.println("Thank you for choosing our bank!");
                trying = 10;
                break;
            } else if (confirm == 2){
                System.out.println("Want you choose new operation?");
                trying = 10;
                break;
            } else {
                System.out.println("ERROR. Please try again.");
            }
        }
    }

    public void clientProcedure(){

        System.out.println("Hi, Dear client!"+
                "\nPlease set number of operation and push Enter: " +
                "\n1.Check your balance." +
                "\n2.Withdraw money from your count." +
                "\n3.Put money on your count." +
                "\n4.Block card." +
                "\n5.Finish session.");

        Scanner sc = new Scanner(System.in);
        int chose = sc.nextInt();

        if (chose == 1){
            System.out.println("Your balance is :: 340$");
        }else if (chose == 2){
            confirmOperation();

        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int m=sc.nextInt();

        for(int i=1; i<=m; i++){
            if(i%3==0){
                System.out.println(i);
            }



        }


    }
}

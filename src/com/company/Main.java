package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the row:");
        int row1 = input.nextInt();
        System.out.println("Input the column");
        int col1 = input.nextInt();
        double[][] arr = new double[row1][col1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the element at row " + i + " and col " + j);
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.println("Total array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        double maxElement = arr[0][0];
        int rowOfMax = 0, colOfMax = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(maxElement < arr[row][col]){
                    maxElement = arr[row][col];
                    rowOfMax = row;
                    colOfMax = col;
                }
            }
        }
        System.out.println("Max element is " + maxElement + " at row " + rowOfMax + ", col " + colOfMax);
    }
}

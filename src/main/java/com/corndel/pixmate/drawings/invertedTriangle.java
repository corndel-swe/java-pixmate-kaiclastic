package com.corndel.pixmate.drawings;

public class invertedTriangle {
    public static void main(String[] args) {
        /*
         ******
         *****
         ****
         ***
         **
         *
         */
        int height = 5;
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

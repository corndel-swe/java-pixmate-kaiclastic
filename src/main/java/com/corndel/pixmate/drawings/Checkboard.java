package com.corndel.pixmate.drawings;

public class Checkboard {
    public static void main(String[] args) {
        /*
         * * * * *
         * * * *
         * * * * *
         * * * * System.out.print(" * ");
         * * * * *
         */

        String symbol = "*";
        int rows = 5;
        for (int i = 1; i <=  rows; i++) {

            if (i%2==0){
              System.out.print("  ");
              rows = 4;
            }
            for (int j = 1; j <= rows ; j++) {
                System.out.print("  *  ");
            }
            System.out.println();
            rows=5;
        }

    }


}



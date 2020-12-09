package com.codegym.task.task20.task2026;

/* 
Rectangle algorithms

*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Must be 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Must be 4");
    }

    public static int getRectangleCount(byte[][] a) {

        int rectangleCount = 0;
        int rowLengths = a[0].length;
        int columnLengths = a.length;
        int columnNumber = 0;
        int width;
        for (int i = 0; i < columnLengths; i++){
            for (int j = 0; j < rowLengths; j++){
                if (a[i][j] == 1){
                    rectangleCount++;
                    a[i][j] = 0;
                    columnNumber =j;
                    for (int k = j+1; k < rowLengths; k++){
                        if (a[i][k] == 1){
                            columnNumber = k;
                            a[i][k] = 0;
                        } else break;
                    }
                    for (int l = i + 1; l < columnLengths; l++){
                        if (checkWidth(a, l, j, columnNumber )){
                            for (int m = j; m <= columnNumber; m++){
                                a[l][m] = 0;
                            }
                        } else break;
                    }
                }
            }
        }
        return rectangleCount;
    }

    public static boolean checkWidth(byte[][] a, int column, int startPoint, int endPoint){
        for (int i = startPoint; i <= endPoint; i++){
            if (a[column][i]==0) return false;
        }
        return true;
    }
}

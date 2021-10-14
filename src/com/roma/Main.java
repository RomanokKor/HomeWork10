package com.roma;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество строк и столбцов");
        Scanner s = new Scanner(System.in);
        int[][] mtx = new int[s.nextInt()][s.nextInt()];

        for (int i = 0; i < mtx.length; i++) {

            for (int j = 0; j < mtx[i].length; j++){
                System.out.println("Введите элемент массива в строке "  + (i + 1) + " столбец " + (j + 1));
                mtx[i][j] = s.nextInt();
            }
        }
        int[] arr = new int[mtx[0].length];
        for (int i = 0; i < mtx[0].length; i++) {
            arr[i] = mtx[0][i] * 3;

        }
        System.out.println(Arrays.toString(arr));

    }
}

package Lab2;

import java.util.ArrayList;
import java.util.Random;

public class Task5 {
    public static int[][] newMass(int i, int j) {
        int[][] a = new int[i][j];
        Random initArray = new Random();
        int max = 10;
        int min = -10;
        int diff = max - min;
        int c;
        for (int n = 0; n < i; n++)
            for (int x = 0; x < j; x++) {
                c = initArray.nextInt(diff + 1);
                a[n][x] = c + min;
            }
        return a;
    }

    public static void main(String[] argc) {
        int[][] mass = newMass(8, 8);
        int countLocal = 0;
        for (int i = 1; i < mass.length - 1; i++) {
            for (int j = 1; j < mass[i].length - 1; j++)
                if ((mass[i][j] < mass[i+1][j]) && (mass[i][j] < mass[i][j+1]) && (mass[i][j] < mass[i-1][j]) && (mass[i][j] < mass[i][j-1]))
                {
                    countLocal ++;
                    System.out.printf("[%d][%d] %d\n", i, j, mass[i][j]);
                }

        }
        System.out.printf("The amount of local minimums is %d", countLocal);
    }
}

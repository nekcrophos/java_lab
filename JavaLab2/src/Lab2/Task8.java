package Lab2;

import java.util.Arrays;
import java.util.Collections;

public class Task8 {
    public static void main(String[] argc) {
        Integer[] temp = {-2, -5, -2, -4, 3, -6, -2, -1, 5, 1, 1, 0, -1, 0, 3, -1, 2, 5, 2, 4, 4, 0, 6, 1, 4, 6, -1, 2, 4, 7, 11};
        int countChange = 0;
        int countDays = -temp.length;
        int count = 0;
        int dayTemp = temp[0];
        if (dayTemp >= 0)
            count++;
        for (int i = 1; i < temp.length; i++) {
            if ((dayTemp < 0) && (temp[i] >= 0))
                countChange++;
            dayTemp = temp[i];
            if (temp[i] >= 0)
                count += 1;
            else if (count > countDays) {
                countDays = count;
                count = 0;
            } else
                count = 0;
        }
        System.out.printf("The amount of time temperature changed from negative to positive is %d\n", countChange);
        System.out.printf("The most amount of days with positive temperature is %d\n", Math.abs(countDays));

        int min = Math.abs(Collections.min(Arrays.asList(temp)));
        int max = Math.abs(Collections.max(Arrays.asList(temp)));

        System.out.print("\tTemperature graph 1\n");
        int[][] mass = new int[min + max + 1][temp.length];

        for (int i = 0; i < mass.length; i++)
            for (int j = 0; j < mass[i].length; j++)
                mass[i][j] = 0;
        for (int x = 0; x < temp.length; x++) {
            if (temp[x] < 0)
                for (int i = mass.length - 1; i > (mass.length - (temp[x] + Math.abs(min)) - 2); i--)
                    mass[i][x] = temp[x];
            else
                for (int i = mass.length - 1; i > (mass.length - (Math.abs(temp[x]) + Math.abs(min)) - 2); i--)
                    if (temp[x] == 0)
                        mass[i][x] = 100;
                    else
                        mass[i][x] = temp[x];
        }
        int ind = max;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++)
                if (mass[i][j] == 0)
                    System.out.print(" ");
                else {
                    System.out.print("&");
                }
            System.out.print("| ");
            System.out.println(max);
            max--;
        }
        for (int i = 0; i < mass[0].length; i++)
            System.out.print("-");
        System.out.println();

        System.out.print("\tTemperature graph 2\n");

        for (int x = 0; x < min + max; x++)
            System.out.print("_");
        System.out.println();
        int diff;
        for (int x : temp) {
            diff = Math.abs(min - x);
            System.out.print("|");
            while (diff != 0) {
                System.out.print(" ");
                diff--;
            }
            System.out.println("*");
        }
    }
}

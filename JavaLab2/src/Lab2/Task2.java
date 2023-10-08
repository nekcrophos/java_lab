package Lab2;

import java.util.Random;

public class Task2 {
    public static int[] newArray(int n){
        int[] a = new int[n];
        Random initArray = new Random();
        for (int i = 0; i < n; i++)
            a[i] = initArray.nextInt(1000);
        return a;
    }

    public static void main(String[] args){
            int b[] = newArray(20);
            int evenMax = b[0];
            for (int i = 0; i < b.length; i++) {
                if ((b[i] % 2 == 0) && (b[i]>evenMax))
                    evenMax = b[i];
            }
            System.out.printf("The highest even number is %d", evenMax);
        }
}

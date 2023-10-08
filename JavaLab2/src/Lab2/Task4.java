package Lab2;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] argc) {
        int[] array = Task2.newArray(20);
        ArrayList<Integer> threeArray = new ArrayList<>();
        for (int x : array) {
            if (Integer.toString(x).endsWith("3"))
                threeArray.add(x);
        }

        int c;
        int left = 0;
        int right = threeArray.size() - 1;
        int flag = 1;
        while ((left < right) && (flag > 0)) {
            flag = 0;
            for (int i = left; i < right; i++) {
                if (threeArray.get(i) < threeArray.get(i + 1)) {
                    c = threeArray.get(i);
                    threeArray.set(i, threeArray.get(i + 1));
                    threeArray.set(i + 1, c);
                    flag = 1;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (threeArray.get(i) > threeArray.get(i - 1)) {
                    c = threeArray.get(i);
                    threeArray.set(i, threeArray.get(i - 1));
                    threeArray.set(i - 1, c);
                    flag = 1;
                }
            }
            left++;
        }
        if (threeArray.size() != 0)
            for (int x: threeArray)
                System.out.printf("%d ", x);
        else
            System.out.print("None");
    }
}

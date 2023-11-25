import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> elems = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            elems.add(rand.nextInt(-10,10));

        }
        System.out.println(elems);
        int maxElem = Collections.max(elems);
        System.out.printf("Maximum element: %d\n", maxElem);
        System.out.printf("Index of last element which equal to maximum element: %d\n", elems.lastIndexOf(maxElem));
        elems.sort(Comparator.comparing(Integer::intValue));
        System.out.println("Array list sorted in ascending order");
        System.out.println(elems);
    }
}
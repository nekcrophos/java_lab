import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {
    public static void main(String[] argc){
        LinkedList<Double> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++){
            list.add(random.nextDouble(-10, 10));
        }
        list.add((double) 0);
        list.sort(Comparator.comparing(Double::doubleValue, Comparator.reverseOrder()));
        System.out.println("Linked list sorted in descending order");
        System.out.println(list);
        System.out.printf("Is list contains zero: %b\n", list.contains((double) 0));
        list.add((int) list.size()/2, (list.get(0) + list.get(list.size()-1))/2);
        System.out.println("Changed list: " + list);
    }
}

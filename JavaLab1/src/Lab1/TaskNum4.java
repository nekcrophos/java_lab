package Lab1;

public class TaskNum4 {
    public static void main(String[] argc) {
        System.out.println("Enter amount of floors:");
        int N = TaskNum1.enter();
        System.out.println("Enter number of apartment:");
        int M = TaskNum1.enter();
        if (M % 3 == 0)
            System.out.printf("Floor number: %d", M / 3);
        else {
            while (M % 3 != 0)
                M++;
            System.out.printf("Floor number: %d", M / 3);
        }
    }
}

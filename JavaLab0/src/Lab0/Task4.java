package Lab0;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter amount of time for phone calls: ");
        double minutesMonthly = Task1.enter();

        double timeBased = 135 + 0.3 * minutesMonthly;
        double combined;
        if (minutesMonthly <= 450)
            combined = 255;
        else
            combined = 255 + 0.28 * (minutesMonthly - 450);
        int timeless = 380;

        double[] array;
        array = new double [3];
        array[0] = timeBased;
        array[1] = combined;
        array[2] = timeless;
        double min = array[0];
        for (int i = 0; i<3; i++) {
            if (array[i] < min)
                min = array[i];
        }
        if (min == timeBased)
            System.out.printf("The lowest price for your rate is time-based and it is %.3f rub", min);
        else
            if (min == combined)
                System.out.printf("The lowest price for your rate is combined and it is %.3f rub", min);
            else
                System.out.printf("The lowest price for your rate timeless and it is %.3f rub", min);
    }
}

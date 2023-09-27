package Lab0;

public class Task2 {
    public static void main(String[] args) {
        final double  SQUARE = 0.25;
        System.out.print("Enter quantity of glass: ");

       double quantity = Task1.enter();
       double vitragi = (420 * SQUARE) * quantity + quantity * 75;
       double stekolshik = (440 * SQUARE) * quantity + quantity * 65;
       double master = (470 * SQUARE) * quantity + quantity * 55;

       double[] array;
       array = new double [3];
       array[0] = vitragi;
       array[1] = stekolshik;
       array[2] = master;

       double min = array[0];
       for (int i = 0; i<3; i++) {
           if (array[i] < min)
               min = array[i];
       }
       if (min == vitragi)
           System.out.printf("The lowest price is in Vitragi company and it is %.3f rub", min);
       else
           if (min == stekolshik)
               System.out.printf("The lowest price is in Stekolshik company and it is %.3f rub", min);
           else
               System.out.printf("The lowest price is in Master company and it is %.3f rub", min);
    }
}

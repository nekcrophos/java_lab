package Lab0;

import java.util.Scanner;

public class Task1 {
    public static double enter() {
        double x = -1;
        Scanner scan = new Scanner(System.in);
        while (x<=0) {
            if (scan.hasNextDouble()){
                x = scan.nextDouble();
                if (x>0)
                    return x;
                else
                    System.out.println("The price cannot be a negative number");
            }
            else {
                System.out.println("It is not a number");
                String tmp = scan.nextLine();
            }
        }
        return x;
    }

    public static void main(String[] args) {
    System.out.println("Enter a price: ");
    double price = enter();
    double priceOfProduct = price - price*0.13;
    System.out.printf("Total price with sale: %.3f", priceOfProduct);
    }
}
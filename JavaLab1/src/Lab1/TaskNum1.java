package Lab1;

import java.util.Scanner;

public class TaskNum1 {
    public static int enter(){
        Scanner s = new Scanner(System.in);
        int x = -1;
        while (x<=0){
            if (s.hasNextInt()) {
                x = s.nextInt();
                if (x < 0)
                    System.out.println("Negative!");
            }
        }
        return x;
    }
    public static int enterNum(){
        Scanner s = new Scanner(System.in);
        int x = -1;
        while (x<=0){
            System.out.println("Enter year: ");
            if (s.hasNextInt()) {
                x = s.nextInt();
                if (x < 0)
                    System.out.println("Negative!");
            }
        }
        return x;
    }
    public static void main(String[] argc){
        final int Cycle = 1996;
        int year = enterNum();
        int x = year - Cycle;
        if (x>=0) {
            while (x >= 12)
                x -= 12;
            switch (x) {
                case 0:
                    System.out.print("Year of Rat");
                    break;
                case 1:
                    System.out.print("Year of Cow");
                    break;
                case 2:
                    System.out.print("Year of Tiger");
                    break;
                case 3:
                    System.out.print("Year of Rabbit");
                    break;
                case 4:
                    System.out.print("Year of Dragon");
                    break;
                case 5:
                    System.out.print("Year of Snake");
                    break;
                case 6:
                    System.out.print("Year of Horse");
                    break;
                case 7:
                    System.out.print("Year of Sheep");
                    break;
                case 8:
                    System.out.print("Year of Monkey");
                    break;
                case 9:
                    System.out.print("Year of Chicken");
                    break;
                case 10:
                    System.out.print("Year of Dog");
                    break;
                case 11:
                    System.out.print("Year of Pig");
                    break;
            }
        }
        else{
            while (x <= -12)
                x += 12;
            switch (x) {
                case 0:
                    System.out.print("Year of Rat");
                    break;
                case -11:
                    System.out.print("Year of Cow");
                    break;
                case -10:
                    System.out.print("Year of Tiger");
                    break;
                case -9:
                    System.out.print("Year of Rabbit");
                    break;
                case -8:
                    System.out.print("Year of Dragon");
                    break;
                case -7:
                    System.out.print("Year of Snake");
                    break;
                case -6:
                    System.out.print("Year of Horse");
                    break;
                case -5:
                    System.out.print("Year of Sheep");
                    break;
                case -4:
                    System.out.print("Year of Monkey");
                    break;
                case -3:
                    System.out.print("Year of Chicken");
                    break;
                case -2:
                    System.out.print("Year of Dog");
                    break;
                case -1:
                    System.out.print("Year of Pig");
                    break;
        }

        }
    }
}

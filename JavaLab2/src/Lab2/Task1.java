package Lab2;

public class Task1 {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] argc) {
        int b[] = Task2.newArray(20);
        String num;
        int count = 0;
        int sumOfSym = 0;
        for (int x : b) {
            num = Integer.toString(x);
            num = reverseString(num);
            if (Integer.valueOf(num) == x) {
                count += 1;
                sumOfSym += x;
            }
        }
        System.out.printf("The amount of symmetric numbers is %d \n", count);
        System.out.printf("The sum of symmetric numbers is %d", sumOfSym);
    }

}

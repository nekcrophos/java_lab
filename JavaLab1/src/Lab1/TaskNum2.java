package Lab1;


public class TaskNum2 {
    public static void main(String[] args) {
        System.out.println("\tТаблица умножения");
        for (int i = 1; i < 10; i++)
            for (int r = 1; r < 10; r++)
                System.out.printf("%d * %d = %d \n", i, r, i * r);
        System.out.println("------------------------------------------------------------");
        System.out.print("|     |");
        for (int i = 1; i < 10; i++) {
            System.out.printf("  %d  |", i);
        }
        System.out.print("\n------------------------------------------------------------\n");
        for (int i = 1; i < 10; i++) {
            System.out.printf("|  %d  |", i);
            for (int r = 1; r < 10; r++) {
                System.out.printf("% 3d", i * r);
                System.out.print("  |");
            }
            System.out.print("\n------------------------------------------------------------\n");
        }
    }
}

package Lab0;

public class Task3 {

    public static void main(String[] args) {
        final int PEOPLE = 3;
        final double BREAD = 25.4;
        final int CUCUMBERS = 40;
        final int TOMATOES = 51;
        final double MEAT = 285.5;
        final double GAS = 43.6;
        System.out.println("Enter a quantity of goods:");
        System.out.print("bread = ");
        double qBread = Task1.enter();
        System.out.print("cucumbers = ");
        double qCucumbers = Task1.enter();
        System.out.print("tomatoes = ");
        double qTomatoes = Task1.enter();
        System.out.print("meat = ");
        double qMeat = Task1.enter();
        System.out.print("gas = ");
        double qGas = Task1.enter();
        double total = (BREAD * qBread + CUCUMBERS * qCucumbers + TOMATOES * qTomatoes + MEAT*qMeat + GAS * qGas)/PEOPLE;
        System.out.printf("Total check for each person is %.3f rub", total);
    }
}

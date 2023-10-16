package tourist;

public class adventure {
    public static void main(String[] argc){
        final int firstTouristGroup = 25;
        final int secondTouristGroup = 30;
        Bus firstBus = new Bus(54, 400, 1);
        Bus secondBus = new Bus(45, 500, 2);
        firstBus.setBookSeats(firstTouristGroup);
        secondBus.setBookSeats(secondTouristGroup);
        System.out.println(firstBus);
        System.out.println(secondBus);
        busIncome(firstBus);
        busIncome(secondBus);
    }

    public static void busIncome(Bus a){
        if (a.busProfit() >= 11000)
            System.out.printf("Bus number %d have a cost-effective trip\n", a.getBusNumber());
        else
            System.out.printf("Bus number %d have a cost-ineffective trip\n", a.getBusNumber());
    }
}

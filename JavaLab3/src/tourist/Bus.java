package tourist;

public class Bus {

    private int seats;
    private int costForSeat;
    private int bookedSeats;
    private int busNumber;

    public Bus() {
        busNumber = 0;
        seats = 0;
        costForSeat = 0;
        bookedSeats = 0;
    }

    public Bus(int seats, int cost4seat, int busNumber) {
        this.seats = seats;
        this.costForSeat = cost4seat;
        this.busNumber = busNumber;
    }

    public void setBookSeats(int book) {
        if (book > seats)
            System.out.println("You cant book more seats then the bus have");
        else
            bookedSeats += book;
    }

    public void setBusNumber(int num){
        busNumber = num;
    }
    public void setCostForSeat(int num){
        costForSeat = num;
    }
    public void setSeats(int num){
        seats = num;
    }


    //копирование автобуса
    public Bus(Bus a) {
        this.seats = a.seats;
        this.costForSeat = a.costForSeat;
        this.bookedSeats = a.bookedSeats;
        this.busNumber = a.busNumber;
    }

    public int getSeats() {
        return seats;
    }
    public int getCost() {
        return costForSeat;
    }
    public int getBookedSeats(){
        return  bookedSeats;
    }
    public int getBusNumber(){
        return busNumber;
    }

    public int seatsLeft() {
        return seats - bookedSeats;
    }
    public int busProfit(){
        return bookedSeats * costForSeat;
    }

    public String isEmptyBus(Bus a){
        if (seats == 0)
            return ("Bus number " + busNumber + " is full-loaded");
        else if (seats - bookedSeats == seats)
            return ("Bus number " + busNumber + " is empty");
            else
                return ("Bus number " + busNumber + " is not empty");
    }

    @Override
    public String toString() {
        return new String("Bus number: "+ busNumber + ", Seats left: " + (seats - bookedSeats) + ", Price for seat: " + costForSeat);
    }
}
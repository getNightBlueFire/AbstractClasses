package structure;

public class Auto extends AutoTransport {

    public Auto(String engine, int countAxis, int countWheels, int countSeats) {
        super(engine, countAxis, countWheels);
        this.countSeats = countSeats;
    }

    int countSeats;

    @Override
    public void moving() {
        System.out.println("Двигается по дороге машина");
    }
}

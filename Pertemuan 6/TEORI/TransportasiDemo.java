package transportasi;
import transportasi.Mobil;
import transportasi.Bicycle;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.turnLeft();
        mobil1.goStraight();
        mobil1.turnRight();
        Bicycle sepeda = new Bicycle();
        sepeda.ringBell();
    }
}
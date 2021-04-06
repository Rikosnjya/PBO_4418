package vehicle;

public class UjiKendaraan {
    public static void main(String[] args) {
        MotorVehicle motorku = new MotorVehicle(5, "H 444 JI");
        System.out.println("Motorku : ");
        System.out.println("Engine Size : " + motorku.getsizeofEngine());
        System.out.println("Plat Nomer : " + motorku.getLicencePlate());
        motorku.turnRight();

        System.out.println("");

        System.out.println("Sepedaku: ");
        Bicycle sepedaku = new Bicycle();
        sepedaku.turnLeft();
        sepedaku.turnRight();
        sepedaku.ringBell();
    }
}

package vehicle;

class MotorVehicle extends Vehicle {
    public int sizeofEngine = 1;
    public String licencePlate = "H 444 DIR";

    public MotorVehicle() {

    }

    public MotorVehicle(int sizeEng, String lcPlate) {
        this.sizeofEngine = sizeEng;
        this.licencePlate = lcPlate;
    }

    public int getsizeofEngine() {
        return this.sizeofEngine;
    }

    public String getLicencePlate() {
        return this.licencePlate;
    }
}

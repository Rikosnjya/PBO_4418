/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobildemo;

public class MobilDemo {
    public static void main(String[] args) {
        Mobil2 myCar = new Mobil2();
        myCar.hidupkanMobil();
        myCar.ubahGigi(5);
        System.out.println("Mobil dalam kondisi menyala : " + myCar.active + " Gigi mobil sekarang " + myCar.gigi);
    }
}

class Mobil2 {
    boolean active = false;
    int gigi;

    Mobil2() {

    }

    public void hidupkanMobil() {
        active = true;
    }

    public void matikanMobil() {
        active = false;
    }

    public void ubahGigi(int newGigi) {
        if (active) {
            gigi = newGigi;
        }
    }
}
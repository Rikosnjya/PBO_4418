/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiotest;

/**
 *
 * @author Riko Sanjaya
 */
class Radio{
    int frekuensi;
    int volumeLevel;
    boolean On;
    
    public Radio() {

    }

    public void turnOn() {
        On = true;
    }

    public void turnOff() {
        On = false;
    }

    public void setFrekuensi(int newFrekuensi) {
        if (On && newFrekuensi >= 1 && newFrekuensi <= 120) {
            frekuensi = newFrekuensi;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (On && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    public void frekuensiUp() {
        if (On && frekuensi < 120) {
            frekuensi++;
        }
    }

    public void frekuensiDown() {
        if (On && frekuensi > 1) {
            frekuensi--;
        }
    }

    public void volumeUp() {
        if (On && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (On && volumeLevel > 1) {
            volumeLevel--;
        }
    }
}
public class RadioTest {
    public static void main(String[] args){
        Radio radio1 = new Radio();
        radio1.turnOn();
        radio1.setFrekuensi(107);
        radio1.setVolume(5);
        
        Radio radio2 = new Radio();
        radio2.turnOn();
        radio2.frekuensiUp();
        radio2.frekuensiUp();
        radio2.volumeUp();
        
        System.out.println("Radio terhubung dalam frekuensi " + radio1.frekuensi
        + " dengan volume sebesar " + radio1.volumeLevel);
        
        System.out.println("Radio terhubung dalam frekuensi " + radio2.frekuensi
        + " dengan volume sebesar " + radio2.volumeLevel);
    }
}

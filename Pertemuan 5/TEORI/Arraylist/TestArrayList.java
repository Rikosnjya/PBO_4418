package testarraylist;
import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ParkirMobil parkirMobilnya = new ParkirMobil("H 555 DI", "H 556 TI", "H 565 GA", "H 566 LI");
        parkirMobilnya.CekKendaraan();
        parkirMobilnya.rubahPlat("H 566 LI", "H 44 DEH");
        parkirMobilnya.keluar("H 555 DI");
        parkirMobilnya.keluar("H 556 TI");
        parkirMobilnya.CekKendaraan();
        parkirMobilnya.rubahPlat("H 44 DEH", "H 44 HA ");
        parkirMobilnya.CekKendaraan();
        parkirMobilnya.keluar("H 565 GA");
        parkirMobilnya.CekKendaraan();        
    }
}

class ParkirKendaraan {
    ArrayList<String> platKendaraan = new ArrayList<String>();

    ParkirKendaraan(String... plat) {
        for (String tiapPlat : plat) {
            masuk(tiapPlat);
        }
    }

    public void masuk(String plat) {
        platKendaraan.add(plat);
        System.out.println("Kendaraan ber plat " + plat + " telah masuk ke parkiran");
    }

    public void keluar(String plat) {
        platKendaraan.remove(new String(plat));
        System.out.println("Kendaraan ber plat " + plat + " telah keluar dari parkiran");
    }

    public void rubahPlat(String platLama, String platBaru) {
        for (int i = 0; i < platKendaraan.size(); i++) {
            if (platKendaraan.get(i) == platLama) {
                platKendaraan.set(i, platBaru);
                System.out.println("Plat kendaraan: " + platLama + ". Telah diubah menjadi: " + platBaru);
                break;
            }
        }
    }

    public void CekKendaraan() {
        if (platKendaraan.size() != 0) {
            System.out.print("Plat kendaraan yang masih ada di parkiran : ");
            for (int i = 0; i < platKendaraan.size(); i++) {
                System.out.print(platKendaraan.get(i) + ", ");
            }
        } else {
            System.out.println("Tidak ada kendaraan yang berada di parkiran");
        }
    }
}

class ParkirMotor extends ParkirKendaraan {
    public void masuk(String plat) {
        platKendaraan.add(plat);
        System.out.println("Motor ber plat " + plat + " telah masuk ke parkiran");
    }

    public void keluar(String plat) {
        platKendaraan.remove(new String(plat));
        System.out.println("Motor ber plat " + plat + " telah keluar dari parkiran");
    }

    public void rubahPlat(String platLama, String platBaru) {
        for (int i = 0; i < platKendaraan.size(); i++) {
            if (platKendaraan.get(i) == platLama) {
                platKendaraan.set(i, platBaru);
                System.out.println("Plat Motor: " + platLama + ". Telah diubah menjadi: " + platBaru);
                break;
            }
        }
    }
}

class ParkirMobil extends ParkirKendaraan {
    ParkirMobil(String... plat) {
        for (String tiapPlat : plat) {
            masuk(tiapPlat);
        }
    }

    public void masuk(String plat) {
        platKendaraan.add(plat);
        System.out.println("Mobil ber plat " + plat + " telah masuk ke parkiran");
    }

    public void keluar(String plat) {
        platKendaraan.remove(new String(plat));
        System.out.println("Mobil ber plat " + plat + " telah keluar dari parkiran");
    }

    public void rubahPlat(String platLama, String platBaru) {
        for (int i = 0; i < platKendaraan.size(); i++) {
            if (platKendaraan.get(i) == platLama) {
                platKendaraan.set(i, platBaru);
                System.out.println("Plat Mobil: " + platLama + ". Telah diubah menjadi: " + platBaru);
                break;
            }
        }
    }
}

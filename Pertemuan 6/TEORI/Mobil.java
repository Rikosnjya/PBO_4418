package transportasi;

public class Mobil {
    
    public double speed;
    public double color;
    
    public Mobil(){
        
    }
    public void goStraight(){
        System.out.println("Lurus");
    }
    public void turnLeft(){
        System.out.println("Belok Kiri");
    }
    public void turnRight(){
        System.out.println("Belok Kanan");
    }
}
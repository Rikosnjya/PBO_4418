package gameenvironment;

public class TestGame {
    public static void main(String[] args) {
        
        GamePlayer hero1 = new GamePlayer();
        hero1.setDimension(12, 12);
        hero1.setPosition(10, 220);
        System.out.println("Posisi player " + hero1.getX() + ", " + hero1.getY());
        hero1.Run(12);
        System.out.println("Posisi player " + hero1.getX() + ", " + hero1.getY());

        GamePlayer hero2 = new GamePlayer();
        hero2.setDimension(12, 32);
        hero2.setPosition(10, 10);

        
        GameEnemy monster = new GameEnemy();
        monster.setDimension(12, 32);
        monster.setPosition(10, 10);

        
        GameEnvironment scene = new GameEnvironment();
        scene.addPlayer(hero1);
        scene.addPlayer(hero1);
        scene.addPlayer(hero2);
        scene.getAllPlayers();
        scene.removePlayer(hero1);
        scene.getAllPlayers();
        scene.addEnemy(monster);
        scene.Interaction();
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametest;

/**
 *
 * @author Riko Sanjaya
 */
public class GameTest{
    public static void main(String[] args) {
        GamePlayer Player1 = new GamePlayer(1, 2, 3, 4);

        System.out.println(Player1.getWidth());
        System.out.println(Player1.getHeight());
        System.out.println(Player1.getX());
        System.out.println(Player1.getY());
        System.out.println();

        Player1.setDimension(6.6, 7.7);
        Player1.setPosition(15, 25);

        System.out.println(Player1.getWidth());
        System.out.println(Player1.getHeight());
        System.out.println(Player1.getX());
        System.out.println(Player1.getY());
        System.out.println();

        Player1.Run();
        System.out.println();

        Player1.Run(10);
    }
}
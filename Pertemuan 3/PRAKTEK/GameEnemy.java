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
public class GameEnemy {
    double width;
    double height;
    int positionX;
    int positionY;

    public GameEnemy(){
        
    }
    public GameEnemy(double width, double height){
        this.width = width;
        this.height = height;
    }
    public GameEnemy(double width, double height, int positionX, int positionY){
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setDimension(double setWidth, double setHeight){
        width = setWidth;
        height = setHeight;
    }
    
    public void setPosition(int setPositionX, int setPositonY){
        positionX = setPositionX;
        positionY = setPositonY;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public int getX(){
        return positionX;
    }

    public int getY(){
        return positionY;
    }

    public void Run(){
        System.out.println("Enemy is running");
    }
}


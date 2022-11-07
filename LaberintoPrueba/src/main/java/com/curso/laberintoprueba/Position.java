package com.curso.laberintoprueba;

/**
 *
 * @author omarinmo
 */
public class Position {

    protected int x;
    protected int y;

    public Position() {
        x = 0;
        y = 0;
    }
public Position (int x, int y){
    this.x= x;
    this.y=y;
    
    
    
    
}
//GETTERS
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
//SETTERS

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void set (int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString() {
        return "Position{" + "x=" + x + ", y=" + y + '}';
    }
}

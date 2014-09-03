/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bhaskar.looser.maths;

/**
 *
 * @author 360758 Anil Bhaskar
 */
public class Point {
    private int x,y;

    Point() { 
        System.out.println("default point");
    }
    
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    static Point origin = new Point(0,0);

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

}

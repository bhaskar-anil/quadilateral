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
public class Line extends Point{
    private Point pt1, pt2;
    
    Line(){
        System.out.println("default line");
    }

    Line(Point pt1, Point pt2){
        this.pt1 = pt1;
        this.pt2 = pt2;
    }
    
    public Point getPt1() {
        return pt1;
    }

    public Point getPt2() {
        return pt2;
    }

}

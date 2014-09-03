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
/*A comment added*/
public class Quadilateral extends Line {

    /**
     * @param args the command line arguments
     */
    private Line ln1, ln2, ln3, ln4;

    Quadilateral() {
        System.out.println("default quadilateral");
    }

    Quadilateral(Line ln1, Line ln2, Line ln3, Line ln4) {
        this.ln1 = ln1;
        this.ln2 = ln2;
        this.ln3 = ln3;
        this.ln4 = ln4;
    }

    public Line[] getAllLines(Quadilateral quad) {
        Line[] lines = {this.ln1,this.ln2,this.ln3,this.ln4};
        return lines;
    }

    public double longestLine(Quadilateral quad) {
        //Get all the lines of the quadilateral
        Line[] lines = getAllLines(quad);
        double[] lengths = {0,0,0,0};
        double x,y,max = 0;
        for(int i = 0; i<4; i++)
         {
             /*
             Need to apply Paithogorus theoram here, 
             x = (x1-x2)^2
             y = (y1-y2)^2
             */
             x = Math.pow((lines[i].getPt1().getX() - lines[i].getPt2().getX()),2);
             y = Math.pow((lines[i].getPt1().getY() - lines[i].getPt2().getY()),2);
             lengths[i] = Math.sqrt(x+y);
             if(lengths[i]>max)
                {
                    max = lengths[i];
                }
         }
        
        return max;
    }

    

}

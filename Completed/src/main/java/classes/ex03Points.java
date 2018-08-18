/* Exercise 03 
Write a Point2D.java client that takes an integer value N
from the command line, generates N random points in the unit
square, and computes the distance separating the closest
pair of points. */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.RandomSeq;
import java.util.Arrays;

public class ex03Points {
    // return number of distinct pairs (i, j) such that a[i] + a[j] = 0
/*     public static int[] randArray(int[] ar) {
        int i = ar.length;
        int j, tempJ;
        while (i > 1) {
        	i = i - 1;
        	j = StdRandom.uniform(i);
        	tempJ = ar[j];
        	ar[j] = ar[i];
        	ar[i] = tempJ;
        }
        StdOut.println("Randomized: " + Arrays.toString(ar));
        return ar;

    }  */

    public static double[][] getPoints(int points){
        double[][] coords = new double[2][points];
        //this is painful to fill
        //random array of coordinates x y
        for (int i = 0; i<2; i++){
            for (int j = 0; j<points; j++){
                coords[i][j] = StdRandom.uniform();
            }
        }
        //StdOut.println("Coords: " + coords);
        return coords;
    }

    public static double[][] getClosest(double[][] coords, int points){
        double[][] closest = new double[2][2];
        double x1,y1,x2,y2; 
        double distance;
        double minDis = 2;
        //looping over all points comparing distances which each other
        for (int i = 0; i < points; i++){
            for (int j = 1; j < points; j++){
                if(i != j){
                    //not the same point
                    x1 = coords[0][i];
                    y1 = coords[1][i];
                    x2 = coords[0][j];
                    y2 = coords[1][j]; 
                    distance = Math.hypot(x1-x2, y1-y2);
                    
                    if (distance < minDis){
                        //new closest points!
                        closest[0][0] = x1;
                        closest[0][1] = y1;
                        
                        closest[1][0] = x2;
                        closest[1][1] = y2;

                        minDis = distance;
                    }
                }
            }
        }
        x1 = closest[0][0];
        y1 = closest[0][1];
        
        x2 = closest[1][0];
        y2 = closest[1][1];
        double radius = 0.01;      
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.circle(x1, y1, radius);
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.circle(x2, y2, radius);
        StdDraw.show();
        StdOut.println("Closests: " + Arrays.deepToString(closest));
        StdOut.println("Distance: " + minDis);
        return closest;
    }

    public static void plotPoints(int points){
        double[][] coords = getPoints(points);
        // set the scale of the coordinate system
        StdDraw.setXscale(-0.02, 1.02);
        StdDraw.setYscale(-0.02, 1.02);
        StdDraw.enableDoubleBuffering();
        // clear the background
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.rectangle(0.5, 0.5, 0.5, 0.5);
        double radius = 0.005;              // radius
        for (int j = 0; j<points; j++){
            // initial values
            double px = coords[0][j];
            double py = coords[1][j];     // position
            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.BLUE); 
            StdDraw.filledCircle(px, py, radius); 
        }
        // display and pause for 20 ms
        StdDraw.show();
        getClosest(coords, points);
    }



	public static void main(String[] args) {
        int points;
        if(args.length == 0){
            StdOut.println("Argument not provided!");
            StdOut.println("Using default array points of 10");
            points = 10;
        }
        else{
            points = Integer.parseInt(args[0]);
            if (points < 1 || points > 1000){
                StdOut.println("Invalid value!");
                StdOut.println("Using default array points of 10");
                points = 10;
            }
        }
        StdOut.println("Grid of " + points +" points");
        //creating array of points N
        //int[] ar = IntStream.rangeClosed(0, points-1).toArray();
        //randomizing it
        //StdOut.println("Array:      " + Arrays.toString(ar));
        //int[] randAr = randArray(ar);
        plotPoints(points);
        //StdOut.println("Array: " + Arrays.deepToString());
    } 
}
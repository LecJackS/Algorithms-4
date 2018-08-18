/*
Josephus problem. In the Josephus problem from antiquity,
N people are in dire straits and agree to the following
strategy to reduce the population.

They arrange themselves in a circle (at positions numbered from 0 to N-1)
and proceed around the circle, eliminating every Mth person until only one person is left.

Legend has it that Josephus figured out where to sit to avoid being eliminated.

Write a Queue client Josephus.java that takes M and N from the command line and
prints out the order in which people are eliminated (and thus would show Josephus
where to sit in the circle). 
*/

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ex37Josephus {
    // return number of distinct pairs (i, j) such that a[i] + a[j] = 0
    public static int elimination(int M, int N) {

        return 99;
    } 

	public static void main(String[] args) {
        //every Mth person
        int M;
        //N people
        int N;
        
        if(args.length < 2){
            StdOut.println("Argument not provided!");
            StdOut.println("Using default N = 10 and M = 3");
            N = 10;
            M = 3;
        }
        else{
            M = Integer.parseInt(args[0]);
            N = Integer.parseInt(args[0]);
            if (M>N){
                StdOut.println("Invalid values!");
                StdOut.println("Using default N = 10 and M = 3");
                N = 10;
                M = 3;
            }
        }
        StdOut.println("Elimination every " + M + " people");
        StdOut.println("Population: " + N + "people");
        
       
        int lastPosition = elimination(M, N);
        StdOut.println("Last position: " + lastPosition);
    } 
}
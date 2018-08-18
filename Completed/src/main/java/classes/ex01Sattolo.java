import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ex01Sattolo {
    // return number of distinct pairs (i, j) such that a[i] + a[j] = 0
    public static int[] randArray(int[] ar) {
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

    } 

	public static void main(String[] args) {
        int size;
        if(args.length == 0){
            StdOut.println("Argument not provided!");
            StdOut.println("Using default array size of 10");
            size = 10;
        }
        else{
            size = Integer.parseInt(args[0]);
            if (size < 1 || size > 1000){
                StdOut.println("Invalid value!");
                StdOut.println("Using default array size of 10");
                size = 10;
            }
        }
        StdOut.println("Randomizing array of size " + size);
        //creating array of size N
        int[] ar = IntStream.rangeClosed(0, size-1).toArray();
        //randomizing it
        StdOut.println("Array:      " + Arrays.toString(ar));
        int[] randAr = randArray(ar);
    } 
}
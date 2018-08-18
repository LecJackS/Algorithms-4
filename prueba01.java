import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class prueba01 {

    // print distinct pairs (i, j) such that a[i] + a[j]  = 0
    public static void printAll(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] + a[j] == 0) {
                    StdOut.println(a[i] + " " + a[j]);
                }
            }
        }
    } 

    // return number of distinct pairs (i, j) such that a[i] + a[j] = 0
    public static int[] randArray(int[] ar) {
        int i = ar.length;
        int j, tempJ;
        while (i > 1){
        	i = i - 1;
        	j = StdRandom.uniform(i);
        	tempJ = ar[j];
        	ar[j] = ar[i];
        	ar[i] = tempJ;

        }
        StdOut.println("random!: " + Arrays.toString(ar));
        return ar;

    } 

	public static void main(String[] args) { 
        int size = Integer.parseInt(args[0]);
        //int k = Integer.parseInt(args[1]);
        //double p = Double.parseDouble(args[2]);
        int[] ar = IntStream.rangeClosed(0, size-1).toArray();
        StdOut.println("tre valore!: " + Arrays.toString(ar));
        int[] randAr = randArray(ar);
    } 
} 
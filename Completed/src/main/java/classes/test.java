import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class test {
	public static void main(String[] args) {
        int n = 50;
        Stack<Integer> s = new Stack<Integer>();
        while (n > 0) {
           s.push(n % 2);
           n = n / 2;
        }
        while (!s.isEmpty()){
            System.out.print(s.pop());
        }
        System.out.println();
    }
}
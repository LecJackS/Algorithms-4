import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;
import java.util.stream.IntStream;
import org.apache.commons.io.FileUtils;

public class ex02Wget {
    // return number of distinct pairs (i, j) such that a[i] + a[j] = 0
    public static int[] wget(String FILE_URL) {
        InputStream in = new URL(FILE_URL).openStream();
        Files.copy(in, Paths.get("FILENAME"), StandardCopyOption.REPLACE_EXISTING);
    } 

	public static void main(String[] args) {
        String url;
        if(args.length == 0){
            StdOut.println("Url not provided!");
            return;
        }
        else{
            url = String.parseString(args[0]);
            if (url.length < 10){
                StdOut.println("Invalid Url!");
                return;
            }
        }
        StdOut.println("Downloading...");
        int[] randAr = wget(url);
    } 
} 
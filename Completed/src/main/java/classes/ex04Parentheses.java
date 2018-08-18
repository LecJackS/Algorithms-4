import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/* Exercise 4 from 1.3
Write a stack client Parentheses.java that reads in sequence
of left and right parentheses, braces, and brackets from
standard input and uses a stack to determine whether the
sequence is properly balanced. For example, your program
should print true for [()]{}{[()()]()} and false for [(]). 
*/
public class ex04Parentheses{
    public static void main(String[] args){
        String chars;
        if(args.length == 0){
            StdOut.println("Argument not provided!");
            StdOut.println("Using default array chars of 10");
            chars = "{({([{}])[]})[]}";
        }
        else{
            //chars = String.parseString(args[0]);
            chars = "{({([{}])[]})[]}";
        }
        StdOut.println("Checking: " + chars);
        eval(chars);
    }
    public static void eval(String chars){
        Stack<String> sequence = new Stack<String>();
        List<String> openP =  new ArrayList<String>();
        openP.add("(");
        openP.add("[");
        openP.add("{");
        List<String> closeP = new ArrayList<String>();
        closeP.add(")");
        closeP.add("]");
        closeP.add("}");
        String c = new String();
        for (int i=0; i<chars.length(); i++){
            //if(openP.contains(chars.charAt(i))){
            c = Character.toString(chars.charAt(i));
            if(openP.contains(c)){
                //open parentheses
                sequence.push(c);
            }
            else if(closeP.contains(c))
            {
                //close parentheses
                sequence.pop();
            }
        }
        if(sequence.empty())
        {
            StdOut.println("Valid sequence");
        }
        else
        {
            StdOut.println("Invalid sequence");
        }
    }
}
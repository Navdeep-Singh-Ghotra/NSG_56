import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;

public class Funda {

    public static void main(String[] args) {

        String argumentToSplit = args[0]; // Assuming the first argument needs

        String delimiter = ","; // Example delimiter: comma
        String[] parts = argumentToSplit.split(delimiter);
        /*
         * int N = 100;
         * StdDraw.setXscale(0, N);
         * StdDraw.setYscale(0, N * N);
         * StdDraw.setPenRadius(.01);
         * for (int i = 1; i <= N; i++) {
         * StdDraw.point(i, i);
         * StdDraw.point(i, i * i);
         * StdDraw.point(i, i * Math.log(i));
         * }
         * 
         * 
         * String argumentToSplit = args[0]; // Assuming the first argument needs
         * splitting
         * String delimiter = ","; // Example delimiter: comma
         * 
         * String[] parts = argumentToSplit.split(delimiter);
         * double a[] = new double[5];
         * System.out.println(a.length);
         * for (int i = 0; i < a.length; i++) {
         * a[i] = Double.parseDouble(parts[i]);
         * }
         * 
         * double max = a[0];
         * for (int i = 1; i < a.length; i++)
         * if (a[i] > max)
         * max = a[i];
         * // System.out.println("Maximum value is: " + max);
         * int f = 0;
         * int g = 1;
         * for (int i = 0; i <= 15; i++) {
         * StdOut.println(f);
         * f = f + g;
         * g = f - g;
         * }
         */

        // Write a program that takes three integer command-line arguments and prints
        // equal if all three are equal, and not equal otherwise.

        /*
         * int a = Integer.parseInt(parts[0]);
         * int b = Integer.parseInt(parts[1]);
         * int c = Integer.parseInt(parts[2]);
         * if (a == b && b == c) {
         * StdOut.println("equal");
         * } else {
         * StdOut.println("not equal");
         * }
         */

        // Write a code fragment that prints true if the double variables x and y are
        // both strictly between 0 and 1 and false otherwise.
        /*
         * double x = Double.parseDouble(parts[0]);
         * double y = Double.parseDouble(parts[1]);
         * 
         * if (x > 0 && x < 1 && y > 0 && y < 1) {
         * System.out.println("true");
         * } else {
         * System.out.println("false");
         * }
         */

        // What does the following program print
        /*
         * int f = 0;
         * int g = 1;
         * for (int i = 0; i <= 15; i++) {
         * System.out.println("value of counter var i : " + i);
         * StdOut.println(f);
         * System.out.println("value of f before f =f+g : " + f);
         * f = f + g;
         * System.out.println("value of f after f =f+g : " + f);
         * System.out.println("value of g before g =f-g : " + g);
         * g = f - g;
         * System.out.println("value of g after g =f-g : " + g);
         * System.out.println("lOOP " + i + "%d ENDS HERE");
         * System.out.println("-----------------------");
         * }
         */

        // Write a code fragment that puts the binary representation of a positive
        // integer N into a String s.
        /*
         * int N = Integer.parseInt(parts[0]);
         * String s = "";
         * for (int n = N; n > 0; n /= 2) {
         * s = (n % 2) + s;
         * System.out.println(s);
         * }
         */
        // Write a code fragment that prints the contents of a two-dimensional boolean
        // array, using * to represent true and a space to represent false. Include row
        // and column numbers.

    }

}

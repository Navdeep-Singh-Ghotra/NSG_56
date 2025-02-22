import edu.princeton.cs.algs4.In;

public class BinaryRepresentation {

    public static void main(String[] args) {
        In in = new In();
        int N = in.readInt();
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        System.out.println(s);
    }
}
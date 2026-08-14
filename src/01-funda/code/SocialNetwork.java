import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;

public class SocialNetwork {

    public static void main(String[] args) {
        if (args.length < 1) {
            StdOut.println("Usage: java SocialNetwork <input-file>");
            return;
        }

        In in = new In(args[0]);
        int N = in.readInt(); // Number of members (0 to N-1)
        int M = in.readInt(); // Number of friendship events

        // Use WeightedQuickUnionUF from your code folder
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(N);

        int earliestTime = -1;

        // Process each friendship event
        for (int i = 0; i < M; i++) {
            int member1 = in.readInt();
            int member2 = in.readInt();
            int timestamp = in.readInt();

            if (!uf.connected(member1, member2)) {
                uf.union(member1, member2);

                // Check if all members are connected (1 component)
                if (uf.count() == 1) {
                    earliestTime = timestamp;
                    break;
                }
            }
        }

        if (earliestTime != -1) {
            StdOut.println("All members became connected at time: " + earliestTime);
        } else {
            StdOut.println("Members never became fully connected.");
        }
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Arrays.sort(args);
        if (args.length == 0) {
            System.out.println("No arguements passed");
        } else {
            System.out.println("Arguements passed");
            System.out.println(args[0]);
        }

    }

}

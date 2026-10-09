import java.io.*;
import java.util.*;

public class Degree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int temp = sc.nextInt();
            
            if (temp > 0) {
                System.out.println("Safe for outdoor activities");
            } else {
                System.out.println("Too cold for outdoor activities");
            }
        }
        sc.close();
    }
}
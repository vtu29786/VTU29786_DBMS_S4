import java.util.*;

public class  Authentication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String user = sc.next();
            String pass = sc.next();

            boolean valid = user.length() >= 3 && user.length() <= 20
                    && pass.length() >= 6 && pass.length() <= 20;

            System.out.println(valid ? "SUCCESS" : "FAILURE");
        }

        sc.close();
    }
}
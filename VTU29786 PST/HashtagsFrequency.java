import java.util.*;

public class HashtagsFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of Hashtags: ");
        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, Integer> map = new LinkedHashMap<>();

        System.out.println("Enter Hashtags:");

        for (int i = 0; i < n; i++) {
            String hashtag = sc.nextLine().trim().toLowerCase();
            map.put(hashtag, map.getOrDefault(hashtag, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        sc.close();
    }
}
import java.util.Scanner;

public class DNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input DNA sequence
        System.out.print("Enter DNA Sequence: ");
        String dna = sc.nextLine().toUpperCase();

        // Input pattern to search
        System.out.print("Enter DNA Pattern: ");
        String pattern = sc.nextLine().toUpperCase();

        boolean found = false;

        System.out.println("\nPattern found at positions:");

        for (int i = 0; i <= dna.length() - pattern.length(); i++) {
            if (dna.substring(i, i + pattern.length()).equals(pattern)) {
                System.out.println((i + 1)); // 1-based position
                found = true;
            }
        }

        if (!found) {
            System.out.println("Pattern not found.");
        }

        sc.close();
    }
}
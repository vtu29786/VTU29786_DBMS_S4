 import java.util.Scanner;

public class Ride {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String customerName = "";
        String pickup = "";
        String destination = "";
        double distance = 0;
        double fare = 0;

        int choice;

        do {
            System.out.println("\n===== Ride Sharing Platform Simulator =====");
            System.out.println("1. Book Ride");
            System.out.println("2. View Ride Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Customer Name: ");
                    customerName = sc.nextLine();

                    System.out.print("Enter Pickup Location: ");
                    pickup = sc.nextLine();

                    System.out.print("Enter Destination: ");
                    destination = sc.nextLine();

                    System.out.print("Enter Distance (km): ");
                    distance = sc.nextDouble();

                    fare = 50 + (distance * 12); // Base fare + per km charge

                    System.out.println("\nRide Booked Successfully!");
                    System.out.println("Estimated Fare: ₹" + fare);
                    break;

                case 2:
                    if (customerName.equals("")) {
                        System.out.println("No ride booked yet.");
                    } else {
                        System.out.println("\n----- Ride Details -----");
                        System.out.println("Customer Name : " + customerName);
                        System.out.println("Pickup        : " + pickup);
                        System.out.println("Destination   : " + destination);
                        System.out.println("Distance      : " + distance + " km");
                        System.out.println("Estimated Fare: ₹" + fare);
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the Ride Sharing Platform!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
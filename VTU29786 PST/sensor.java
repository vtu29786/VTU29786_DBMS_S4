 import java.util.*;
import java.util.stream.*;

class SensorReading {
    String sensorId;
    double temperature;

    SensorReading(String sensorId, double temperature) {
        this.sensorId = sensorId;
        this.temperature = temperature;
    }

    public String getSensorId() {
        return sensorId;
    }

    public double getTemperature() {
        return temperature;
    }
}

public class sensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        List<SensorReading> readings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");

            String sensorId = parts[0];
            double temperature = Double.parseDouble(parts[1]);

            readings.add(new SensorReading(sensorId, temperature));
        }

        readings.stream()
                // 1. Filter temperatures greater than 50
                .filter(r -> r.getTemperature() > 50)

                // 2 & 3. Group by SensorID and calculate average
                .collect(Collectors.groupingBy(
                        SensorReading::getSensorId,
                        Collectors.averagingDouble(SensorReading::getTemperature)
                ))

                // 4. Sort by average temperature in descending order
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())

                // Display result
                .forEach(entry ->
                        System.out.println(
                                entry.getKey() + " " + entry.getValue()
                        )
                );

        sc.close();
    }
}

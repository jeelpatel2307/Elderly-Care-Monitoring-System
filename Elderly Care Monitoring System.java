import java.util.*;

// Class to represent elderly person
class Elderly {
    private String name;
    private int heartRate;
    private int bloodPressure;
    private boolean isFalling;

    // Constructor
    public Elderly(String name, int heartRate, int bloodPressure, boolean isFalling) {
        this.name = name;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.isFalling = isFalling;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public boolean isFalling() {
        return isFalling;
    }

    public void setFalling(boolean falling) {
        isFalling = falling;
    }

    // Method to display information about the elderly person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Heart Rate: " + heartRate);
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Is Falling: " + (isFalling ? "Yes" : "No"));
    }
}

// Main class to monitor elderly people
public class ElderlyCareMonitoringSystem {
    public static void main(String[] args) {
        // Create a list to store elderly people
        List<Elderly> elderlyList = new ArrayList<>();

        // Add elderly people to the list
        elderlyList.add(new Elderly("John", 80, 120, false));
        elderlyList.add(new Elderly("Alice", 75, 130, true));
        elderlyList.add(new Elderly("Bob", 85, 140, false));

        // Display information about each elderly person
        for (Elderly elderly : elderlyList) {
            System.out.println("Elderly Person:");
            elderly.displayInfo();
            System.out.println();
        }
    }
}

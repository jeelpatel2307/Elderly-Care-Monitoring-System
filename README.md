## Elderly Care Monitoring System

### Overview

The Elderly Care Monitoring System is a Java program designed to monitor the health and well-being of elderly people. It allows users to input information such as heart rate, blood pressure, and whether the person has fallen. The system then stores this information and provides functionality to display and analyze it.

### Features

1. **Elderly Class**: Represents an elderly person with attributes such as name, heart rate, blood pressure, and falling status.
2. **ElderlyCareMonitoringSystem Class**: Contains the main method to interact with the system. It allows users to create instances of Elderly objects, store them in a list, and display their information.

### How to Use

1. **Compile**: Compile the Java files using a Java compiler.
    
    ```bash
    javac Elderly.java ElderlyCareMonitoringSystem.java
    
    ```
    
2. **Run**: Run the main class to execute the program.
    
    ```bash
    java ElderlyCareMonitoringSystem
    
    ```
    

### Example

Here's an example of how to use the Elderly Care Monitoring System:

```java
// Create instances of Elderly objects
Elderly john = new Elderly("John", 80, 120, false);
Elderly alice = new Elderly("Alice", 75, 130, true);
Elderly bob = new Elderly("Bob", 85, 140, false);

// Add elderly people to the list
List<Elderly> elderlyList = new ArrayList<>();
elderlyList.add(john);
elderlyList.add(alice);
elderlyList.add(bob);

// Display information about each elderly person
for (Elderly elderly : elderlyList) {
    elderly.displayInfo();
}

```

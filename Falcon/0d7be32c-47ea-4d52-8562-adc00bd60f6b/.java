// Test case 1: Check if the traffic light is red
TrafficLight trafficLight = new TrafficLight("RED", 10);
System.out.println(trafficLight.isRed()); // Output: true

// Test case 2: Check if the traffic light is green
trafficLight.changeColor("GREEN");
System.out.println(trafficLight.isGreen()); // Output: true

// Test case 3: Check if the traffic light is red after changing to green
trafficLight.changeColor("RED");
System.out.println(trafficLight.isRed()); // Output: true

// Test case 4: Check if the traffic light is green after changing to red
trafficLight.changeColor("GREEN");
System.out.println(trafficLight.isGreen()); // Output: true

// Corner case: Check if the traffic light has an invalid color
trafficLight.changeColor("INVALID");
System.out.println(trafficLight.isRed()); // Output: false
System.out.println(trafficLight.isGreen()); // Output: false

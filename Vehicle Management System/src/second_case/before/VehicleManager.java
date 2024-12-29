package second_case.before;

/**
	Project Title: Vehicle Management System
	URL: https://github.com/kishanrajput23/Java-Projects-Collections/tree/main/Vehicle%20Management%20System
	
	Smells Identification:
	-> Girish:
	- Encapsulation: Leaky Encapsulation
*/

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
    private List<Vehicle> vehicles;

    public VehicleManager() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // start mark for 'Leaky Encapsulation' smell
    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }
    // end mark for 'Leaky Encapsulation' smell
    
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}

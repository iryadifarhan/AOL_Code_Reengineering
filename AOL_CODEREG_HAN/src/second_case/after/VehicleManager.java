package second_case.after;

/**
	Project Title: Vehicle Management System
	URL: https://github.com/kishanrajput23/Java-Projects-Collections/tree/main/Vehicle%20Management%20System
	
	Smells Fixing:
	-> Girish:
	- Encapsulation: Leaky Encapsulation => fixed with implementing prototype (clone) design pattern using 'Clone' interface into class 'Vehicle'
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

    public List<Vehicle> getClonedVehicles() {
        List<Vehicle> vehiclesDeepCopy = new ArrayList<>();
        
        for(Vehicle vehicle : this.vehicles) {
        	try {
				vehiclesDeepCopy.add(vehicle.createClone());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
        }
        
    	return vehicles;
    }
    
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}
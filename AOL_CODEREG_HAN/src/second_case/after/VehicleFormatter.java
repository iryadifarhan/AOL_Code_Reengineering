package second_case.after;

public class VehicleFormatter {
	private static Vehicle vehicle;
		
	public static void setVehicle(Vehicle vehicle) {
		VehicleFormatter.vehicle = vehicle;
	}

	public static String formatToString() {
        return "Make: " + vehicle.getMake() + ", Model: " + vehicle.getModel() 
        + ", Year: " + vehicle.getYear() + ", Price: $" + vehicle.getPrice();
    }
}

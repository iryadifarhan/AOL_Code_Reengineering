package second_case.before;

/**
	Project Title: Vehicle Management System
	URL: https://github.com/kishanrajput23/Java-Projects-Collections/tree/main/Vehicle%20Management%20System
	
	Smells Identification:
	-> Fowler
	- Bloaters: Data Clumps
	- Change Preventers: Divergent Change
	
	-> Girish
	- Abstraction: Missing Abstraction, Multifaceted Abstraction
*/

public class Vehicle {
    // start mark for 'Data Clumps' and 'Missing Abstraction' smell
    private String make;
    private String model;
    // start mark for 'Data Clumps' and 'Missing Abstraction' smell
    
    private int year;
    private double price;

    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // start mark for 'Multifaceted Abstraction' and 'Divergent Change' smell
    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Price: $" + price;
    }
    // end mark for 'Multifaceted Abstraction' and 'Divergent Change' smell
}

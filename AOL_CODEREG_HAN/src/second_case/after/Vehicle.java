package second_case.after;

/**
	Project Title: Vehicle Management System
	URL: https://github.com/kishanrajput23/Java-Projects-Collections/tree/main/Vehicle%20Management%20System
	
	Smells Fixing:
	-> Fowler
	- Bloaters: Data Clumps => fixed with extract class 'MakeModel'
	- Change Preventers: Divergent Change => fixed with extract utility class 'VehicleFormatter'
	
	-> Girish
	- Abstraction: 
		Missing Abstraction => fixed with extract class 'MakeModel'
		Multifaceted Abstraction => fixed with extract utility class 'VehicleFormatter'
*/

public class Vehicle implements Clone{
	private MakeModel makeModel;  
    private int year;
    private double price;

    public Vehicle(String make, String model, int year, double price) {
        this.makeModel = new MakeModel(make, model);
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return this.makeModel.getMake();
    }

    public String getModel() {
        return this.makeModel.getModel();
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

	@Override
	public Vehicle createClone() throws CloneNotSupportedException {
		return (Vehicle) super.clone();
	}
}
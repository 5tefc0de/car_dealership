package car_dealership;

public class Dealership {
	
	public static void main(String[] args) {
		
		Customer cust1 = new Customer("Tom", "123 Anything St. ", 200);
		
		Vehicle vehicle = new Vehicle("Honda", "Accord", 2000);
		Vehicle car = new Vehicle("BMW", "M3", 20000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, true);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);
	}

}

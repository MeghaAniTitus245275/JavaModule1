package factory;

public class usevehiclefactory {
	
	public static void main(String[] args) {
		Vehicle Seltos=VehicleFactory.newInstance("Seltos");
		Seltos.honk();
		
		Vehicle Xcross=VehicleFactory.newInstance("Xcross");
		Xcross.honk();
	}

}

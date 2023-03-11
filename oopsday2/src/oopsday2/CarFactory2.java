package oopsday2;

public class CarFactory2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	// CarIface car  = new CarIface();
	//	CarIface car;//NOT REFERRING TO ANY OBJECT
		CarIface car = new Car(5000,500,0,false);
		
		System.out.println(car);
		car.start();
		car.honk();
		car.moove();
		car.stop();
		
		System.out.println(car);
		

	}

}

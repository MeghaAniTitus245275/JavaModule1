package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Deserializablecar {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
				//we need to deserialize this car object
		FileInputStream fis = new FileInputStream("d://serializableCar.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);	//wrapping
		Car car=(Car)ois.readObject();	//assigning parent class object to car
		System.out.println(car.getName());
		System.out.println(car.getPrice());
		
	}

}

package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableCar {
	public static void main(String[] args) throws IOException {
		
		Car c = new Car("maruthi",100000);			//we need to serialize this c object
		FileOutputStream fos = new FileOutputStream("d://serializableCar.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		
	}

}

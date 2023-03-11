package serilization.test;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
public class TestEmployee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(101, "John doe", 4000,"avc");
		FileOutputStream fos  = new FileOutputStream("emp.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);//send from jp to cloud ,console etc - output
		
		oos.writeObject(emp);
		
		
		

	}

}

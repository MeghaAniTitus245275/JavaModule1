package serilization.test;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;


public class TestEmployee2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("D:\\ustcore\\ioserialization\\emp.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		Employee ref = (Employee) obj;
		System.out.println(ref);

		

}}

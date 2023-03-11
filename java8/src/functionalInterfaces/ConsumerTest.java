package functionalInterfaces;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {
		List<String> strings = 
				Arrays.asList("Andhra pradesh","tamil nadu", "telangana","kerala","karnataka");
		 Consumer<String> consumer = (str)->{
			 System.out.println(str);
			
		 };
		 
		 consumer.accept("i am doing great");
		 for(String str:strings)
		 {
			 consumer.accept(str);
		 }
		 printStrings(strings,consumer);
	}
	public static void printStrings(List<String>strings,Consumer<String>c)
	{
		for(String str : strings)
		{
			c.accept(str);
		}
	}

}

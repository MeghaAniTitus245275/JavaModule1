package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateTest {

	public static void main(String[] args) {
		List<String> strings = 
				Arrays.asList("Andhra pradesh","tamil nadu", "telangana","kerala","karnataka");
		
		Predicate <String> p =(String str) ->{
			return str.length()>10;	
					};
					System.out.println(p.test("hello"));
					for(String str:strings)
					System.out.println(p.test(str));
					desiredLength(strings,p);
			
		
	}
	
	public static void desiredLength(List<String>Strings,Predicate<String>p)
	{
		for(String str: Strings)
		{
			System.out.println(p.test(str));
		}
	}

}

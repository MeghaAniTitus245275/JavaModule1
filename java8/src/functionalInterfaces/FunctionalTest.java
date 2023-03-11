package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {
	public static void main(String[] args) {
		
	
	List<String> strings = 
			Arrays.asList("Andhra pradesh","tamil nadu", "telangana","kerala","karnataka");

	Function <String,Integer> f= (str)->{
		return str.length();
		
	};
	
	
	String str = "kulathoor";
	Function <String,String> f2= (s)->{
		return s.toUpperCase();	
	};
	
	
	
	String str1 = "MAN";
	Function <String,String> f3= (s)->{
		return s.toLowerCase();	
	};
	
	
	Function <String,String> f4= (s)->{
	StringBuilder sb =new 	StringBuilder(s);
	sb.reverse();
	String str1 = sb.toString();
	return str1;
	};
	
	
	//function for uppercase
	//function for lowercase
	//function for reverse
	printLength(strings,f);
	uppercase(str,f2);
	lowercase(str1,f3);
	

	}

	private static void printLength(List<String> strings, Function<String, Integer> f) {
		for(String str:strings) {
			System.out.println(f.apply(str));
			}
		}
		
	
		
		private static void uppercase(String str, Function<String, String> f) {
			
				System.out.println(f.apply(str));
		}
		
		private static void lowercase(String str, Function<String, String> f) {
			
			System.out.println(f.apply(str));
		

	
}
}

package ListDemo;
import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap2 {

	public static void main(String[] args) {
		
		TreeMap<String,String> countryCurr = new TreeMap<>();
		
		countryCurr.put("IND", "RUPE");
		countryCurr.put("USA", "DOLLAR");
		countryCurr.put("UK", "POUND");
		
		System.out.println(countryCurr);
		
		System.out.println(countryCurr.get("IND"));
		
		countryCurr.put("IND", "RUPEE");
		
		System.out.println(countryCurr.size());
		System.out.println(countryCurr.containsKey("UK"));
		System.out.println(countryCurr.containsValue("DOLLAR"));
		
		//HashMap has 3 views
		//1.keyview
		
		Set<String> keys = countryCurr.keySet();
		for(String key:keys) {
			System.out.println(key);
			
		}
		
		//2.values view
		Collection<String>values = countryCurr.values();	
		for(String value: values)
		{
			System.out.println(value);
		}
		
		//3.key values together  - entry set
		Set<java.util.Map.Entry<String,String>>entries = countryCurr.entrySet();
		for(java.util.Map.Entry<String, String> entry : entries)
		{
			System.out.println(entry);
		}
		
		
		
		
	}

}

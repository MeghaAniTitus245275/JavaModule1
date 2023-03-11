package ListDemo;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		
		HashSet<String> bookSet = new HashSet<>();
		bookSet.add("java in nutshell");
		bookSet.add("java a complete reference");
		bookSet.add("Thinking in java");
		bookSet.add("java in 21 days");
		bookSet.add("java for dummys");
		
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("java in nutshell"));
		
		bookSet.add("thinking in java");
		System.out.println(bookSet.size());
		
		for(String book:bookSet)
		{
			System.out.println(book);
		}
		Iterator<String> iter = bookSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}

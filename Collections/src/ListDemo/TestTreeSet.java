package ListDemo;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> bookSet = new TreeSet<>();
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

package userdefinedobjects;
import java.util.HashMap;
//import java.util.Map; 
class F {public static void main(String[] args){
	
	String str = "The destructive algorithms contained in this class,that is,"
			+ "the algorithms that modify the collection on which they operate,are specified to throw"
			+"UnsupportedOperationException if the collection does not support the appropriate mutation primitive(s),"
			+ "such as the set method.These algorithms may,but are not required to,throw this exception if an invocation"
			+ " would have no effect on the collection.For example,invoking the sort method on an unmodifiable list that is "
			+ "already sorted may or may not throw UnsupportedOperationException.";
	HashMap<String, Integer> hashMap = new HashMap<>();
	String str1 = str.toLowerCase() ;
	String textwords = str1.replace(","," ");
	String words1 = textwords.replace("."," ");
	String[] words = words1.split(" ");
	
	for (String word : words) {
		Integer integer = hashMap.get(word);
		System.out.println(word);
		if (integer == null)
			hashMap.put(word, 1);
		else {
			hashMap.put(word, integer + 1);
			}
		}
	System.out.println(hashMap);
	}
}


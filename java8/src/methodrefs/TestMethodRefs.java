package methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

interface Formula{
	public void m1();
	
}

class Some{
	public static void m2() {
		System.out.println("from m2....");
	}
}

class Other{
	Other(){
		System.out.println("from other constructor");
	}
	void m2(String str) {
		System.out.println("from m2()");
	}
}

public class TestMethodRefs {

	public static void main(String[] args) {
		
		Formula f = Some::m2;
		f.m1();
		
		f = Other::new;
		
		List<String>list=Arrays.asList("one","two","three");
		list.stream().forEach(System.out::println);
		List<Integer>intList=Arrays.asList(12,32,1323,11);
		Optional<Integer> num = intList.stream().reduce(Math::max);
		System.out.println(num.get());
		Optional<Integer> num1 = intList.stream().reduce(Math::min);
		System.out.println(num1.get());
		
		
			
	}

}

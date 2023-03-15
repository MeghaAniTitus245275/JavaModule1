package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FuncionalTest {

	public static void main(String[] args) {
		Function<String, Integer> f = (str) -> {
			return str.length();
		};
		List<String> strings = Arrays.asList("Andra Pradesh", "Tamil Nadu", "kerala", "Karnataka", "Telangana");
		String str1 = "mandan";

		Function<String, String> f1 = (str) -> { // uppercase FUnction
			return str.toUpperCase();
		};
		Function<String, String> f2 = (str) -> {
			return str.toLowerCase();

		};
		Function<String, String> f3 = (str) -> {
			StringBuilder s = new StringBuilder(str);
			s.reverse();
			String rev = s.toString();
			return rev;

		};

		upper(strings, f1);
		lower(strings, f2);
		reverse(str1, f3);

		// TODO Auto-generated method stub

	}

	public static void print(List<String> strings, Function<String, Integer> f) {
		for (String str : strings) {
			System.out.println(f.apply(str));
		}
	}

	public static void upper(List<String> strings, Function<String, String> f1) {
		for (String str : strings)
			System.out.println(f1.apply(str));
	}

	public static void lower(List<String> strings, Function<String, String> f2) {
		for (String str : strings)
			System.out.println(f2.apply(str));
	}

	public static void reverse(String str, Function<String, String> f3) {
		System.out.println(f3.apply(str));

	}
}

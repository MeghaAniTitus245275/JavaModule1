package userdefinedobjects;

public class IntoToString {

	public static void main(String[] args) {

		
		int i = 151;
		String str = i+"";
		StringBuilder sb = new StringBuilder (str);
		sb.reverse();
		boolean result = str.equals(sb.toString());
		System.out.println(result);
	}

}

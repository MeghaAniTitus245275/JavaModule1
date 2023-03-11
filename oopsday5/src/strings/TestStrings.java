package strings;

public class TestStrings {
	public static void main(String[] args) 
	{
		byte bytes[] = {65,66,67,68,69};
		String str = new String(bytes);
		System.out.println(str.length());
		
		System.out.println(str);
		
		str = "Welcome to ust global";
		
		bytes = str.getBytes();
		for(byte b: bytes) {
			System.out.println(b);
		}
	char chars[] = {'U','S','T',' ','G'};
	str = new String(chars);
	System.out.println(str);
	
	str.getChars(0, chars.length - 1, chars, 0);
	for(char c: chars)
	{
		System.out.println(c);
	}
	String  str1 = new String("she sells sea, shells in. Sea shore");
	/*int count = 0;
	for(int i = 0;i<str1.length();i++)
	{
	
		if(str1.charAt(i)=='s'||str1.charAt(i)=='S' )
		{
			count++;
		}
	}
	System.out.println(count);*/
	String words[] = str1.split("[.]");
	System.out.println("count of s = "+words.length);
	
	for(String word: words)
	{
		System.out.println(word);
	}
     str1 = new String("cartoon");
	System.out.println(str1.startsWith("car"));
	System.out.println(str1.endsWith("toon"));
	
	int apos = str1.indexOf('a');
	int tpos = str1.indexOf('t');
	
	String string2 = str1.substring(apos,tpos);
	System.out.println(string2);
	
	string2 = str1.substring(tpos);
	System.out.println(string2);
	
	str1 = new String("madamdam");

	int dpos = str1.lastIndexOf('d');
	System.out.println(dpos);
	string2 = str1.substring(dpos,str1.length());
	System.out.println(string2);
	
	
String email = new String("megha.anititus@ust.com");
int j = email.lastIndexOf('.');
string2 = email.substring(j,email.length());
System.out.println(string2);

String str2 = new String ("welcome");
String str3 = new String ("welcome");

boolean result  = str2.equalsIgnoreCase(str3);
System.out.println(result);

int val = str3.compareTo(str2);//ascii of l is taken (subtracted)
System.out.println(val);

str1 = "Diehard";
System.out.println(str1.toLowerCase());
System.out.println(str1);
System.out.println(str1.toUpperCase());  //strings are immutable
System.out.println(str1);

//"16-11-477/6/A/3 Hyderabad 50036"//
String str5 = "16-11-477/6/A/3 Hyderabad 50036";
int count1 = 0;
int count2=0;
int count3=0;
for(int i = 0;i<str5.length();i++)
{
	char c = str5.charAt(i);
	if(Character.isDigit(c))
	{
		count1++;
	}
	else if(Character.isAlphabetic(c)) {
		count2++;
	}
	
	else 
	{
		count3++;
	}
	
	

	
	
}System.out.println(count1);
System.out.println(count2);
System.out.println(count3);

int k = str5.lastIndexOf('/');
String str6 = str5.substring(k-1, str5.length());
System.out.println(str6);
}}
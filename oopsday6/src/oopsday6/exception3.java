package oopsday6;

public class exception3 {
	public static void main(String[] args) {
		System.out.println("program task begins");
		try
		{ System.out.println("entered try...");
			int c =10/0;
			System.out.println("from try after"+" exception...");
		}catch(Exception e)
		{
			//System.out.println("from catch..");
		}/*catch(ArithmeticException e)
		{
			e.printStackTrace();
		}*/
		finally
		{
			System.out.println("from finally..");
		}
		System.out.println("program completed task..");
	}

}

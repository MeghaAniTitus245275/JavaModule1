package oopsday1;

public class carfactory
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Car jag  = new Car();
       jag.color =  "Green";
       jag.price = 3000000;
       jag.brand = "innova";
       jag.model = "Toyota";
       System.out.println(jag.color);
       System.out.println(jag.brand);
       System.out.println(jag.brand);
       System.out.println(jag.model);
       
       Car bmw  = new Car();
       bmw.color = "blue";
       bmw.price = 2000000000;
       bmw.brand = "BMW";
       bmw.model = "Luxury SUV";
//       
       System.out.println(bmw.color);
       System.out.println(bmw.brand);
       System.out.println(bmw.brand);
       System.out.println(bmw.model);
       
       bmw = jag;
       
       }

}

package oopsday1.setget;

public class carfactory
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Car jag  = new Car();
       jag.setColor("Red");
       jag.setPrice(300000000);
       jag.setBrand("jaguar");
       jag.setModel("premium");
      
       System.out.println(jag.getColor());
       System.out.println(jag.getPrice());
       System.out.println(jag.getBrand());
       System.out.println(jag.getModel());
       
       
       
       
       /*
		 * jag.color = "Green"; jag.price = 3000000; jag.brand = "innova"; jag.model =
		 * "Toyota"; System.out.println(jag.color); System.out.println(jag.brand);
		 * System.out.println(jag.brand); System.out.println(jag.model);
		 */
       Car bmw  = new Car();
    
       bmw.setColor("Red");
       bmw.setPrice(300000000);
       bmw.setBrand("jaguar");
       bmw.setModel("premium");
      
       System.out.println(bmw.getColor());
       System.out.println(bmw.getPrice());
       System.out.println(bmw.getBrand());
       System.out.println(bmw.getModel());
		/*
		 * bmw.color = "blue"; bmw.price = 2000000000; bmw.brand = "BMW"; bmw.model =
		 * "Luxury SUV"; // System.out.println(bmw.color);
		 * System.out.println(bmw.brand); System.out.println(bmw.brand);
		 * System.out.println(bmw.model);
		 */
       bmw = bmw;
       
       }

}

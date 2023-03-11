package oopsday1.withbuisnessmethods;

public class carfactory
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Car jag  = new Car("yellow",495885889,"toyota","innova");
      jag.start();
      jag.changeGear(1);
      jag.stop();
      
//      System.out.println(jag.hashCode());
//      System.out.println(Integer.toHexString(jag.hashCode()));
//      System.out.println(jag);
      //       jag.setColor("Red");
//       jag.setPrice(300000000);
//       jag.setBrand("jaguar");
//       jag.setModel("premium");
      
//      
//       System.out.println(jag.getColor());
//       System.out.println(jag.getPrice());
//       System.out.println(jag.getBrand());
//       System.out.println(jag.getModel());
//       
       
       
       
       /*
		 * jag.color = "Green"; jag.price = 3000000; jag.brand = "innova"; jag.model =
		 * "Toyota"; System.out.println(jag.color); System.out.println(jag.brand);
		 * System.out.println(jag.brand); System.out.println(jag.model);
		 */
       Car bmw  = new Car("yellow",495885889,"toyota","innova");
       bmw.start();
       bmw.changeGear(1);
       bmw.stop();
       
//       System.out.println(bmw.hashCode());
//       System.out.println(Integer.toHexString(bmw.hashCode()));
//       System.out.println(bmw);
    
//       bmw.setColor("Red");
//       bmw.setPrice(300000000);
//       bmw.setBrand("jaguar");
//       bmw.setModel("premium");
//       System.out.println(Integer.toHexString(bmw.hashCode()));
//      
//       System.out.println(bmw.getColor());
//       System.out.println(bmw.getPrice());
//       System.out.println(bmw.getBrand());
//       System.out.println(bmw.getModel());
		/*
		 * bmw.color = "blue"; bmw.price = 2000000000; bmw.brand = "BMW"; bmw.model =
		 * "Luxury SUV"; // System.out.println(bmw.color);
		 * System.out.println(bmw.brand); System.out.println(bmw.brand);
		 * System.out.println(bmw.model);
		 */
       
       }

}

package oopsday4.inheritance;

public class CompanyHR {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
		System.out.println(emp1);
		
		Employee emp2 = new Employee("Jane Doe","Female",23,102,"Accounting",35000);
		System.out.println(emp2);
		
		Employee emp3 = new Employee("Joson Doe","Male",24,103,"sales",10000);
		System.out.println(emp3);
		
		Employee emp4 = new Employee("Jones Doe","Male",23,104,"Research",40000);
		System.out.println(emp4);
		
		Employee emp5 = new Employee("John Doe","Male",24,101,"Research",40000);
		System.out.println(emp5);
		
		//constructors are not inherited
		
		if(emp1.equals(emp5) || emp1 == emp5)
		{
			System.out.println("objects are same");
			
		}
		else
		{
			System.out.println("objects are not same");
		}

	}

}
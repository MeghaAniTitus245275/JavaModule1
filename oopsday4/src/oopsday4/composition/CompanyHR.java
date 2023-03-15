package oopsday4.composition;


public class CompanyHR {

	public static void main(String[] args) {
		
		
		Address resAdd=new Address("31","Mannath","Worli","Mumbai",40048);
		Address commad=new Address("32","Antela","Bnadra","Mumbai",40032);
		
		Employee emp1= new Employee("John Dpe","Male",24,101,"Research",2000000.0,resAdd ,commad);
		System.out.println(emp1);
		//Employee emp2= new Employee(102,"25",2678900);
		Employee emp2= new Employee("taniya","female",22,102,"Accounting",400000,resAdd,commad);
		System.out.println(emp2);
		Employee emp3= new Employee("maria","female",22,104,"training",30000000,resAdd,commad);
		System.out.println(emp3);
		Employee emp4= new Employee("merin","female",24,107,"marketing",5100000,resAdd,commad);
		System.out.println(emp4);
		Employee emp5= new Employee("John Dpe","Male",24,101,"Research",2000000.0,resAdd,commad);
		System.out.println(emp5);
		if(emp1.equals(emp5))// passes emp5 and invoked by emp1 so current object is emp1
			
			System.out.println("same");
		else
			
			System.out.println("not same");
		

	}

}

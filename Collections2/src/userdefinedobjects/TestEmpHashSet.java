package userdefinedobjects;

import java.util.HashSet;

public class TestEmpHashSet {

	public static void main(String[] args) {
		
		HashSet<Employee> empSet = new HashSet<Employee>();
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
		
		
		Employee emp2 = new Employee("Jane Doe","Female",23,102,"Accounting",35000);
		
		Employee emp3 = new Employee("Joson Doe","Male",24,103,"sales",10000);
		
		Employee emp4 = new Employee("Jones Doe","Male",23,104,"Research",40000);
		
		
		Employee emp5 = new Employee("John Doe","Male",24,101,"Research",40000);
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		System.out.println(empSet.size());
		
	}

}

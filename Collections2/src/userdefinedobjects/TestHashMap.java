package userdefinedobjects;
import  java.util.ArrayList;
import java.util.Collection;
import  java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import  java.util.TreeSet;
import  java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);		
		Employee emp2 = new Employee("Jane Doe","Female",23,102,"Accounting",35000);		
		Employee emp3 = new Employee("Joson Doe","Male",24,103,"sales",10000);		
		Employee emp4 = new Employee("Jones Doe","Male",23,104,"Research",40000);
		Employee emp5 = new Employee("John Doe","Male",24,101,"Research",40000);
		HashSet<Employee> empSet = new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		TreeSet<Employee> empTreeSet = new TreeSet<Employee>();
		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);
		empTreeSet.add(emp4);
		empTreeSet.add(emp5);
		
		
		
		HashMap<String,Collection> dataMap = new HashMap<>();
		
		dataMap.put("empList", empList);
		dataMap.put("empSet", empSet);
		dataMap.put("empTreeSet", empTreeSet);
		
		System.out.println(dataMap);
		
		Collection<Employee> list = dataMap.get("empList");
		Iterator<Employee> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collection<Employee> set = dataMap.get("empSet");
		 iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Collection<Employee> tree = dataMap.get("empList");
		 iter = tree.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//
	}

}

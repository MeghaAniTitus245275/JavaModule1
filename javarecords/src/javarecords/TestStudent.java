package javarecords;

import java.util.List;
import java.util.ArrayList;



public class TestStudent {
	
	public static void main(String[] args) {
		
	
	List<Integer> johnGrades = new ArrayList<>();
	johnGrades.add(80);
	johnGrades.add(90);
	johnGrades.add(70);
	Student john = new Student("John", 123, johnGrades);

	List<Integer> sarahGrades = new ArrayList<>();
	sarahGrades.add(50);
	sarahGrades.add(55);
	sarahGrades.add(62);
	Student sarah = new Student("Sarah", 456, sarahGrades);


	System.out.println(john.getAverageGrade()); // prints "80.0"
	System.out.println(sarah.hasPassingGrade()); // prints "true"
	}

}

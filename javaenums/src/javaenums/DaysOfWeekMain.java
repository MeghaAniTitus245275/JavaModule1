package javaenums;

public class DaysOfWeekMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DayOfWeek today = DayOfWeek.SATURDAY;
		System.out.println("Today is "+today.getName());
		
		switch(today)
		{
			case MONDAY:
				System.out.println("Work hard");
				break;
		
			case TUESDAY:
				System.out.println("work little more");
				break;
			case WEDNESDAY:
				System.out.println("work work little more");
				break;
			case THURSDAY:
				System.out.println("work work more weekend around");
				break;
			case FRIDAY:
				System.out.println("yea,weekeend arrived");
				break;
			case SATURDAY:
				System.out.println("enjoy morning coffee and go for a shopping");
				break;
			case SUNDAY:
				System.out.println("do all cleaning work and snozzzzzzzzzzzzzzzz");
				break;
		}
		
	}
}



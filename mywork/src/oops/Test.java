package oops;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("ENTER 'C' IF YOU WANT TO PLAY SMASHER ELSE PRESS 'N' TO PLAY NIMPUS : ");
		Scanner sc = new Scanner(System.in);
		String Gameoption = sc.next();
		Game game =null;
		if("c".equals(Gameoption))
		{
			game = new Smasher();
		}
		else
		{
			game = new Nimpus();
		}
		Mobile m = new Mobile(game);
		m.playGame();
	}

}

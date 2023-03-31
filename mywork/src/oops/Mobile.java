package oops;

public class Mobile {
	
	private Game game;

	public Mobile(Game game) {
		super();
		this.game = game;
	}

	/**
	 * @return the game
	 */
	public Game getGame() {
		return game;
	}

	/**
	 * @param game the game to set
	 */
	public void setGame(Game game) {
		this.game = game;
	}
	
	public void playGame()
	{
			game.play();
	}
	

}

package card;

public class GUI{
	static START start; 
	static PLAY play;
	static PLAY_GAME game;
	static How how;
	static Result result;
	
	public static void main(String[] args) {
		GUI main = new GUI();
		main.start = new START(); 
		main.start.setMain(main);
    }
	public static void begin(){
		start.dispose();
		GUI main = new GUI();
		main.play = new PLAY();
	}
	public static void howbegin(){
		how.dispose();
		GUI main = new GUI();
		main.play = new PLAY();
	}
	public static void backtomenu(){
		MAIN.Selectednum = 0;
		play.dispose(); 
		GUI main = new GUI();
		main.start = new START();
	}
	public static void selection(){
		play.dispose(); 
		GUI main = new GUI();
		main.play = new PLAY();
	}
	public static void game(){
		play.dispose(); 
		GUI main = new GUI();
		main.game = new PLAY_GAME();
	}
	public static void backtomenu2(){
		MAIN.Selectednum = 0;
		result.dispose(); 
		GUI main = new GUI();
		main.start = new START();
	}
	public static void win(){
		game.dispose(); 
		GUI main = new GUI();
		main.game = new PLAY_GAME();
	}
	public static void how(){
		start.dispose(); 
		GUI main = new GUI();
		main.how = new How();
	}
	public static void howback() {
		how.dispose();
		GUI main = new GUI();
		main.start = new START();
		
	}
	public static void result(){
		game.dispose(); 
		GUI main = new GUI();
		main.result = new Result();
	}
	
	public static void back() {
		result.dispose();
		GUI main = new GUI();
		main.start = new START();
		
	}
}
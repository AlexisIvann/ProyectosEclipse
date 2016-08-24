
import java.util.Scanner;

public class App {
	
	public static Scanner S = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Juego de palitos!");
		System.out.println("Nombre de primer jugador: ");
		String firstPlayerName = S.next();
		System.out.println("Nombre de segundo jugador: ");
		String secondPlayerName = S.next();
		
		Game game = new Game();
		Player playerOne = new Player(firstPlayerName);
		Player playerTwo = new Player(secondPlayerName);
		game.addPlayer(playerOne);
		game.addPlayer(playerTwo);
		
		game.play();
		S.close();
	}
}

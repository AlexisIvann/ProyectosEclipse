import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {

	private int palitos = 21;
	private List<Player> players = new ArrayList<Player>();

	public Player play() {
		Iterator<Player> it = players.iterator();
		Player player = null;
		while (palitos > 1) {
			if (!it.hasNext()) {
				it = players.iterator();
			}
			player = it.next();
			palitos -= player.take();
			System.out.println(palitos + "palitos restantes.");
		}
		if (palitos <= 0) {
			System.out.println(player.getNombre() + " pierde.");
			return player;
		} else {
			if (!it.hasNext()) {
				it = players.iterator();
			}
			Player looser = it.next();
			System.out.println(looser.getNombre() + " pierde.");
			return looser;
			
		}
	}

	public int getPalitos() {
		return palitos;
	}

	public void setSticks(int palitos) {
		this.palitos = palitos;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public void addPlayer(Player player) {
		players.add(player);
	}
}
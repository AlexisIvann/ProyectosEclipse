
public class Player {

	private String nombre;

	public Player(String nombre) {
		this.nombre = nombre;
	}

	public int take() {
		int palitos;
		do {
			System.out.println(nombre + ", Cuantos palitos?: ");
			palitos = Integer.parseInt(App.S.next());
			if (palitos > 2 || palitos < 1) {
				System.out.println("Toma 1 o 2 palitos.");								
			}
		} while (palitos > 2 || palitos < 1);
		return palitos;		
	}

	public String getNombre() {
		return nombre;
	}

	public void setName(String nombre) {
		this.nombre = nombre;
	}
}
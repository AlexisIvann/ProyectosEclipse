
public class triangulo {

	private vertice a,b,c; // = new vertice(0,0; //creando objeto de tipo vertice llamado a, el cual dice que existe, luego se crea el objeto, inicializa y reserva la memoria.

	public triangulo(vertice a, vertice b, vertice c){//constructor que va a inicializar, reservar memoria y crear los3 objetos.
	this.a = a; // copiar la direccion de memoria.
	this.b = b;
	this.c = c;
	
	}
	
	//set and get
	public vertice getA() {
		return a;
	}

	public void setA(vertice a) {
		this.a = a;
	}

	public vertice getB() {
		return b;
	}

	public void setB(vertice b) {
		this.b = b;
	}

	public vertice getC() {
		return c;
	}

	public void setC(vertice c) {
		this.c = c;
	}

	
}

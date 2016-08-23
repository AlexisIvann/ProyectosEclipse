
public class numero {

	private int num1 = 0; //Atributos
	private double num2 = 0;
	
	public void set (int num){ //metodo para darle valor a los atributos
		num1 = num;
		
	}
	
	public void set (double num){ //este en cambio tiene parametro de tipo double, metodo para darle valor a los atributos
     num2 = num;
	}

	public void set(int num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//get  para recibir desde fuera del objeto los valores de los atributos
	public int getNum1() {
		return num1;
	}

	public double getNum2() {
		return num2;
	}



}



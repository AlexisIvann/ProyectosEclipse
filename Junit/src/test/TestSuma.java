//test case es una clase que va a poner a prueba otra en particular.
package test;

import org.junit.Test;

import junit.framework.TestCase;
import codigo.suma;

public class TestSuma extends TestCase {
private suma suma = new suma();

@Before //anotacion es un comentario que indica al framework que tiene que
//evaluar o realizar tal metodo antes o despues, dar orden de ejecucion.

public void setUp(){ //set todo lo necesario antes de la ejecucion del test
	suma.setA(2);
	suma.setB(3);
}
@Test
public void testSuma (){
assertEquals(5,suma.sumar()); //considerar si el resultado esperado es el resultado obtenido
//ver si 4 es el resultado esperado
}
}

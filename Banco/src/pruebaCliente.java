import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
/**
 * Esta clase nos va a servir para las pruebas correspondientes a los m�todos de la clase cliente
 * @author alejandro
 *
 */
public class pruebaCliente {
	@Test
	/**
	 * Este m�todo contiene las pruebas con todos los metodos. Para probar esos m�todos es necesaria
	 * la creaci�n de un objeto cliente y un arraylist para pasarle al objeto.
	 */
	void test() {
		ArrayList<Cuenta> pruebaCuentas = new ArrayList<Cuenta>();
		Cliente pruebaCliente = new Cliente ("Alejandro","Valverde", "Essahbi", "Mostoles", "2346234g", 34534, 25, pruebaCuentas);
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "nombre" con el get
		 */
		assertEquals("Alejandro", pruebaCliente.getNombre());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "apellido" con el get
		 */
		assertEquals("Valverde", pruebaCliente.getApellido());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "apellido2" con el get
		 */
		assertEquals("Essahbi", pruebaCliente.getApellido2());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "direccion" con el get
		 */
		assertEquals("Mostoles", pruebaCliente.getDireccion());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "NIF" con el get
		 */
		assertEquals("2346234g", pruebaCliente.getNif());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "telefono" con el get
		 */
		assertEquals(34534, pruebaCliente.getTelefono());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "edad" con el get
		 */
		assertEquals(25, pruebaCliente.getEdad());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien el array list "pruebaCuentas" con el get
		 */
		assertEquals(pruebaCuentas, pruebaCliente.getCuentas());
	}
}

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
/**
 * Esta clase nos va a servir para las pruebas correspondientes a los métodos de la clase cliente
 * @author alejandro
 *
 */
public class pruebaCliente {
	@Test
	/**
	 * Este método contiene las pruebas con todos los metodos. Para probar esos métodos es necesaria
	 * la creación de un objeto cliente y un arraylist para pasarle al objeto.
	 */
	void test() {
		ArrayList<Cuenta> pruebaCuentas = new ArrayList<Cuenta>();
		Cliente pruebaCliente = new Cliente ("Alejandro","Valverde", "Essahbi", "Mostoles", "2346234g", 34534, 25, pruebaCuentas);
		/**
		 * Este método comprueba que se esta cogiendo bien la propiedad "nombre" con el get
		 */
		assertEquals("Alejandro", pruebaCliente.getNombre());
		/**
		 * Este método comprueba que se esta cogiendo bien la propiedad "apellido" con el get
		 */
		assertEquals("Valverde", pruebaCliente.getApellido());
		/**
		 * Este método comprueba que se esta cogiendo bien la propiedad "apellido2" con el get
		 */
		assertEquals("Essahbi", pruebaCliente.getApellido2());
		/**
		 * Este método comprueba que se esta cogiendo bien la propiedad "direccion" con el get
		 */
		assertEquals("Mostoles", pruebaCliente.getDireccion());
		/**
		 * Este método comprueba que se esta cogiendo bien la propiedad "NIF" con el get
		 */
		assertEquals("2346234g", pruebaCliente.getNif());
		/**
		 * Este método comprueba que se esta cogiendo bien la propiedad "telefono" con el get
		 */
		assertEquals(34534, pruebaCliente.getTelefono());
		/**
		 * Este método comprueba que se esta cogiendo bien la propiedad "edad" con el get
		 */
		assertEquals(25, pruebaCliente.getEdad());
		/**
		 * Este método comprueba que se esta cogiendo bien el array list "pruebaCuentas" con el get
		 */
		assertEquals(pruebaCuentas, pruebaCliente.getCuentas());
	}
}

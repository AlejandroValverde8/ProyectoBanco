import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class pruebaCliente {
	@Test
	void test() {
		ArrayList<Cuenta> pruebaCuentas = new ArrayList<Cuenta>();
		Cliente pruebaCliente = new Cliente ("Alejandro","Valverde", "Essahbi", "Mostoles", "2346234g", 34534, 25, pruebaCuentas);
		
		assertEquals("Alejandro", pruebaCliente.getNombre());
		assertEquals("Valverde", pruebaCliente.getApellido());
		assertEquals("Essahbi", pruebaCliente.getApellido2());
		assertEquals("Mostoles", pruebaCliente.getDireccion());
		assertEquals("2346234g", pruebaCliente.getNif());
		assertEquals(34534, pruebaCliente.getTelefono());
		assertEquals(25, pruebaCliente.getEdad());
		assertEquals(pruebaCuentas, pruebaCliente.getCuentas());
		assertEquals(34534, pruebaCliente.getTelefono());
	}
}

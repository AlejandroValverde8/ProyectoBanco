import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class pruebaCuenta {
	@Test
	void test() {
		ArrayList<TarjetaDeCredito> tarjetas = new ArrayList<TarjetaDeCredito>();
		Cuenta pruebaCuenta1 = new Cuenta("2342342b", 3000, 1000, 2010, tarjetas);
		assertEquals("2342342b", pruebaCuenta1.getIdCuenta());
		assertEquals(3000, pruebaCuenta1.getSaldo());
		assertEquals(1000, pruebaCuenta1.getLimiteRetirada());
		assertEquals(2010, pruebaCuenta1.getFechaDeApertura());
		assertEquals(tarjetas, pruebaCuenta1.getTarjeta());
	}
}

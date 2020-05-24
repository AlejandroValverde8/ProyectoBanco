import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class pruebaCuenta {
	@Test
	void test() {
		ArrayList<TarjetaDeCredito> tarjetas = new ArrayList<TarjetaDeCredito>();
		TarjetaDeCredito pruebaTar2 = new TarjetaDeCredito("23462t", 4342, 1000, 0);
		tarjetas.add(pruebaTar2);
		Cuenta pruebaCuenta1 = new Cuenta("2342342b", 3000, 1000, 2010, tarjetas);
		
		assertEquals("2342342b", pruebaCuenta1.getIdCuenta());
		assertEquals(3000, pruebaCuenta1.getSaldo());
		assertEquals(1000, pruebaCuenta1.getLimiteRetirada());
		assertEquals(2010, pruebaCuenta1.getFechaDeApertura());
		assertEquals(tarjetas, pruebaCuenta1.getTarjeta());
		assertEquals(2500, pruebaCuenta1.pagarConTarjeta(500));
		assertEquals(0, pruebaCuenta1.verCantidadDePagos());
		assertEquals(10, pruebaCuenta1.verSaldoMedio(120));
		assertEquals(2700, pruebaCuenta1.ingresarDinero(200));
		assertEquals(2000, pruebaCuenta1.retirarDinero(700));
		
		Cuenta pruebaCuenta2 = new Cuenta("262342t", 1000, 50, 2008, tarjetas);
		TarjetaDeCredito pruebaTar3 = new TarjetaDeCredito("9023h", 200, 100, 0);
		tarjetas.add(pruebaTar3);
		assertEquals(1000, pruebaCuenta2.pagarConTarjeta(3000));//Se queda con el mismo saldo porque el límite de pago es menor que el pago a realizar.
		assertEquals(1000, pruebaCuenta2.retirarDinero(2000));//Se queda con el mismo saldo porque el límite de retirada es menor que la cantidad a retirar..
	}
}

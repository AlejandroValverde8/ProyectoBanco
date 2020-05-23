import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class pruebaTarjetaDeCredito {
	@Test
	void test() {
		TarjetaDeCredito pruebaTar = new TarjetaDeCredito("234234m", 2000, 1000, 0);
		assertEquals("234234m", pruebaTar.getIdTarjeta());
		assertEquals(2000, pruebaTar.getLimiteRetirada());
		assertEquals(1000, pruebaTar.getLimitePago());
		assertEquals(0, pruebaTar.getPago());
		assertEquals(1, pruebaTar.pagos());
		
	}
}

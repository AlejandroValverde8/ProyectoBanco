import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
/**
 * Esta clase nos va a servir paracontener las pruebas de la clase "TarjetaDeCredito"
 * @author alejandro
 *
 */
public class pruebaTarjetaDeCredito {
	@Test
	/**
	 * Este m�todo comprobar� que los m�todos de la clase "TarjetaDeCredito" funcionan correctamente.
	 * Para ello crearemos un objeto TarjetaDeCredito y haremos pruebas sobre �l.
	 */
	void test() {
		TarjetaDeCredito pruebaTar = new TarjetaDeCredito("234234m", 2000, 1000, 0);
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "idtarjeta" con el get
		 */
		assertEquals("234234m", pruebaTar.getIdTarjeta());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "limiteRetirada" con el get
		 */
		assertEquals(2000, pruebaTar.getLimiteRetirada());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "l�mitePago" con el get
		 */
		assertEquals(1000, pruebaTar.getLimitePago());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "pago" con el get
		 */
		assertEquals(0, pruebaTar.getPago());
		/**
		 * Este m�todo sirve para probar que se contabiliza bien la cantidad de pagos. Como
		 * al probarlo lo estamos usando esperamos que se incremente en 1 la cantidad de pagos.
		 */
		assertEquals(1, pruebaTar.pagos());
		
	}
}

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
/**
 * En esta clase vamos a probar que funcionan bien los m�todos de la clase cuenta. Para ello crearemos un objeto cuenta
 * con un array list de tarjetas dentro con una tarjeta creada porque hay m�todos que lo precisan. Tambi�n crearermos otra
 * cuenta con otro array de tarjetas que tenga un limite de retirada menor que el dinero que pediremos en los pagos para
 * poder probar todas las opciones posibles. 
 * @author alejandro
 *
 */
public class pruebaCuenta {
	@Test
	/**
	 * En este m�todo implementaremos las pruebas para la clase cuenta.
	 */
	void test() {
		ArrayList<TarjetaDeCredito> tarjetas = new ArrayList<TarjetaDeCredito>();
		TarjetaDeCredito pruebaTar2 = new TarjetaDeCredito("23462t", 4342, 1000, 0);
		tarjetas.add(pruebaTar2);
		Cuenta pruebaCuenta1 = new Cuenta("2342342b", 3000, 1000, 2010, tarjetas);
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "idCuenta" con el get
		 */
		assertEquals("2342342b", pruebaCuenta1.getIdCuenta());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "saldo" con el get
		 */
		assertEquals(3000, pruebaCuenta1.getSaldo());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "limiteRetirada" con el get
		 */
		assertEquals(1000, pruebaCuenta1.getLimiteRetirada());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien la propiedad "fechaDeApertura" con el get
		 */
		assertEquals(2010, pruebaCuenta1.getFechaDeApertura());
		/**
		 * Este m�todo comprueba que se esta cogiendo bien el array list "tarjeta" con el get
		 */
		assertEquals(tarjetas, pruebaCuenta1.getTarjeta());
		/**
		 * Este m�todo comprueba que el m�todo "pagarConTarjeta" funciona bien
		 */
		assertEquals(2500, pruebaCuenta1.pagarConTarjeta(500));
		/**
		 * Este m�todo comprueba que "verCantidadDePagos" funciona bien, como aun no hay pagos
		 * devuelve 0
		 */
		assertEquals(0, pruebaCuenta1.verCantidadDePagos());
		/**
		 * Este m�todo es para comprobar que "verSaldoMedio" funciona correctamente.
		 */
		assertEquals(10, pruebaCuenta1.verSaldoMedio(120));
		/**
		 * Este m�todo es para comprobar que "ingresarDinero" funciona correctamente.
		 */
		assertEquals(2700, pruebaCuenta1.ingresarDinero(200));
		/**
		 * Este m�todo es para comprobar que "retirarDinero" funciona correctamente.
		 */
		assertEquals(2000, pruebaCuenta1.retirarDinero(700));
		
		Cuenta pruebaCuenta2 = new Cuenta("262342t", 1000, 50, 2008, tarjetas);
		TarjetaDeCredito pruebaTar3 = new TarjetaDeCredito("9023h", 200, 100, 0);
		tarjetas.add(pruebaTar3);
		/**
		 * Este m�todo ha sido utilizado para comprobar que no se realiza el pago con tarjeta en una cuenta que
		 * tenga una tarjeta asociada con un l�mite de pago menor que el pago a realizar. 
		 */
		assertEquals(1000, pruebaCuenta2.pagarConTarjeta(3000));//Se queda con el mismo saldo porque el l�mite de pago es menor que el pago a realizar.
		/**
		 * Este m�todo ha sido utilizado para comprobar que no retitra el dinero de una cuenta que
		 * un l�mite de retirada menor que la cantidad a retirar. 
		 */
		assertEquals(1000, pruebaCuenta2.retirarDinero(2000));//Se queda con el mismo saldo porque el l�mite de retirada es menor que la cantidad a retirar.
	}
}

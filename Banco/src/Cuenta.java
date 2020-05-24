import java.util.ArrayList;
/**
 * Esta clase nos va a servir para almacenar datos para cuentas que posteriormente
 * asignaremos a los clientes. Tiene también asignado un array list de tarjetas para
 * asociar una o mas tarjetas a una cuenta.
 * @author alejandro
 * version 1.0.0
 */
public class Cuenta {
	private String idCuenta;
	private int saldo;
	private int limiteRetirada;
	private int fechaDeApertura;
	private ArrayList<TarjetaDeCredito>tarjetas;
	
	public Cuenta(String idCuenta, int saldo, int limiteRetirada, int fechaDeApertura,
			ArrayList<TarjetaDeCredito> tarjetas) {
		this.idCuenta = idCuenta;
		this.saldo = saldo;
		this.limiteRetirada = limiteRetirada;
		this.fechaDeApertura = fechaDeApertura;
		this.tarjetas = tarjetas;
	}
	/**
	 * Método get para obtener la propiedad "IdCuenta" en cualquier momento
	 * @return
	 */
	public String getIdCuenta() {
		return idCuenta;
	}
	/**
	 * Método set con el que establecemos que la variable "nombre" que usaremos guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param idCuenta
	 */
	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}
	/**
	 * Método get para obtener la propiedad "saldo" en cualquier momento
	 * @return
	 */
	public int getSaldo() {
		return saldo;
	}
	/**
	 * Método set con el que establecemos que la variable "saldo" que usaremos guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param saldo
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	/**
	 * Método get para obtener la propiedad "limiteRetirada" en cualquier momento
	 * @return
	 */
	public int getLimiteRetirada() {
		return limiteRetirada;
	}
	/**
	 * Método set con el que establecemos que la variable "limiteRetirada" que usaremos guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param limiteRetirada
	 */
	public void setLimiteRetirada(int limiteRetirada) {
		this.limiteRetirada = limiteRetirada;
	}
	/**
	 * Método get para obtener la propiedad "fechaDeApertura" en cualquier momento
	 * @return
	 */
	public int getFechaDeApertura() {
		return fechaDeApertura;
	}
	/**
	 * Método set con el que establecemos que la variable "fechaDeApertura" que usaremos guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param fechaDeApertura
	 */
	public void setFechaDeApertura(int fechaDeApertura) {
		this.fechaDeApertura = fechaDeApertura;
	}
	/**
	 * Método get para obtener el array "tarjetas" en cualquier momento
	 * @return
	 */
	public ArrayList<TarjetaDeCredito> getTarjeta() {
		return tarjetas;
	}
	/**
	 * Método set con el que establecemos que el array list "tarjetas" que usaremos guardará 
	 * lo mismo que el array list con el mismo nombre del objeto
	 * @param tarjeta
	 */
	public void setTarjeta(ArrayList<TarjetaDeCredito> tarjeta) {
		this.tarjetas = tarjeta;
	}
	
	/**
	 * Este método se encarga de realizar los pagos con la tarjeta asociada a la cuenta.
	 * No sin antes comprobar si el límite de pago con tarjeta es mayor que el pago a realizar.
	 * @param cantidadAPagar
	 * @return
	 */
	int pagarConTarjeta(int cantidadAPagar) {
		
		if (tarjetas.get(0).getLimitePago()>cantidadAPagar) {
			if(saldo>cantidadAPagar) {
				saldo-=cantidadAPagar;
			}
			else
				System.out.println("No hay saldo suficiente");
	}
		else 
			System.out.println("La cantidad a pagar supera el límite sel pago con tarjeta");
		return saldo;
		}
	/**
	 * Con este método podremos ver la cantidad de pagos que se ha realizado con una determinada tarjeta
	 * @return
	 */
	int verCantidadDePagos() {
		int pagosTarjeta = tarjetas.get(0).getPago();
		System.out.println("La cantidad de pagos con la tarjeta asociada a esta cuante ha sido de " + pagosTarjeta);
		return pagosTarjeta;
	}
	/**
	 * Con este método podemos ver la media de saldo en los ultimos 12 meses si le pasamos
	 * el total de saldo
	 * @param saldoTot12meses
	 * @return
	 */
	int verSaldoMedio(int saldoTot12meses) {
		int saldoMedio;
		saldoMedio = saldoTot12meses/12;
		System.out.println("El saldo medio de los últimos 12 meses es " + saldoMedio);
		return saldoMedio;
		}
	/**
	 * Este método sirve para incrementar dinero en nuestra cuenta, siempre y cuando haya dinero en ésta.
	 * @param dineroIgresado
	 * @return
	 */
	int ingresarDinero(int dineroIgresado) {
		if(saldo>0) 
			saldo += dineroIgresado;
		return saldo;
	}
	/**
	 * Este método sirve para retirar dinero en nuestra cuenta siempre y cuando haya dinero en ésta,
	 * @param dineroSacado
	 * @return
	 */
	int retirarDinero(int dineroSacado) {
		if(limiteRetirada>dineroSacado) {
			if(saldo>0) 
				saldo -= dineroSacado;
		}else 
			System.out.println("La cantidad a retirar supera el límite de retirada en esta cuenta");
			return saldo;
	}
}

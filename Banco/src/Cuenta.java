import java.util.ArrayList;
/**
 * Esta clase nos va a servir para almacenar datos para cuentas que posteriormente
 * asignaremos a los clientes. Tiene tambi�n asignado un array list de tarjetas para
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
	 * M�todo get para obtener la propiedad "IdCuenta" en cualquier momento
	 * @return
	 */
	public String getIdCuenta() {
		return idCuenta;
	}
	/**
	 * M�todo set con el que establecemos que la variable "idCuenta" que usaremos guardar� 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param idCuenta
	 */
	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}
	/**
	 * M�todo get para obtener la propiedad "saldo" en cualquier momento
	 * @return
	 */
	public int getSaldo() {
		return saldo;
	}
	/**
	 * M�todo set con el que establecemos que la variable "saldo" que usaremos guardar� 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param saldo
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	/**
	 * M�todo get para obtener la propiedad "limiteRetirada" en cualquier momento
	 * @return
	 */
	public int getLimiteRetirada() {
		return limiteRetirada;
	}
	/**
	 * M�todo set con el que establecemos que la variable "limiteRetirada" que usaremos guardar� 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param limiteRetirada
	 */
	public void setLimiteRetirada(int limiteRetirada) {
		this.limiteRetirada = limiteRetirada;
	}
	/**
	 * M�todo get para obtener la propiedad "fechaDeApertura" en cualquier momento
	 * @return
	 */
	public int getFechaDeApertura() {
		return fechaDeApertura;
	}
	/**
	 * M�todo set con el que establecemos que la variable "fechaDeApertura" que usaremos guardar� 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param fechaDeApertura
	 */
	public void setFechaDeApertura(int fechaDeApertura) {
		this.fechaDeApertura = fechaDeApertura;
	}
	/**
	 * M�todo get para obtener el array "tarjetas" en cualquier momento
	 * @return
	 */
	public ArrayList<TarjetaDeCredito> getTarjeta() {
		return tarjetas;
	}
	/**
	 * M�todo set con el que establecemos que el array list "tarjetas" que usaremos guardar� 
	 * lo mismo que el array list con el mismo nombre del objeto
	 * @param tarjeta
	 */
	public void setTarjeta(ArrayList<TarjetaDeCredito> tarjeta) {
		this.tarjetas = tarjeta;
	}
	
	/**
	 * Este m�todo se encarga de realizar los pagos con la tarjeta asociada a la cuenta.
	 * No sin antes comprobar si el l�mite de pago con tarjeta es mayor que el pago a realizar, 
	 * para ello accede a la propiedad "limitePago" de un objeto "tarjetaDeCredito" que haya en
	 * el array list "tarjetas".
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
			System.out.println("La cantidad a pagar supera el l�mite sel pago con tarjeta");
		return saldo;
		}
	/**
	 * Con este m�todo podremos ver la cantidad de pagos que se ha realizado con una determinada tarjeta.
	 * Como vemos se accede a la propiedad "Pago" del objeto "TarjetaDeCredito" que se asocie a esta cuenta.
	 * @return
	 */
	int verCantidadDePagos() {
		int pagosTarjeta = tarjetas.get(0).getPago();
		System.out.println("La cantidad de pagos con la tarjeta asociada a esta cuante ha sido de " + pagosTarjeta);
		return pagosTarjeta;
	}
	/**
	 * Con este m�todo podemos ver la media de saldo en los ultimos 12 meses si le pasamos
	 * el total de saldo
	 * @param saldoTot12meses
	 * @return
	 */
	int verSaldoMedio(int saldoTot12meses) {
		int saldoMedio;
		saldoMedio = saldoTot12meses/12;
		System.out.println("El saldo medio de los �ltimos 12 meses es " + saldoMedio);
		return saldoMedio;
		}
	/**
	 * Este m�todo sirve para incrementar dinero en nuestra cuenta, siempre y cuando haya dinero en �sta.
	 * @param dineroIgresado
	 * @return
	 */
	int ingresarDinero(int dineroIgresado) {
		if(saldo>0) 
			saldo += dineroIgresado;
		return saldo;
	}
	/**
	 * Este m�todo sirve para retirar dinero en nuestra cuenta siempre y cuando haya dinero en �sta,
	 * @param dineroSacado
	 * @return
	 */
	int retirarDinero(int dineroSacado) {
		if(limiteRetirada>dineroSacado) {
			if(saldo>0) 
				saldo -= dineroSacado;
		}else 
			System.out.println("La cantidad a retirar supera el l�mite de retirada en esta cuenta");
			return saldo;
	}
}

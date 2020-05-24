/**
 * Esta clase nos va a servir paradar de alta tarjetas de crédito asociadas a una cuenta.
 * @author alejandro
 *
 */
public class TarjetaDeCredito {
	private String idTarjeta;
	private int limiteRetirada;
	private int limitePago;
	private int pago;
	
	public TarjetaDeCredito(String idTarjeta, int limiteRetirada, int limitePago, int pago) {
		this.idTarjeta = idTarjeta;
		this.limiteRetirada = limiteRetirada;
		this.limitePago = limitePago;
		this.pago = pago;
	}
	/**
	 * Método get para obtener la propiedad "IdTarjeta" en cualquier momento
	 * @return
	 */
	public String getIdTarjeta() {
		return idTarjeta;
	}
	/**
	 * Método set con el que establecemos que la variable "idTarjeta" que usaremos guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param idTarjeta
	 */
	public void setIdTarjeta(String idTarjeta) {
		this.idTarjeta = idTarjeta;
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
	 * Método get para obtener la propiedad "limitePago" en cualquier momento
	 * @return
	 */
	public int getLimitePago() {
		return limitePago;
	}
	/**
	 * Método set con el que establecemos que la variable "limitePago" que usaremos guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param limitePago
	 */
	public void setLimitePago(int limitePago) {
		this.limitePago = limitePago;
	}
	
	/**
	 * Método get para obtener la propiedad "Pago" en cualquier momento
	 * @return
	 */
	public int getPago() {
		return pago;
	}
	/**
	 * Método set con el que establecemos que la variable "Pago" que usaremos guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param pago
	 */
	public void setPago(int pago) {
		this.pago = pago;
	}
	/**
	 * Este método nos servirá para contabilizar las veces que se ha pagado con esta tarjeta.
	 * @return
	 */
	int pagos() {
		pago+=1;
		return pago;
	}
}

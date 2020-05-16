
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

	public String getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(String idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public int getLimiteRetirada() {
		return limiteRetirada;
	}

	public void setLimiteRetirada(int limiteRetirada) {
		this.limiteRetirada = limiteRetirada;
	}

	public int getLimitePago() {
		return limitePago;
	}

	public void setLimitePago(int limitePago) {
		this.limitePago = limitePago;
	}
	
	
	public int getPago() {
		return pago;
	}

	public void setPago(int pago) {
		this.pago = pago;
	}

	int pagos() {
		pago+=1;
		return pago;
	}
}


public class TarjetaDeCredito {
	private String idTarjeta;
	private int limiteRetirada;
	private int limitePago;
	
	public TarjetaDeCredito(String idTarjeta, int limiteRetirada, int limitePago) {
		this.idTarjeta = idTarjeta;
		this.limiteRetirada = limiteRetirada;
		this.limitePago = limitePago;
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
	

}

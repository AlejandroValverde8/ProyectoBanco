import java.util.ArrayList;

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

	public String getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getLimiteRetirada() {
		return limiteRetirada;
	}

	public void setLimiteRetirada(int limiteRetirada) {
		this.limiteRetirada = limiteRetirada;
	}

	public int getFechaDeApertura() {
		return fechaDeApertura;
	}

	public void setFechaDeApertura(int fechaDeApertura) {
		this.fechaDeApertura = fechaDeApertura;
	}

	public ArrayList<TarjetaDeCredito> getTarjeta() {
		return tarjetas;
	}

	public void setTarjeta(ArrayList<TarjetaDeCredito> tarjeta) {
		this.tarjetas = tarjeta;
	}
	
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
}

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
	void verCantidadDePagos() {
		System.out.println("La cantidad de pagos con la tarjeta asociada a esta cuante ha sido de " + tarjetas.get(0).getPago());
	}
	
	void verSaldoMedio() {
		int [] meses = new int[12];
		int saldoMedio = meses[1]+meses[2]+meses[3]+meses[4]+meses[5]+meses[6]+meses[7]+meses[8]+meses[9]+meses[10]+meses[11]+meses[12]/12;
		
		System.out.println("El saldo medio en los últimos 12 meses es " + saldoMedio);	
		}

}

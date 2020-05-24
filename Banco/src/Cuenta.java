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
	int verCantidadDePagos() {
		int pagosTarjeta = tarjetas.get(0).getPago();
		System.out.println("La cantidad de pagos con la tarjeta asociada a esta cuante ha sido de " + pagosTarjeta);
		return pagosTarjeta;
	}
	
	int verSaldoMedio(int saldoTot12meses) {
		int saldoMedio;
		saldoMedio = saldoTot12meses/12;
		System.out.println("El saldo medio de los últimos 12 meses es " + saldoMedio);
		return saldoMedio;
		}
	
	int ingresarDinero(int dineroIgresado) {
		if(saldo>0) 
			saldo += dineroIgresado;
		return saldo;
	}
	
	int retirarDinero(int dineroSacado) {
		if(limiteRetirada>dineroSacado) {
			if(saldo>0) 
				saldo -= dineroSacado;
		}else 
			System.out.println("La cantidad a retirar supera el límite de retirada en esta cuenta");
			return saldo;
	}
}

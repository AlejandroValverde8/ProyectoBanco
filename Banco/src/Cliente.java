import java.util.ArrayList;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String apellido2;
	private String direccion;
	private String nif;
	private int telefono;
	private int edad;
	ArrayList<Cuenta> cuentas;
	
	public Cliente(String nombre, String apellido, String apellido2, String direccion, String nif, int telefono,
			int edad, ArrayList<Cuenta> cuentas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.nif = nif;
		this.telefono = telefono;
		this.edad = edad;
		this.cuentas = cuentas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
}

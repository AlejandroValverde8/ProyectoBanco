import java.util.ArrayList;

/**
 * Esta clase nos va a servir para almacenar clientes con su información personal
 * además de la o las cuentas que tengan asociadas.  
 * @author alejandro
 * version 1.0.0
 */
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
	/**
	 * Método get para obtener la propiedad "nombre" en cualquier momento
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método set con el que establecemos que la variable "nombre" que usaremos guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método get para obtener la propiedad "apellido" en cualquier momento
	 * @return 
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * Método set con el que establecemos que la variable "apellido" guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * Método get para obtener la propiedad "Apellido2" en cualquier momento
	 * @return 
	 */
	public String getApellido2() {
		return apellido2;
	}
	/**
	 * Método set con el que establecemos que la variable "Apellido2" guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param apellido2
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	/**
	 * Método get para obtener la propiedad "Dirección" en cualquier momento
	 * @return 
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * Método set con el que establecemos que la variable "Direccion" guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * Método get para obtener la propiedad "NIF" en cualquier momento
	 * @return 
	 */
	public String getNif() {
		return nif;
	}
	/**
	 * Método set con el que establecemos que la variable "NIF" guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param nif
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}
	/**
	 * Método get para obtener la propiedad "Telefono" en cualquier momento
	 * @return 
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * Método set con el que establecemos que la variable "Telefono" guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param telefono
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/**
	 * Método get para obtener la propiedad "Edad" en cualquier momento
	 * @return 
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Método set con el que establecemos que la variable "Edad" guardará 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Método get para acceder al array list de cuentas
	 * @return 
	 */
	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}
	/**
	 * Método para establecer el array list "cuentas" que usemos como propiedad de clase
	 * @param cuentas
	 */
	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
}

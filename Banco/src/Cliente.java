import java.util.ArrayList;

/**
 * Esta clase nos va a servir para almacenar clientes con su informaci�n personal
 * adem�s de la o las cuentas que tengan asociadas.  
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
	 * M�todo get para obtener la propiedad "nombre" en cualquier momento
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * M�todo set con el que establecemos que la variable "nombre" que usaremos guardar� 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * M�todo get para obtener la propiedad "apellido" en cualquier momento
	 * @return 
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * M�todo set con el que establecemos que la variable "apellido" guardar� 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * M�todo get para obtener la propiedad "Apellido2" en cualquier momento
	 * @return 
	 */
	public String getApellido2() {
		return apellido2;
	}
	/**
	 * M�todo set con el que establecemos que la variable "Apellido2" guardar� 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param apellido
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	/**
	 * M�todo get para obtener la propiedad "Direcci�n" en cualquier momento
	 * @return 
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * M�todo set con el que establecemos que la variable "Direccion" guardar� 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param apellido
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * M�todo get para obtener la propiedad "NIF" en cualquier momento
	 * @return 
	 */
	public String getNif() {
		return nif;
	}
	/**
	 * M�todo set con el que establecemos que la variable "NIF" guardar� 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param apellido
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}
	/**
	 * M�todo get para obtener la propiedad "Telefono" en cualquier momento
	 * @return 
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * M�todo set con el que establecemos que la variable "Telefono" guardar� 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param apellido
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/**
	 * M�todo get para obtener la propiedad "Edad" en cualquier momento
	 * @return 
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * M�todo set con el que establecemos que la variable "Edad" guardar� 
	 * lo mismo que la propiedad con el mismo nombre del objeto
	 * @param apellido
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * M�todo get para acceder al array list de cuentas
	 * @return 
	 */
	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}
	/**
	 * M�todo para establecer el array list "cuentas" que usemos como propiedad de clase
	 * @param cuentas
	 */
	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
}

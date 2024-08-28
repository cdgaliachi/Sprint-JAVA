package sprint;

/**
 * La clase Cliente representa un cliente en el sistema, heredando de la clase Usuario.
 * Esta clase contiene información específica del cliente, como su RUT, nombres, apellidos, 
 * teléfono, AFP, sistema de salud, dirección, comuna y edad.
 * 
 * @version 1.0
 */
public class Cliente extends Usuario {
	private int rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;

	

	/**
	 * Constructor por defecto de la clase Cliente.
	 */
	
	public Cliente() {
		super();
	}

	
	/**
	 * Constructor que permite inicializar un objeto Cliente con valores específicos.
	 * 
	 * @param nombre        Nombre del cliente.
	 * @param fechaNacimiento Fecha de nacimiento del cliente.
	 * @param run           RUN del cliente.
	 * @param rut           RUT del cliente.
	 * @param nombres       Nombres del cliente.
	 * @param apellidos     Apellidos del cliente.
	 * @param telefono      Teléfono del cliente.
	 * @param afp           AFP del cliente.
	 * @param sistemaSalud  Sistema de salud del cliente (1 para Fonasa, 2 para Isapre).
	 * @param direccion     Dirección del cliente.
	 * @param comuna        Comuna del cliente.
	 * @param edad          Edad del cliente.
	 */
	
	public Cliente(String nombre, String fechaNacimiento, int run, int rut, String nombres, String apellidos,
			String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
		super(nombre, fechaNacimiento, run);
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	// Getters y setters

	
	/**
	 * Obtiene el RUT del cliente.
	 * 
	 * @return RUT del cliente.
	 */
	
	public int getRut() {
		return rut;
	}

	
	/**
	 * Establece el RUT del cliente.
	 * 
	 * @param rut El RUT a establecer.
	 */
	
	public void setRut(int rut) {
		this.rut = rut;
	}

	
	/**
	 * Obtiene los nombres del cliente.
	 * 
	 * @return Los nombres del cliente.
	 */
	
	public String getNombres() {
		return nombres;
	}

	
	/**
	 * Establece los nombres del cliente.
	 * 
	 * @param nombres Los nombres a establecer.
	 */
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	
	/**
	 * Obtiene los apellidos del cliente.
	 * 
	 * @return Los apellidos del cliente.
	 */
	
	
	public String getApellidos() {
		return apellidos;
	}

	
	/**
	 * Establece los apellidos del cliente.
	 * 
	 * @param apellidos Los apellidos a establecer.
	 */
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Obtiene el teléfono del cliente.
	 * 
	 * @return El teléfono del cliente.
	 */
	
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Establece el teléfono del cliente.
	 * 
	 * @param telefono El teléfono a establecer.
	 */
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Obtiene la AFP del cliente.
	 * 
	 * @return La AFP del cliente.
	 */
	
	public String getAfp() {
		return afp;
	}
	/**
	 * Establece la AFP del cliente.
	 * 
	 * @param afp La AFP a establecer.
	 */
	
	public void setAfp(String afp) {
		this.afp = afp;
	}

	/**
	 * Obtiene el sistema de salud del cliente.
	 * 
	 * @return El sistema de salud del cliente (1 para Fonasa, 2 para Isapre).
	 */
	
	public int getSistemaSalud() {
		return sistemaSalud;
	}

	/**
	 * Establece el sistema de salud del cliente.
	 * 
	 * @param sistemaSalud El sistema de salud a establecer (1 para Fonasa, 2 para Isapre).
	 */
	
	
	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	/**
	 * Obtiene la dirección del cliente.
	 * 
	 * @return La dirección del cliente.
	 */
	
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Establece la dirección del cliente.
	 * 
	 * @param direccion La dirección a establecer.
	 */
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Obtiene la comuna del cliente.
	 * 
	 * @return La comuna del cliente.
	 */
	
	public String getComuna() {
		return comuna;
	}

	/**
	 * Establece la comuna del cliente.
	 * 
	 * @param comuna La comuna a establecer.
	 */
	
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	/**
	 * Obtiene la edad del cliente.
	 * 
	 * @return La edad del cliente.
	 */
	
	public int getEdad() {
		return edad;
	}

	/**
	 * Establece la edad del cliente.
	 * 
	 * @param edad La edad a establecer.
	 */
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	/**
	 * Obtiene el nombre completo del cliente (nombres y apellidos).
	 * 
	 * @return El nombre completo del cliente.
	 */
	
	// Metodo obtenerNombre()
	public String obtenerNombre() {
		return this.nombres + " " + this.apellidos;
	}

	/**
	 * Obtiene el sistema de salud del cliente en formato de texto.
	 * 
	 * @return "Fonasa" si el sistema de salud es 1, "Isapre" si es 2.
	 */
	
	// Metodo obtenerSistemaSalud
	public String obtenerSistemaSalud() {
		return this.sistemaSalud == 1 ? "Fonasa" : "Isapre";
	}

	
	/**
	 * Analiza y muestra la información del usuario y del cliente.
	 * Muestra la dirección y comuna del cliente.
	 */
	
	// Metodo analizarUsuario
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Dirección: " + this.direccion + ", Comuna: " + this.comuna);
	}

	
	/**
	 * Retorna una representación en cadena de texto del cliente.
	 * 
	 * @return Una cadena que representa al cliente.
	 */
	
	// Metodo toString
	@Override
	public String toString() {
		return "Cliente [apellidos=" + apellidos + ", telefono=" + telefono + ", afp=" + afp + ", sistemaSalud="
				+ sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad + ", nombre="
				+ this.getNombre() + ", run=" + this.getRun() + "]";
	}

	
	/**
	 * Valida el RUT del cliente.
	 * 
	 * @param rut El RUT a validar.
	 * @return true si el RUT es válido, false en caso contrario.
	 */
	
	// Métodos de validación de datos del Cliente

	public boolean validarRut(int rut) {
		return rut > 0 && rut <= 99999999;
	}

	/**
	 * Valida los nombres del cliente.
	 * 
	 * @param nombres Los nombres a validar.
	 * @return true si los nombres son válidos, false en caso contrario.
	 */
	public boolean validarNombres(String nombres) {
		return nombres.length() > 5 && nombres.length() < 30;
	}

	/**
	 * Valida los apellidos del cliente.
	 * 
	 * @param apellidos Los apellidos a validar.
	 * @return true si los apellidos son válidos, false en caso contrario.
	 */
	
	public boolean validarApellidos(String apellidos) {
		return apellidos.length() > 5 && apellidos.length() < 30;
	}
	
	/**
	 * Valida el teléfono del cliente.
	 * 
	 * @param telefono El teléfono a validar.
	 * @return true si el teléfono es válido, false en caso contrario.
	 */
	
	public boolean validarTelefono(String telefono) {
		return telefono.length() > 0;
	}
	
	/**
	 * Valida la AFP del cliente.
	 * 
	 * @param afp La AFP a validar.
	 * @return true si la AFP es válida, false en caso contrario.
	 */
	
	public boolean validarAfp(String afp) {
		return afp.length() > 4 && afp.length() < 30;
	}

	/**
	 * Valida el sistema de salud del cliente.
	 * 
	 * @param sistemaSalud El sistema de salud a validar.
	 * @return true si el sistema de salud es válido (1 o 2), false en caso contrario.
	 */
	public boolean validarSistemaSalud(int sistemaSalud) {
		return sistemaSalud == 1 || sistemaSalud == 2;
	}
	
	/**
	 * Valida la dirección del cliente.
	 * 
	 * @param direccion La dirección a validar.
	 * @return true si la dirección es válida, false en caso contrario.
	 */
	
	public boolean validarDireccion(String direccion) {
		return direccion.length() < 70;
	}
	/**
	 * Valida la comuna del cliente.
	 * 
	 * @param comuna La comuna a validar.
	 * @return true si la comuna es válida, false en caso contrario.
	 */
	public boolean validarComuna(String comuna) {
		return comuna.length() < 50;
	}
	
	/**
	 * Valida la edad del cliente.
	 * 
	 * @param edad La edad a validar.
	 * @return true si la edad es válida (entre 0 y 150 años), false en caso contrario.
	 */
	public boolean validarEdad(int edad) {
		return edad >= 0 && edad < 150;
	}
	
}
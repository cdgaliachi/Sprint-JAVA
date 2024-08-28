package sprint;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Representa un usuario en el sistema.
 * Implementa la interfaz Asesoria.
 */
public class Usuario implements Asesoria {
	private String nombre;
	private String fechaNacimiento;
	private int run;
	/**
	 * Constructor por defecto para la clase Usuario.
	 */
	public Usuario() {
		super();
	}
	/**
	 * Constructor que inicializa un usuario con los valores especificados.
	 *
	 * @param nombre          el nombre del usuario
	 * @param fechaNacimiento la fecha de nacimiento del usuario en formato dd/MM/yyyy
	 * @param run             el RUN del usuario
	 */
	public Usuario(String nombre, String fechaNacimiento, int run) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}
	/**
	 * Obtiene el nombre del usuario.
	 *
	 * @return el nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Establece el nombre del usuario.
	 *
	 * @param nombre el nuevo nombre del usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Obtiene la fecha de nacimiento del usuario.
	 *
	 * @return la fecha de nacimiento del usuario
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * Establece la fecha de nacimiento del usuario.
	 *
	 * @param fechaNacimiento la nueva fecha de nacimiento del usuario
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * Obtiene el RUN del usuario.
	 *
	 * @return el RUN del usuario
	 */
	public int getRun() {
		return run;
	}
	/**
	 * Establece el RUN del usuario.
	 *
	 * @param run el nuevo RUN del usuario
	 */
	public void setRun(int run) {
		this.run = run;
	}
	/**
	 * Calcula y muestra la edad del usuario basado en su fecha de nacimiento.
	 *
	 * @return una cadena que indica la edad del usuario
	 */
	public String mostrarEdad() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthDate = LocalDate.parse(this.fechaNacimiento, formatter);
		LocalDate currentDate = LocalDate.now();
		int age = currentDate.getYear() - birthDate.getYear();
		return "El usuario tiene " + age + " años";
	}
	/**
	 * Analiza y muestra la información del usuario.
	 * Implementación del método definido en la interfaz Asesoria.
	 */
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre: " + this.nombre + ", RUN: " + this.run);
	}
	/**
	 * Devuelve una representación en forma de cadena del usuario.
	 *
	 * @return una cadena que representa al usuario
	 */
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
	}
	// Métodos de validación de datos del Usuario
	/**
	 * Valida si el nombre del usuario tiene una longitud entre 10 y 50 caracteres.
	 *
	 * @param nombre el nombre a validar
	 * @return true si el nombre es válido, false en caso contrario
	 */
	public boolean validarNombre(String nombre) {
		return nombre.length() > 10 && nombre.length() < 50;
	}
	/**
	 * Valida si la fecha de nacimiento está en un formato válido (dd/MM/yyyy).
	 *
	 * @param fechaNacimiento la fecha de nacimiento a validar
	 * @return true si la fecha es válida, false en caso contrario
	 */
	public boolean validarFechaNacimiento(String fechaNacimiento) {
		String[] splitDate = fechaNacimiento.split("/");
		return splitDate.length == 3;
	}
	/**
	 * Valida si el RUN del usuario es un valor positivo menor o igual a 99,999,999.
	 *
	 * @param run el RUN a validar
	 * @return true si el RUN es válido, false en caso contrario
	 */
	public boolean validarRun(int run) {
		return run > 0 && run <= 99999999;
	}
}








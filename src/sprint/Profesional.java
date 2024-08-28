package sprint;

/**
 * La clase Profesional representa un profesional en el sistema, heredando de la clase Usuario.
 * Esta clase contiene información específica del profesional, como su título y fecha de ingreso.
 * 
 * @version 1.0
 */
public class Profesional extends Usuario {
	private String titulo;
	private String fechaIngreso;

	/**
	 * Constructor por defecto de la clase Profesional.
	 */
	public Profesional() {
		super();
	}

	/**
	 * Constructor que permite inicializar un objeto Profesional con valores específicos.
	 * 
	 * @param nombre        Nombre del profesional.
	 * @param fechaNacimiento Fecha de nacimiento del profesional.
	 * @param run           RUN del profesional.
	 * @param titulo        Título del profesional.
	 * @param fechaIngreso  Fecha de ingreso del profesional.
	 */
	public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * Obtiene el título del profesional.
	 * 
	 * @return El título del profesional.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Establece el título del profesional.
	 * 
	 * @param titulo El título a establecer.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Obtiene la fecha de ingreso del profesional.
	 * 
	 * @return La fecha de ingreso del profesional.
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * Establece la fecha de ingreso del profesional.
	 * 
	 * @param fechaIngreso La fecha de ingreso a establecer.
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * Analiza y muestra la información del usuario y del profesional.
	 * Muestra el título y la fecha de ingreso del profesional.
	 */
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título: " + this.titulo + ", Fecha de ingreso: " + this.fechaIngreso);
	}

	/**
	 * Retorna una representación en cadena de texto del profesional.
	 * 
	 * @return Una cadena que representa al profesional.
	 */
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + ", nombre=" + this.getNombre()
				+ ", run=" + this.getRun() + "]";
	}

	/**
	 * Valida el título del profesional.
	 * 
	 * @param titulo El título a validar.
	 * @return true si el título es válido, false en caso contrario.
	 */
	public boolean validarTitulo(String titulo) {
		return titulo.length() > 5 && titulo.length() < 50;
	}

	/**
	 * Valida la fecha de ingreso del profesional.
	 * 
	 * @param fechaIngreso La fecha de ingreso a validar.
	 * @return true si la fecha de ingreso tiene un formato válido (día/mes/año), false en caso contrario.
	 */
	public boolean validarFechaIngreso(String fechaIngreso) {
		String[] splitDate = fechaIngreso.split("/");
		return splitDate.length == 3;
	}
}

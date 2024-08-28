package sprint;

/**
 * La clase Administrativo representa a un usuario que pertenece al área administrativa de la organización.
 * Extiende la clase Usuario y agrega propiedades específicas como el área de trabajo y la experiencia previa.
 */
public class Administrativo extends Usuario {
	private String area;
	private String experienciaPrevia;

	/**
	 * Constructor por defecto que inicializa un objeto Administrativo sin parámetros.
	 */
	public Administrativo() {
		super();
	}

	/**
	 * Constructor que inicializa un objeto Administrativo con los valores proporcionados.
	 *
	 * @param nombre             El nombre del usuario.
	 * @param fechaNacimiento    La fecha de nacimiento del usuario.
	 * @param run                El RUN del usuario.
	 * @param area               El área en la que trabaja el administrativo.
	 * @param experienciaPrevia  La experiencia previa del administrativo.
	 */
	public Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	/**
	 * Obtiene el área de trabajo del administrativo.
	 *
	 * @return El área de trabajo.
	 */
	public String getArea() {
		return area;
	}

	/**
	 * Establece el área de trabajo del administrativo.
	 *
	 * @param area El área de trabajo.
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * Obtiene la experiencia previa del administrativo.
	 *
	 * @return La experiencia previa.
	 */
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	/**
	 * Establece la experiencia previa del administrativo.
	 *
	 * @param experienciaPrevia La experiencia previa.
	 */
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	/**
	 * Analiza y muestra la información del usuario administrativo, incluyendo su área y experiencia previa.
	 */
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Área: " + this.area + ", Experiencia previa: " + this.experienciaPrevia);
	}

	/**
	 * Retorna una representación en forma de cadena de texto del objeto Administrativo.
	 *
	 * @return Una cadena de texto con la información del administrativo.
	 */
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + ", nombre="
				+ this.getNombre() + ", run=" + this.getRun() + "]";
	}

	// Métodos de validación de datos del Administrativo

	/**
	 * Valida que el área proporcionada cumpla con la longitud permitida.
	 *
	 * @param area El área a validar.
	 * @return true si el área tiene una longitud entre 5 y 20 caracteres, false en caso contrario.
	 */
	public boolean validarArea(String area) {
		return area.length() >= 5 && area.length() <= 20;
	}

	/**
	 * Valida que la experiencia previa proporcionada cumpla con la longitud permitida.
	 *
	 * @param experienciaPrevia La experiencia previa a validar.
	 * @return true si la experiencia previa tiene una longitud de hasta 100 caracteres, false en caso contrario.
	 */
	public boolean validarExperienciaPrevia(String experienciaPrevia) {
		return experienciaPrevia.length() <= 100;
	}
}

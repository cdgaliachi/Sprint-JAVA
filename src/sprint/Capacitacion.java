package sprint;

/**
 * La clase Capacitacion representa una capacitación ofrecida a un cliente, 
 * incluyendo detalles como la fecha, hora, lugar, duración y la cantidad de asistentes.
 */
public class Capacitacion {
	private int identificador;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadAsistentes;

	/**
	 * Constructor por defecto que crea una nueva instancia de Capacitacion.
	 */
	public Capacitacion() {
	}

	/**
	 * Constructor que inicializa una instancia de Capacitacion con los valores proporcionados.
	 *
	 * @param identificador      El identificador único de la capacitación.
	 * @param rutCliente         El RUT del cliente asociado a la capacitación.
	 * @param dia                El día en que se realizará la capacitación.
	 * @param hora               La hora a la que se realizará la capacitación.
	 * @param lugar              El lugar donde se realizará la capacitación.
	 * @param duracion           La duración de la capacitación en minutos.
	 * @param cantidadAsistentes La cantidad de asistentes esperados.
	 */
	public Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, String duracion,
			int cantidadAsistentes) {
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	// Getters y setters

	/**
	 * Obtiene el identificador de la capacitación.
	 *
	 * @return El identificador de la capacitación.
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * Establece el identificador de la capacitación.
	 *
	 * @param identificador El identificador de la capacitación.
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * Obtiene el RUT del cliente asociado a la capacitación.
	 *
	 * @return El RUT del cliente.
	 */
	public int getRutCliente() {
		return rutCliente;
	}

	/**
	 * Establece el RUT del cliente asociado a la capacitación.
	 *
	 * @param rutCliente El RUT del cliente.
	 */
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	/**
	 * Obtiene el día en que se realizará la capacitación.
	 *
	 * @return El día de la capacitación.
	 */
	public String getDia() {
		return dia;
	}

	/**
	 * Establece el día en que se realizará la capacitación.
	 *
	 * @param dia El día de la capacitación.
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}

	/**
	 * Obtiene la hora a la que se realizará la capacitación.
	 *
	 * @return La hora de la capacitación.
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * Establece la hora a la que se realizará la capacitación.
	 *
	 * @param hora La hora de la capacitación.
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * Obtiene el lugar donde se realizará la capacitación.
	 *
	 * @return El lugar de la capacitación.
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * Establece el lugar donde se realizará la capacitación.
	 *
	 * @param lugar El lugar de la capacitación.
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * Obtiene la duración de la capacitación.
	 *
	 * @return La duración de la capacitación.
	 */
	public String getDuracion() {
		return duracion;
	}

	/**
	 * Establece la duración de la capacitación.
	 *
	 * @param duracion La duración de la capacitación.
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	/**
	 * Obtiene la cantidad de asistentes a la capacitación.
	 *
	 * @return La cantidad de asistentes.
	 */
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	/**
	 * Establece la cantidad de asistentes a la capacitación.
	 *
	 * @param cantidadAsistentes La cantidad de asistentes.
	 */
	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	/**
	 * Muestra un detalle de la capacitación, incluyendo el lugar, hora, día y duración.
	 *
	 * @return Un string con los detalles de la capacitación.
	 */
	public String mostrarDetalle() {
		return "La capacitación será en " + lugar + " a las " + hora + " del día " + dia + ", y durará " + duracion
				+ " minutos";
	}

	/**
	 * Retorna una representación en forma de cadena de texto del objeto Capacitacion.
	 *
	 * @return Una cadena de texto con la información de la capacitación.
	 */
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}

	// Métodos de validación de la Capacitacion
	
	/**
	 * Valida que el identificador de la capacitación sea mayor que 0.
	 *
	 * @param identificador El identificador a validar.
	 * @return true si el identificador es mayor que 0, false en caso contrario.
	 */
	public boolean validarIdentificador(int identificador) {
		return identificador > 0;
	}

	/**
	 * Valida que el RUT del cliente sea positivo y menor o igual a 99,999,999.
	 *
	 * @param rutCliente El RUT del cliente a validar.
	 * @return true si el RUT es válido, false en caso contrario.
	 */
	public boolean validarRutCliente(int rutCliente) {
		return rutCliente <= 99999999 && rutCliente > 0;
	}

	/**
	 * Valida que el día proporcionado sea uno de los días válidos de la semana.
	 *
	 * @param dia El día a validar.
	 * @return true si el día es válido, false en caso contrario.
	 */
	public boolean validarDia(String dia) {
		return dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miercoles") || dia.equals("Jueves")
				|| dia.equals("Viernes") || dia.equals("Sabado") || dia.equals("Domingo");
	}

	/**
	 * Valida que la hora proporcionada esté en el formato HH:mm y sea una hora válida.
	 *
	 * @param hora La hora a validar.
	 * @return true si la hora es válida, false en caso contrario.
	 */
	public boolean validarHora(String hora) {
		String[] splitHora = hora.split(":");
		return splitHora.length == 2 && Integer.parseInt(splitHora[0]) <= 23 && Integer.parseInt(splitHora[1]) <= 59;
	}

	/**
	 * Valida que el lugar tenga una longitud mayor a 10 caracteres y menor a 50 caracteres.
	 *
	 * @param lugar El lugar a validar.
	 * @return true si el lugar tiene una longitud válida, false en caso contrario.
	 */
	public boolean validarLugar(String lugar) {
		return lugar.length() > 10 && lugar.length() < 50;
	}

	/**
	 * Valida que la duración tenga una longitud máxima de 70 caracteres.
	 *
	 * @param duracion La duración a validar.
	 * @return true si la duración es válida, false en caso contrario.
	 */
	public boolean validarDuracion(String duracion) {
		return duracion.length() <= 70;
	}

	/**
	 * Valida que la cantidad de asistentes sea menor a 1000.
	 *
	 * @param cantidadAsistentes La cantidad de asistentes a validar.
	 * @return true si la cantidad es válida, false en caso contrario.
	 */
	public boolean validarCantidadAsistentes(int cantidadAsistentes) {
		return cantidadAsistentes < 1000;
	}
}

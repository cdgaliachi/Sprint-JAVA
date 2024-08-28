package sprint;
/**
 * Representa una visita en terreno realizada a un cliente.
 */
public class VisitaEnTerreno {
	private int idVisita;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;
	/**
	 * Constructor por defecto para la clase VisitaEnTerreno.
	 */
	public VisitaEnTerreno() {
	}
	
	/**
	 * Constructor que inicializa una visita en terreno con los valores especificados.
	 *
	 * @param idVisita    el ID de la visita
	 * @param rutCliente  el RUT del cliente
	 * @param dia         el día de la visita
	 * @param hora        la hora de la visita
	 * @param lugar       el lugar de la visita
	 * @param comentarios los comentarios sobre la visita
	 */
	
	public VisitaEnTerreno(int idVisita, int rutCliente, String dia, String hora, String lugar, String comentarios) {
		this.idVisita = idVisita;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}
	/**
	 * Obtiene el ID de la visita.
	 *
	 * @return el ID de la visita
	 */
	public int getIdVisita() {
		return idVisita;
	}
	/**
	 * Establece el ID de la visita.
	 *
	 * @param idVisita el nuevo ID de la visita
	 */
	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}
	/**
	 * Obtiene el RUT del cliente asociado a la visita.
	 *
	 * @return el RUT del cliente
	 */
	public int getRutCliente() {
		return rutCliente;
	}
	/**
	 * Establece el RUT del cliente asociado a la visita.
	 *
	 * @param rutCliente el nuevo RUT del cliente
	 */
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}
	/**
	 * Obtiene el día de la visita.
	 *
	 * @return el día de la visita
	 */
	public String getDia() {
		return dia;
	}
	/**
	 * Establece el día de la visita.
	 *
	 * @param dia el nuevo día de la visita
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}
	/**
	 * Obtiene la hora de la visita.
	 *
	 * @return la hora de la visita
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * Establece la hora de la visita.
	 *
	 * @param hora la nueva hora de la visita
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}
	/**
	 * Obtiene el lugar de la visita.
	 *
	 * @return el lugar de la visita
	 */
	public String getLugar() {
		return lugar;
	}
	/**
	 * Establece el lugar de la visita.
	 *
	 * @param lugar el nuevo lugar de la visita
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	/**
	 * Obtiene los comentarios sobre la visita.
	 *
	 * @return los comentarios de la visita
	 */
	public String getComentarios() {
		return comentarios;
	}
	/**
	 * Establece los comentarios sobre la visita.
	 *
	 * @param comentarios los nuevos comentarios de la visita
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	/**
	 * Devuelve una representación en forma de cadena de la visita en terreno.
	 *
	 * @return una cadena que representa la visita en terreno
	 */
	@Override
	public String toString() {
		return "VisitaEnTerreno [idVisita=" + idVisita + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}
	// Métodos de validación de la Visita en terreno
	/**
	 * Valida si el ID de la visita es mayor que 0.
	 *
	 * @param idVisita el ID de la visita a validar
	 * @return true si el ID de la visita es válido, false en caso contrario
	 */
	public boolean validaridVisita(int idVisita) {
		return idVisita > 0;
	}
	/**
	 * Valida si el RUT del cliente es un valor positivo menor o igual a 99,999,999.
	 *
	 * @param rutCliente el RUT del cliente a validar
	 * @return true si el RUT del cliente es válido, false en caso contrario
	 */
	public boolean validarRutCliente(int rutCliente) {
		return rutCliente <= 99999999 && rutCliente > 0;
	}
	/**
	 * Valida si el día ingresado corresponde a un día válido de la semana.
	 *
	 * @param dia el día a validar
	 * @return true si el día es válido, false en caso contrario
	 */
	public boolean validarDia(String dia) {
		return dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miercoles") || dia.equals("Jueves")
				|| dia.equals("Viernes") || dia.equals("Sabado") || dia.equals("Domingo");
	}
	/**
	 * Valida si la hora ingresada está en un formato válido (HH:mm).
	 *
	 * @param hora la hora a validar
	 * @return true si la hora es válida, false en caso contrario
	 */
	public boolean validarHora(String hora) {
		String[] splitHora = hora.split(":");
		return splitHora.length == 2 && Integer.parseInt(splitHora[0]) <= 23 && Integer.parseInt(splitHora[1]) <= 59;
	}
	/**
	 * Valida si el lugar de la visita tiene una longitud entre 10 y 50 caracteres.
	 *
	 * @param lugar el lugar a validar
	 * @return true si el lugar es válido, false en caso contrario
	 */
	public boolean validarLugar(String lugar) {
		return lugar.length() > 10 && lugar.length() < 50;
	}
	/**
	 * Valida si los comentarios ingresados tienen una longitud de hasta 100 caracteres.
	 *
	 * @param comentarios los comentarios a validar
	 * @return true si los comentarios son válidos, false en caso contrario
	 */
	public boolean validarComentarios(String comentarios) {
		return comentarios.length() <= 100;
	}
}
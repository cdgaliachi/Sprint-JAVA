package sprint;
/**
 * Representa una revisión en el sistema.
 */
public class Revision {
	private int idRevision;
	private int idVisita;
	private int rutCliente;
	private String nombreRevision;
	private String detalle;
	private int estado;
	/**
	 * Constructor por defecto para la clase Revision.
	 */
	public Revision() {
	}
	/**
	 * Constructor que inicializa una revisión con los valores especificados.
	 *
	 * @param idRevision     el identificador de la revisión
	 * @param idVisita       el identificador de la visita asociada
	 * @param rutCliente     el RUT del cliente asociado
	 * @param nombreRevision el nombre de la revisión
	 * @param detalle        los detalles de la revisión
	 * @param estado         el estado de la revisión (1, 2 o 3)
	 */
	public Revision(int idRevision, int idVisita, int rutCliente, String nombreRevision, String detalle, int estado) {
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.rutCliente = rutCliente;
		this.nombreRevision = nombreRevision;
		this.detalle = detalle;
		this.estado = estado;
	}
	/**
	 * Obtiene el identificador de la revisión.
	 *
	 * @return el identificador de la revisión
	 */
	public int getIdRevision() {
		return idRevision;
	}
	/**
	 * Establece el identificador de la revisión.
	 *
	 * @param idRevision el nuevo identificador de la revisión
	 */
	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}
	/**
	 * Obtiene el identificador de la visita asociada.
	 *
	 * @return el identificador de la visita asociada
	 */
	public int getIdVisita() {
		return idVisita;
	}
	/**
	 * Establece el identificador de la visita asociada.
	 *
	 * @param idVisita el nuevo identificador de la visita
	 */
	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}
	/**
	 * Obtiene el RUT del cliente asociado.
	 *
	 * @return el RUT del cliente
	 */
	public int getRutCliente() {
		return rutCliente;
	}
	/**
	 * Establece el RUT del cliente asociado.
	 *
	 * @param rutCliente el nuevo RUT del cliente
	 */
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}
	/**
	 * Obtiene el nombre de la revisión.
	 *
	 * @return el nombre de la revisión
	 */
	public String getNombreRevision() {
		return nombreRevision;
	}
	/**
	 * Establece el nombre de la revisión.
	 *
	 * @param nombreRevision el nuevo nombre de la revisión
	 */
	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}
	/**
	 * Obtiene los detalles de la revisión.
	 *
	 * @return los detalles de la revisión
	 */
	public String getDetalle() {
		return detalle;
	}
	/**
	 * Establece los detalles de la revisión.
	 *
	 * @param detalle los nuevos detalles de la revisión
	 */
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	/**
	 * Obtiene el estado de la revisión.
	 *
	 * @return el estado de la revisión
	 */
	public int getEstado() {
		return estado;
	}
	/**
	 * Establece el estado de la revisión.
	 *
	 * @param estado el nuevo estado de la revisión (1, 2 o 3)
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}
	/**
	 * Devuelve una representación en forma de cadena de la revisión.
	 *
	 * @return una cadena que representa a la revisión
	 */
	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", rutCliente=" + rutCliente
				+ ", nombreRevision=" + nombreRevision + ", detalle=" + detalle + ", estado=" + estado + "]";
	}
	// Métodos de validación de la Revision
	/**
	 * Valida si el identificador de la revisión es mayor que 0.
	 *
	 * @param idRevision el identificador de la revisión a validar
	 * @return true si el identificador es válido, false en caso contrario
	 */
	public boolean validaridRevision(int idRevision) {
  		return idRevision > 0;
  	}
	/**
	 * Valida si el identificador de la visita es mayor que 0.
	 *
	 * @param idVisita el identificador de la visita a validar
	 * @return true si el identificador es válido, false en caso contrario
	 */
  	public boolean validaridVisita(int idVisita) {
  		return idVisita > 0;
  	}
	/**
	 * Valida si el RUT del cliente es positivo y menor o igual a 99,999,999.
	 *
	 * @param rutCliente el RUT del cliente a validar
	 * @return true si el RUT es válido, false en caso contrario
	 */
  	public boolean validarRutCliente(int rutCliente) {
 		return rutCliente <= 99999999 && rutCliente > 0;
  	}
	/**
	 * Valida si el nombre de la revisión tiene una longitud entre 10 y 50 caracteres.
	 *
	 * @param nombreRevision el nombre de la revisión a validar
	 * @return true si el nombre es válido, false en caso contrario
	 */
  	public boolean validarnombreRevision(String nombreRevision) {
  		return nombreRevision.length() > 10 && nombreRevision.length() < 50;
  	}
	/**
	 * Valida si el detalle de la revisión tiene menos de 100 caracteres.
	 *
	 * @param detalle el detalle de la revisión a validar
	 * @return true si el detalle es válido, false en caso contrario
	 */
  	public boolean validardetalle(String detalle) {
		return detalle.length() < 100;
  	}
	/**
	 * Valida si el estado de la revisión es 1, 2 o 3.
	 *
	 * @param estado el estado de la revisión a validar
	 * @return true si el estado es válido, false en caso contrario
	 */
	public boolean estadoRevision(int estado) {
		return estado == 1 || estado == 2 || estado == 3;
	}
}
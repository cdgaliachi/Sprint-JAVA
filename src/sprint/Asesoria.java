package sprint;

/**
 * La interfaz Asesoria define el contrato para las clases que implementan la funcionalidad
 * de análisis de un usuario. Las clases que implementen esta interfaz deberán proporcionar 
 * una implementación para el método analizarUsuario.
 */
public interface Asesoria {
	
	/**
	 * Método que debe ser implementado para analizar la información de un usuario.
	 * La implementación específica dependerá de la clase que implemente esta interfaz.
	 */
	public void analizarUsuario();
}

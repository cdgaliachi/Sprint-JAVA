package sprint;

/**
 * Clase que representa un accidente con detalles como la fecha, hora, lugar, origen y consecuencias.
 */
public class Accidente {
    
    /**
     * Identificador único del accidente.
     */
    private int idAccidente;
    
    /**
     * RUT del cliente asociado al accidente.
     */
    private int rutCliente;
    
    /**
     * Día en que ocurrió el accidente.
     */
    private String dia;
    
    /**
     * Hora en que ocurrió el accidente.
     */
    private String hora;
    
    /**
     * Lugar donde ocurrió el accidente.
     */
    private String lugar;
    
    /**
     * Origen o causa del accidente.
     */
    private String origen;
    
    /**
     * Consecuencias del accidente.
     */
    private String consecuencias;

    /**
     * Constructor por defecto.
     */
    public Accidente() {
    }

    /**
     * Constructor que inicializa un accidente con todos sus detalles.
     * 
     * @param idAccidente Identificador único del accidente.
     * @param rutCliente RUT del cliente asociado al accidente.
     * @param dia Día en que ocurrió el accidente.
     * @param hora Hora en que ocurrió el accidente.
     * @param lugar Lugar donde ocurrió el accidente.
     * @param origen Origen o causa del accidente.
     * @param consecuencias Consecuencias del accidente.
     */
    public Accidente(int idAccidente, int rutCliente, String dia, String hora, String lugar, String origen,
                     String consecuencias) {
        this.idAccidente = idAccidente;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    /**
     * Obtiene el identificador único del accidente.
     * 
     * @return idAccidente Identificador único del accidente.
     */
    public int getIdAccidente() {
        return idAccidente;
    }

    /**
     * Establece el identificador único del accidente.
     * 
     * @param idAccidente Identificador único del accidente.
     */
    public void setIdAccidente(int idAccidente) {
        this.idAccidente = idAccidente;
    }

    /**
     * Obtiene el RUT del cliente asociado al accidente.
     * 
     * @return rutCliente RUT del cliente.
     */
    public int getRutCliente() {
        return rutCliente;
    }

    /**
     * Establece el RUT del cliente asociado al accidente.
     * 
     * @param rutCliente RUT del cliente.
     */
    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    /**
     * Obtiene el día en que ocurrió el accidente.
     * 
     * @return dia Día del accidente.
     */
    public String getDia() {
        return dia;
    }

    /**
     * Establece el día en que ocurrió el accidente.
     * 
     * @param dia Día del accidente.
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * Obtiene la hora en que ocurrió el accidente.
     * 
     * @return hora Hora del accidente.
     */
    public String getHora() {
        return hora;
    }

    /**
     * Establece la hora en que ocurrió el accidente.
     * 
     * @param hora Hora del accidente.
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Obtiene el lugar donde ocurrió el accidente.
     * 
     * @return lugar Lugar del accidente.
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Establece el lugar donde ocurrió el accidente.
     * 
     * @param lugar Lugar del accidente.
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Obtiene el origen o causa del accidente.
     * 
     * @return origen Origen del accidente.
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Establece el origen o causa del accidente.
     * 
     * @param origen Origen del accidente.
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Obtiene las consecuencias del accidente.
     * 
     * @return consecuencias Consecuencias del accidente.
     */
    public String getConsecuencias() {
        return consecuencias;
    }

    /**
     * Establece las consecuencias del accidente.
     * 
     * @param consecuencias Consecuencias del accidente.
     */
    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto Accidente.
     * 
     * @return Una cadena que contiene todos los detalles del accidente.
     */
    @Override
    public String toString() {
        return "Accidente [idAccidente=" + idAccidente + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
                + hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias=" + consecuencias + "]";
    }

    /**
     * Valida si el identificador del accidente es mayor que cero.
     * 
     * @param idAccidente Identificador del accidente.
     * @return true si el identificador es válido, false en caso contrario.
     */
    public boolean validarIdAccidente(int idAccidente) {
        return idAccidente > 0;
    }

    /**
     * Valida si el RUT del cliente es un valor entre 1 y 99999999.
     * 
     * @param rutCliente RUT del cliente.
     * @return true si el RUT es válido, false en caso contrario.
     */
    public boolean validarRutCliente(int rutCliente) {
        return rutCliente <= 99999999 && rutCliente > 0;
    }

    /**
     * Valida si el día del accidente es uno de los días de la semana.
     * 
     * @param dia Día del accidente.
     * @return true si el día es válido, false en caso contrario.
     */
    public boolean validarDia(String dia) {
        return dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miercoles") || dia.equals("Jueves")
                || dia.equals("Viernes") || dia.equals("Sabado") || dia.equals("Domingo");
    }

    /**
     * Valida si la hora del accidente está en el formato HH:MM y es una hora válida.
     * 
     * @param hora Hora del accidente.
     * @return true si la hora es válida, false en caso contrario.
     */
    public boolean validarHora(String hora) {
        String[] splitHora = hora.split(":");
        return splitHora.length == 2 && Integer.parseInt(splitHora[0]) <= 23 && Integer.parseInt(splitHora[1]) <= 59;
    }

    /**
     * Valida si el lugar del accidente tiene entre 11 y 49 caracteres.
     * 
     * @param lugar Lugar del accidente.
     * @return true si el lugar es válido, false en caso contrario.
     */
    public boolean validarLugar(String lugar) {
        return lugar.length() > 10 && lugar.length() < 50;
    }

    /**
     * Valida si el origen del accidente tiene 70 caracteres o menos.
     * 
     * @param origen Origen del accidente.
     * @return true si el origen es válido, false en caso contrario.
     */
    public boolean validarOrigen(String origen) {
        return origen.length() <= 70;
    }

    /**
     * Valida si las consecuencias del accidente tienen 100 caracteres o menos.
     * 
     * @param consecuencias Consecuencias del accidente.
     * @return true si las consecuencias son válidas, false en caso contrario.
     */
    public boolean validarConsecuencias(String consecuencias) {
        return consecuencias.length() <= 100;
    }
}

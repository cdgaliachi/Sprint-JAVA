package sprint;

import java.util.ArrayList;
import java.util.List;


/**
 * La clase Contenedor se encarga de almacenar y gestionar objetos de tipo Asesoria y Capacitacion.
 * Proporciona métodos para agregar, eliminar y listar estos objetos, 
 * facilitando la gestión de clientes, profesionales, administrativos y capacitaciones.
 */

public class Contenedor {
    private List<Asesoria> asesorias;
    private List<Capacitacion> capacitaciones;

    
    /**
     * Constructor que inicializa las listas de asesorías y capacitaciones.
     */
    
    public Contenedor() {
        this.asesorias = new ArrayList<>();
        this.capacitaciones = new ArrayList<>();
    }
 // Métodos para almacenar los tipos de usuarios

    /**
     * Almacena un objeto Cliente en la lista de asesorías.
     *
     * @param cliente El objeto Cliente a almacenar.
     */
    public void almacenarCliente(Cliente cliente) {
        asesorias.add(cliente);
    }
    
    
    /**
     * Almacena un objeto Profesional en la lista de asesorías.
     *
     * @param profesional El objeto Profesional a almacenar.
     */
    public void almacenarProfesional(Profesional profesional) {
        asesorias.add(profesional);
    }
    
    
    /**
     * Almacena un objeto Administrativo en la lista de asesorías.
     *
     * @param administrativo El objeto Administrativo a almacenar.
     */
    
    public void almacenarAdministrativo(Administrativo administrativo) {
        asesorias.add(administrativo);
    }
    
 // Método para almacenar capacitación

    /**
     * Almacena un objeto Capacitacion en la lista de capacitaciones.
     *
     * @param capacitacion El objeto Capacitacion a almacenar.
     */
    
    
    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

 // Método para eliminar usuario

    /**
     * Elimina un usuario de la lista de asesorías basado en su RUN.
     *
     * @param run El RUN del usuario que se desea eliminar.
     */
    
    public void eliminarUsuario(int run) {
        asesorias.removeIf(asesoria -> asesoria instanceof Usuario && ((Usuario) asesoria).getRun()==run);
    }

    // Método que despliega la lista de los usuarios

    /**
     * Lista todos los usuarios almacenados en la lista de asesorías, 
     * llamando al método analizarUsuario() de cada uno.
     */
    
    public void listarUsuarios() {
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {
                ((Usuario) asesoria).analizarUsuario();
            }
        }
    }
    
    // Método que despliega la lista de los usuarios por tipo

    /**
     * Lista los usuarios almacenados en la lista de asesorías que son de un tipo específico.
     *
     * @param tipo La clase del tipo de usuario que se desea listar (por ejemplo, Cliente.class).
     */
    
    public void listarUsuariosPorTipo(Class<?> tipo) {
        for (Asesoria asesoria : asesorias) {
            if (tipo.isInstance(asesoria)) {
                ((Usuario) asesoria).analizarUsuario();
            }
        }
    }
    
    // Método que despliega la lista de las capacitaciones

    /**
     * Lista todas las capacitaciones almacenadas, mostrando los detalles de cada una.
     */
    
    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println(capacitacion.mostrarDetalle());
        }
    }
}

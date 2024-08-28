package principal;

import java.util.Scanner;

import sprint.Administrativo;
import sprint.Capacitacion;
import sprint.Cliente;
import sprint.Contenedor;
import sprint.Profesional;

/**
 * Clase principal que maneja el menú de la aplicación y realiza operaciones
 * relacionadas con clientes, profesionales, administrativos y capacitaciones.
 * 
 * @author Carolina Diaz
 * @author Ricardo Ramones
 */
public class Principal {

    /**
     * Método principal que ejecuta la aplicación y maneja las operaciones según la
     * opción seleccionada en el menú.
     * 
     * @param args Los argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            /**
             * Muestra el menú principal de opciones en la consola.
             */
            System.out.println("Menú principal:");
            System.out.println("1. Almacenar cliente");
            System.out.println("2. Almacenar profesional");
            System.out.println("3. Almacenar administrativo");
            System.out.println("4. Almacenar capacitación");
            System.out.println("5. Eliminar usuario");
            System.out.println("6. Listar usuarios");
            System.out.println("7. Listar usuarios por tipo");
            System.out.println("8. Listar capacitaciones");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Cliente cliente = new Cliente();

                    /**
                     * Realiza la validación y almacenamiento de un cliente.
                     */
                    // Validación del nombre
                    while (true) {
                        System.out.println("Ingrese el nombre del usuario:");
                        String nombre = scanner.nextLine();
                        if (cliente.validarNombre(nombre)) {
                            cliente.setNombre(nombre);
                            break;
                        } else {
                            System.out.println("El nombre debe contener más de 10 y menos de 50 caracteres.");
                        }
                    }

                    // Validación de la fecha de nacimiento
                    while (true) {
                        System.out.println("Ingrese la fecha de nacimiento del usuario (DD/MM/AAAA):");
                        String fechaNacimiento = scanner.nextLine();
                        if (cliente.validarFechaNacimiento(fechaNacimiento)) {
                            cliente.setFechaNacimiento(fechaNacimiento);
                            break;
                        } else {
                            System.out.println("Debe ingresar una fecha válida separada por '/'.");
                        }
                    }

                    // Validación del RUN
                    while (true) {
                        System.out.println("Ingrese el RUN del usuario:");
                        int run = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
                        if (cliente.validarRun(run)) {
                            cliente.setRun(run);
                            break;
                        } else {
                            System.out.println("Debes ingresar un RUN válido.");
                        }
                    }

                    // Validación del Rut
                    while (true) {
                        System.out.println("Ingrese el RUT del cliente:");
                        int rut = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
                        if (cliente.validarRut(rut)) {
                            cliente.setRut(rut);
                            break;
                        } else {
                            System.out.println("Debes ingresar un RUT válido.");
                        }
                    }

                    // Validación de nombres
                    while (true) {
                        System.out.println("Ingrese los nombres del cliente:");
                        String nombres = scanner.nextLine();
                        if (cliente.validarNombres(nombres)) {
                            cliente.setNombres(nombres);
                            break;
                        } else {
                            System.out.println("Los nombres deben contener más de 5 y menos de 30 caracteres.");
                        }
                    }

                    // Validación de apellidos
                    while (true) {
                        System.out.println("Ingrese los apellidos del cliente:");
                        String apellidos = scanner.nextLine();
                        if (cliente.validarApellidos(apellidos)) {
                            cliente.setApellidos(apellidos);
                            break;
                        } else {
                            System.out.println("Los apellidos deben contener más de 5 y menos de 30 caracteres.");
                        }
                    }

                    // Validación de teléfono
                    while (true) {
                        System.out.println("Ingrese el teléfono del cliente:");
                        String telefono = scanner.nextLine();
                        if (cliente.validarTelefono(telefono)) {
                            cliente.setTelefono(telefono);
                            break;
                        } else {
                            System.out.println("El teléfono es obligatorio, ingrese un teléfono válido.");
                        }
                    }

                    // Validación de AFP
                    while (true) {
                        System.out.println("Ingrese la AFP del cliente:");
                        String afp = scanner.nextLine();
                        if (cliente.validarAfp(afp)) {
                            cliente.setAfp(afp);
                            break;
                        } else {
                            System.out.println("La AFP debe contener más de 4 y menos de 30 caracteres.");
                        }
                    }

                    // Validación del sistema de salud
                    while (true) {
                        System.out.println("Ingrese el sistema de salud del cliente (1 Fonasa, 2 Isapre):");
                        int sistemaSalud = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
                        if (cliente.validarSistemaSalud(sistemaSalud)) {
                            cliente.setSistemaSalud(sistemaSalud);
                            break;
                        } else {
                            System.out.println("El sistema de salud debe ser 1 (Fonasa) o 2 (Isapre).");
                        }
                    }

                    // Validación de dirección
                    while (true) {
                        System.out.println("Ingrese la dirección del cliente:");
                        String direccion = scanner.nextLine();
                        if (cliente.validarDireccion(direccion)) {
                            cliente.setDireccion(direccion);
                            break;
                        } else {
                            System.out.println("La dirección debe contener menos de 70 caracteres.");
                        }
                    }

                    // Validación de comuna
                    while (true) {
                        System.out.println("Ingrese la comuna del cliente:");
                        String comuna = scanner.nextLine();
                        if (cliente.validarComuna(comuna)) {
                            cliente.setComuna(comuna);
                            break;
                        } else {
                            System.out.println("La comuna debe contener menos de 50 caracteres.");
                        }
                    }

                    // Validación de edad
                    while (true) {
                        System.out.println("Ingrese la edad del cliente:");
                        int edad = scanner.nextInt();
                        scanner.nextLine();
                        if (cliente.validarEdad(edad)) {
                            cliente.setEdad(edad);
                            break;
                        } else {
                            System.out.println("La edad debe ser mayor a 0 y menor a 150 años.");
                        }
                    }

                    // Método que almacena los datos en el contenedor
                    contenedor.almacenarCliente(cliente);
                    System.out.println("******USUARIO ALMACENADO******");
                    break;
                case 2:
                    Profesional profesional = new Profesional();

                    /**
                     * Realiza la validación y almacenamiento de un profesional.
                     */
                    // Validación del nombre
                    while (true) {
                        System.out.println("Ingrese el nombre del usuario:");
                        String nombre = scanner.nextLine();
                        if (profesional.validarNombre(nombre)) {
                            profesional.setNombre(nombre);
                            break;
                        } else {
                            System.out.println("El nombre debe contener más de 10 y menos de 50 caracteres.");
                        }
                    }

                    // Validación de la fecha de nacimiento
                    while (true) {
                        System.out.println("Ingrese la fecha de nacimiento del usuario (DD/MM/AAAA):");
                        String fechaNacimiento = scanner.nextLine();
                        if (profesional.validarFechaNacimiento(fechaNacimiento)) {
                            profesional.setFechaNacimiento(fechaNacimiento);
                            break;
                        } else {
                            System.out.println("Debe ingresar una fecha válida separada por '/'.");
                        }
                    }

                    // Validación del RUN
                    while (true) {
                        System.out.println("Ingrese el RUN del usuario:");
                        int run = scanner.nextInt();
                        scanner.nextLine();
                        if (profesional.validarRun(run)) {
                            profesional.setRun(run);
                            break;
                        } else {
                            System.out.println("Debes ingresar un RUN válido.");
                        }
                    }

                    // Validación del título
                    while (true) {
                        System.out.println("Ingrese el título del Profesional:");
                        String titulo = scanner.nextLine();
                        if (profesional.validarTitulo(titulo)) {
                            profesional.setTitulo(titulo);
                            break;
                        } else {
                            System.out.println("El título debe contener más de 5 y menos de 50 caracteres.");
                        }
                    }

                    // Validación de la fecha de ingreso
                    while (true) {
                        System.out.println("Ingrese la fecha de ingreso del Profesional (DD/MM/AAAA):");
                        String fechaIngreso = scanner.nextLine();
                        if (profesional.validarFechaIngreso(fechaIngreso)) {
                            profesional.setFechaIngreso(fechaIngreso);
                            break;
                        } else {
                            System.out.println("Debe ingresar una fecha válida separada por '/'.");
                        }
                    }

                    // Método que almacena los datos en el contenedor
                    contenedor.almacenarProfesional(profesional);
                    System.out.println("******USUARIO ALMACENADO******");
                    break;

                case 3:
                    Administrativo administrativo = new Administrativo();

                    /**
                     * Realiza la validación y almacenamiento de un administrativo.
                     */
                    // Validación del nombre
                    while (true) {
                        System.out.println("Ingrese el nombre del usuario:");
                        String nombre = scanner.nextLine();
                        if (administrativo.validarNombre(nombre)) {
                            administrativo.setNombre(nombre);
                            break;
                        } else {
                            System.out.println("El nombre debe contener más de 10 y menos de 50 caracteres.");
                        }
                    }

                    // Validación de la fecha de nacimiento
                    while (true) {
                        System.out.println("Ingrese la fecha de nacimiento del usuario (DD/MM/AAAA):");
                        String fechaNacimiento = scanner.nextLine();
                        if (administrativo.validarFechaNacimiento(fechaNacimiento)) {
                            administrativo.setFechaNacimiento(fechaNacimiento);
                            break;
                        } else {
                            System.out.println("Debe ingresar una fecha válida separada por '/'.");
                        }
                    }

                    // Validación del RUN
                    while (true) {
                        System.out.println("Ingrese el RUN del usuario:");
                        int run = scanner.nextInt();
                        scanner.nextLine();
                        if (administrativo.validarRun(run)) {
                            administrativo.setRun(run);
                            break;
                        } else {
                            System.out.println("Debes ingresar un RUN válido.");
                        }
                    }

                    // Validación del área
                    while (true) {
                        System.out.println("Ingrese el área del Administrativo:");
                        String area = scanner.nextLine();
                        if (administrativo.validarArea(area)) {
                            administrativo.setArea(area);
                            break;
                        } else {
                            System.out.println("El área debe contener más de 5 y menos de 20 caracteres.");
                        }
                    }

                    // Validación de la experiencia previa
                    while (true) {
                        System.out.println("Ingrese la experiencia previa del Administrativo:");
                        String experienciaPrevia = scanner.nextLine();
                        if (administrativo.validarExperienciaPrevia(experienciaPrevia)) {
                            administrativo.setExperienciaPrevia(experienciaPrevia);
                            break;
                        } else {
                            System.out.println("La experiencia previa debe contener menos de 100 caracteres.");
                        }
                    }

                    // Método que almacena los datos en el contenedor
                    contenedor.almacenarAdministrativo(administrativo);
                    System.out.println("******USUARIO ALMACENADO******");
                    break;

                case 4:
                    Capacitacion capacitacion = new Capacitacion();

                    /**
                     * Realiza la validación y almacenamiento de una capacitación.
                     */
                    // Validación del identificador
                    while (true) {
                        System.out.println("Ingrese el identificador de la capacitación:");
                        int identificador = scanner.nextInt();
                        scanner.nextLine();
                        if (capacitacion.validarIdentificador(identificador)) {
                            capacitacion.setIdentificador(identificador);
                            break;
                        } else {
                            System.out.println("Debe ingresar un identificador mayor a 0.");
                        }
                    }

                    // Validación del RUT cliente
                    while (true) {
                        System.out.println("Ingrese el RUT del cliente:");
                        int rutCliente = scanner.nextInt();
                        scanner.nextLine();
                        if (capacitacion.validarRutCliente(rutCliente)) {
                            capacitacion.setRutCliente(rutCliente);
                            break;
                        } else {
                            System.out.println("Debe ingresar un RUT válido.");
                        }
                    }

                    // Validación del día de la capacitación
                    while (true) {
                        System.out.println("Ingrese el día de la capacitación:");
                        String dia = scanner.nextLine();
                        if (capacitacion.validarDia(dia)) {
                            capacitacion.setDia(dia);
                            break;
                        } else {
                            System.out.println("Debe ingresar un día válido.");
                        }
                    }

                    // Validación de la hora de la capacitación
                    while (true) {
                        System.out.println("Ingrese la hora de la capacitación (HH:MM):");
                        String hora = scanner.nextLine();
                        if (capacitacion.validarHora(hora)) {
                            capacitacion.setHora(hora);
                            break;
                        } else {
                            System.out.println("Debe ingresar una hora válida (HH:MM).");
                        }
                    }

                    // Validación del lugar
    				while (true) {
    					System.out.print("Ingrese el lugar de la capacitación: ");
    					String lugar = scanner.nextLine();
    					if (capacitacion.validarLugar(lugar)) {
    						capacitacion.setLugar(lugar);
    						break;
    					} else {
    						System.out.println("El lugar debe contener más de 10 y menos de 50 caracteres.");
    					}
    				}
    				// Validación de la duración
    				while (true) {
    					System.out.print("Ingrese la duración de la capacitación: ");
    					String duracion = scanner.nextLine();
    					if (capacitacion.validarDuracion(duracion)) {
    						capacitacion.setDuracion(duracion);
    						break;
    					} else {
    						System.out.println("La duración debe contener menos de 70 caracteres.");
    					}
    				}
    				// Validación de la cantidad de asistentes
    				while (true) {
    					System.out.print("Ingrese la cantidad de asistentes a la capacitación: ");
    					int cantidadAsistentes = scanner.nextInt();
    					if (capacitacion.validarCantidadAsistentes(cantidadAsistentes)) {
    						capacitacion.setCantidadAsistentes(cantidadAsistentes);
    						break;
    					} else {
    						System.out.println("Debe ingresar una cantidad menor a 1000.");
    					}
    				}

                    // Validación de la cantidad de asistentes
                    while (true) {
                        System.out.println("Ingrese la cantidad de asistentes:");
                        int cantidadAsistentes = scanner.nextInt();
                        scanner.nextLine();
                        if (capacitacion.validarCantidadAsistentes(cantidadAsistentes)) {
                            capacitacion.setCantidadAsistentes(cantidadAsistentes);
                            break;
                        } else {
                            System.out.println("Debe ingresar una cantidad de asistentes válida.");
                        }
                    }

                    // Método que almacena los datos en el contenedor
                    contenedor.almacenarCapacitacion(capacitacion);
                    System.out.println("******CAPACITACIÓN ALMACENADA******");
                    break;

                case 5:
                    System.out.println("Ingrese el RUN del usuario que desea eliminar:");
                    int runEliminar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    // Método que elimina un usuario por su RUN
                    contenedor.eliminarUsuario(runEliminar);
                    System.out.println("******USUARIO ELIMINADO******");
                    break;

                case 6:
                    // Método que lista todos los usuarios
                    contenedor.listarUsuarios();
                    break;

                case 7:
                	// Metodo que despliega la lista de usuarios por tipo
    				System.out.println("Seleccione el tipo de usuario: 1. Cliente, 2. Profesional, 3. Administrativo");
    				int tipo = scanner.nextInt();
    				scanner.nextLine(); // Limpiar el buffer
    				if (tipo == 1) {
    					contenedor.listarUsuariosPorTipo(Cliente.class);
    				} else if (tipo == 2) {
    					contenedor.listarUsuariosPorTipo(Profesional.class);
    				} else if (tipo == 3) {
    					contenedor.listarUsuariosPorTipo(Administrativo.class);
    				}
                    break;

                case 8:
                    // Método que lista todas las capacitaciones
                    contenedor.listarCapacitaciones();
                    break;

                case 9:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 9.");
            }

        } while (opcion != 9);

        scanner.close();
    }
}

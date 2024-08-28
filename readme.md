# Proyecto JAVA - Sprint Módulo 4

## Integrantes
- **Carolina Diaz**
- **Ricardo Ramones**

## Descripción del Proyecto
Este proyecto es parte del Sprint del Módulo 4 de JAVA. El objetivo fue crear un sistema de gestión de usuarios y capacitaciones, implementando principios de herencia, interfaces y métodos en Java.

## Contextualización del problema
Un grupo de profesionales ha fundado una compañía de asesorías en prevención de riesgos
laborales y necesita una solución tecnológica que ayude a administrar los procesos que se
deben ejecutar en cada una de las empresas que son clientes de la compañía. La empresa no posee un sistema de información que le permita administrar toda la cantidad de registros que se genera.

Es necesario desarrollar una solución tecnológica que cubra los procesos de negocio descritos y que proponga una mejora en la gestión, el control, la seguridad, y disponibilidad de información
para la empresa y sus clientes.

## Solución y Estructura del Proyecto

### Entidades
- Se crearon 8 entidades con sus respectivos atributos y métodos de validación de datos.
- Tres de estas entidades (`Administrativo`, `Cliente`, `Profesional`) son clases hijas que heredan de la clase padre `Usuario`.

### Interfaz
- Se implementó una interfaz llamada `Asesorias` que inicializa el método `analizarUsuario`.
- Este método fue implementado tanto en la clase padre (`Usuario`) como en las clases hijas (`Administrativo`, `Cliente`, `Profesional`) para retornar los datos solicitados.

### Uso del Menú Principal
- Se creó un menú en la clase `Principal` utilizando un `switch` con **9 opciones**.
- El programa inicia mostrando este menú, permitiendo al usuario seleccionar entre las siguientes opciones:
  1. **Almacenar cliente**: Permite al usuario introducir los datos de un cliente, los cuales son validados antes de almacenarse.
  2. **Almacenar profesional**: Permite al usuario introducir los datos de un profesional, los cuales son validados antes de almacenarse.
  3. **Almacenar administrativo**: Permite al usuario introducir los datos de un administrativo, los cuales son validados antes de almacenarse.
  4. **Almacenar capacitación**: Permite al usuario introducir los datos de una capacitación, los cuales son validados antes de almacenarse.
  5. **Eliminar usuario**: Permite eliminar un usuario ingresando su RUN.
  6. **Listar usuarios**: Muestra todos los usuarios almacenados.
  7. **Listar usuarios por tipo**: Filtra y muestra usuarios por tipo (`Administrativo`, `Cliente`, `Profesional`).
  8. **Listar capacitaciones**: Muestra todas las capacitaciones almacenadas.
  9. **Salir**: Finaliza el programa.

## Manejo de Datos
- Los usuarios y capacitaciones se almacenan en listas creadas en la clase `Contenedor`:
  - `Asesorias`: Para los tipos de usuarios.
  - `Capacitaciones`: Para las capacitaciones.
- Se implementaron métodos específicos para agregar objetos y sus atributos a estas listas.
- Se creó el metodo `eliminarUsuario` para la quinta opción del menú.
- Para las capacitaciones, se implementó el método `mostrarDetalle`, que proporciona una vista detallada de los datos de la capacitación al mostrarlos en pantalla.

## Consideraciones
- Se incluyen métodos adicionales como `mostrarEdad` y `obtenerNombre`, que están preparados para futuros usos en el sistema, al igual que sucede con las clases `Accidente`, `Revision` y `VisitaEnTerreno`.

URL del repositorio: https://github.com/cdgaliachi/Sprint-JAVA

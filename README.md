# JuegoPreguntasRespuestasSofkauMejorado
El presente proyecto es con el propósito de mejorar el juego de preguntas y respuestas del concurso de Sofkau
El presente es un reto en el que se va a modelar un concurso de preguntas y respuestas, la intención es diseñar una solución que permita tener un banco de preguntas
con diferentes opciones para una única respuesta, además cada pregunta debe estar en una categoría o un grupos de preguntas similares del mismo nivel, Por cada ronda
se deberá asignar un premio a conseguir, las rondas del juego son nivel que van aumentando en la medida que el jugador gana premios. Dentro del reto se debe considerar
lo siguiente: 
● Manejo de clases u objetos a nivel de modelamiento. 
● Persistencia de datos o guardado de históricos. 
● Manejos de listas o colecciones y ciclos de control adecuados 
● Conocimiento de cualquier lenguaje de programación. 
● Manejo de Git (versión de control).

#Especificaciones tecnicas: 
*El proyecto se realizó con ayuda del IDE Apache NetBeans 12.6. 
*Sistema operativo Windows 10. 
*Lenguaje de programacion JAVA versión 15.02 y herramienta de software MAVEN versión 15. 
*Se utilizó Git Bash como la línea de comandos para trabajar con Git en Windows. 
*Como repositorio remoto se utiliza para este proyecto GitHub.
*Xampp es un paquete que contiene varias herramientas para crear aplicaciones web: un servidor web apache, la base de datos MySQL,
 PHPMyAdmin y PHP. En nuestro proyecto vamos a usar MySQL como base de datos relacional y apache junto con phpmyadmin para 
 gestionar nuestra base de datos desde una interfaz web. Para instalarlo vamos al sitio web y seleccionamos el instalador de 
 acuerdo a nuestro sistema operativo. Para instalar nuestra base de datos utilizaremos el gestor llamado XAMPP, un software que 
 contiene empaquetado el servidor web apache, mysql como base de datos, php como lenguaje de backend y proftpD como servidor ftp.
 En nuestro caso, solo necesitamos usar mysql como base de datos y apache para gestionar nuestra base de datos desde la 
 herramienta web PhpMyAdmin.

#Cómo correr el programa. 
*Para correr el programa se recomienda tener en cuenta cumplir con las especificaciones técnicas brindadas. 
*Abrir el programa XAMPP; habilitar Apache y MySQL.
*Hecho lo anterior, ingresar al navegador a la dirección <localhost> o <127.0.0.1>, con esto se abre una ventana en el navegador para
 gestionar la BD.
*Se da en la opción <phpmyadmin>, la cual es una aplicación web que nos permite gestionar la BD de MySQL.
*Una vez allí, creamos una BD con el nombre <resultadojuego_app>; en caso de poner otro nombre, se debe tener en cuenta que se debe 
 modificar este nombre dentro de la clase Conexion. Emplear utf8mb4_general-ci, para trabajar con los caracteres latinos sin problema.
*Se crea la columna 1 llamada idUsuario de tipo int(7), autoincrementable y llave primaria.
*Se crea la columna 2 llamada nombreUsuario de tipo varchar(40).
*Se crea la columna 3 llamada puntos de tipo int(13).
*Se crea la columna fechaRegistro de tipo timestamp y en la opción predeterminada poner current_timestamp().
*Descargar el repositorio remoto del enlace https://github.com/DidierJavier/JuegoPreguntasRespuestasSofkauMejorado 
*Asegurarse de haber descargado el repositorio, verificando que esté la carpeta src, dentro de esta la carpeta Main y en esta última carpeta JAVA, tres carpetas que 
son los paquetes donde se alojan las clases. 
*Asegurarse de haber descargado la carpeta tarjet y el archivo <pom.xml> que es donde se encuentran entre otros las dependencias requeridas para el proyecto. 
*Crear un nuevo proyecto preferiblemente en ApacheNetBeans y luego de crearlo, cambiar las carpetas del proyecto recién creado por las carpetas que se descargaron. 
*Correr el programa desde la clase EntradaJuego, que es donde se encuentra el método de entrada del programa (public static void main).

#Programacion: *El proyecto consta de cuatro paquetes:

com.sofkau.juegopreguntassofkau -> En este paquete se tienen todas las clases de las cuales se van a crear los objetos. 
1.1. Clase Respuesta: Esta clase contiene los atributos idRespuesta de tipo entero, respuesta de tipo String, caracterABCD de tipo char, acierto de tipo boolean
y el contador de respuestas llamado contadorRespuestas; lo anterior para obtener los objetos tipo Respuesta requeridos para cada una de las preguntas. En estos objetos
se almacenan las opciones de respuesta que se le brindan al usuario o sea, las diferentes opciones de eleccion que tiene el usuario (A, B, C o D) y en se almacena el
valor de verdad de cada opcion que tiene el usuario, para validar si la respuesta es false or true.
1.2. Clase Pregunta: Como su nombre lo indica, esta clase sirve para crear objetos tipo Pregunta. Contiene el atributo de tipo String pregunta, para crear cada una 
de las preguntas que se la van a hacer al usuario. El atributo de tipo ArrayList de nominado repuestasPorCadaPregunta, en el que se almacenan los objetos tipo 
Respuesta, ya que cada una de las preguntas debe ir con sus posibles respuestas; así que por relación de agregación, se almacenan en el array las posibles respuestas
de cada pregunta. El atributo de tipo int idPregunta y el contadorPreguntas.
1.3. Clase Categoria: Esta clase sirve para crear objetos tipo Categoria. Como cada categoría debe tener 5 preguntas, entonces se creó un atributo tipo para 
almacenar las preguntas de acuerdo a la categoría y que se denomina preguntasPorCategoria de tipo ArrayList, tambien contiene los atributos idCategoria y 
contadorCategorias de tipo int, el nombre de la categoria de tipo String y una constante de tipo int llamada MAX_POSIBLES_PREGUNTAS con un valor de 5, para obtener
una de las preguntas por cada categoria con la ayuda de la clase Ramdon; por lo tanto la relación entre las categorías y las preguntas es de agregación; como las 
preguntas agregadas tienen almacenadas las respuestas, entonces en al Array de preguntas, están también los atributos de la clase Respuesta. 
  El metodo mostrarPreguntasAleatoriaPorCategoria genera un numero aleatorio, mediante el cual luego se emplea para mostrar una de las cinco preguntas de la categoria.
  Con el metodo obtenerCategoriaPreguntaYrespuestas, se obtiene la categoria segun la ronda en la que el usuario se encuentre y de cada categoria, se extrae la
  pregunta y las posibles respuestas para el usuario y se continua en este metodo hasta que el usuario gane las 5 rondas, pierda en alguna de las rondas o decida
  retirarse.
1.4. Clase Usuario: Se emplea para crear objetos tipo Usuario y como atributos tiene el idUusario de tipo entero, el nombreUsuario de tipo String, puntos de tipo int
  y ganaPuntos e inicioJuego de tipo boolean. Mediante esta clase se crean objetos de tipo Usuario y se obtienen datos de cada jugador.
  Metodo validarNombreUusario: Se emplea para obtener un nombre de usuario de al menos 7 caracteres.
  Metodo iniciarJuegoContinuar: Se emplea para confirmar si el usuario decide empezar a jugar o salir.
  Metodo salir: Muestra el resultado del juego en pantalla al usuario y luego enlaza al método enlazarUsuarioA_conexion, de la clase
  UIMenu.
  
2.0. Paquete ui -> Este paquete contiene a la clase UIMenu. 
2.1. Clase UIMenu: Se emplea para interactuar con el usuario y consta de los siguientes métodos: 
*verMenu: Aquí se le da la bienvenida al usuario, se le explican las condiciones del juego y se le da la opción de empezar o salir. Si el usuario da una opción 
 inválida se seguirá preguntando si desea continuar o salir hasta que de una opción válida. Si el usuario da la opción de salir, se finaliza el programa. 
*Metodo continuarJugando_O_retirarse_puntos: Aquí se le da la opcion al usuario de continuar con el juego o de retirarse y se van almacenando los puntos acumulados.
*Metodo enlazarUsuarioA_conexion: Despliega un menu con diferentes opciones como: enviar un usuario a la BD, listar usuarios, eliminar
 usuario, editar usuario y salir. A excepción de la opción de salir, las demás opciones conectan con la clase UsuarioService.

3.0. Paquete entrada.juego: Aquí se aloja la clase EntradaJuego.
3.1. Clase EntradaJuego: Aquí se crearon todos los objetos tipo Respuesta, Pregunta y Categoría. Además se llama al método obtenerCategoriaPreguntaYrespuestas de la
  clase Categoria, la cual recibe como parametros un ArrayList de tipo Categoria llamada categorias y el metodo verMenu() de la clase UIMenu, el cual devuelve un int.

4.0. Paquete conexion.db: En este paquete se encuentran las clases que permiten la interacción con la BD.
4.1. Clase conexion: Establece de ruta de conexión a la BD. En nuestro caso la ruta corresponde al localhost. Se emplea la configuración
 por defecto que trae el paquete XAMPP. El usuario por defecto es <root> y no tiene contraseña. Si se tiene un nombre distinto a la BD,
 donde dice <resultadoJuego_app>, se cambia por el nombre que se le haya dado a la BD.
4.2. Clase UsuarioService: Conecta con la clase UsuarioDao a través de los métodos:
*recibirUsuario: Llama al método UsuarioDAO.crearUsuarioDB(usuario).
*listarUsuarios: Llama al método UsuarioDAO.leerUsuarioDB().
*borrarUsuario: Solicita el id del usuario de la BD que se desea borrar y llama al método UsuarioDAO.borrarUsuarioDB(id_usuario).
*editarUsuario: Solicita el id del usuario de la BD que se desea editar y llama al método UsuarioDAO.actualizarUsuarioDB(usuarioActualizacion).
4.3. Clase UsuarioDao: Permite la comunicación entre la BD y la clase UsuarioService y contiene los siguientes métodos:
*crearUsuarioDB(Usuario usuario): Si se dio la opción 1 en el menú de persistencia de datos (enviar usuario a la BD), el usuario es
 creado en la BD.
*leerUsuarioDB(): Si se dio la opción 2 en el menú de persistencia de datos (listar usuarios), se muestra la lista de los usuarios que
 están en la base de datos con el id, el nombre y los puntos.
*borrarUsuarioDB(int id_usuario): Si se dio la opción 3 en el menú de persistencia de datos (eliminar usuario), se elimina al usuario
 de la BD, según el ID que se haya brindado con el método borrarUsuario de la clase UsuarioService.
*actualizarUsuarioDB(Usuario cambioUsuario): Si se dio la opción 4 en el menú de persistencia de datos (editar usuario), se puede
 modificar el nombre del usuario de de la BD, según el ID que se haya brindado con el método editarUsuario de la clase UsuarioService.

#Instrucciones para el usuario. 
1. El juego del Concurso de Preguntas y Respuestas consiste en que hacer preguntas con una opción de respuesta (A, B, C ó D); cada pregunta tiene una única respuesta
 verdadera. 
2. Se cuenta con 5 rondas de preguntas; por cada ronda aumenta el nivel de dificultad de las preguntas. En cada ronda sale una pregunta de forma aleatoria. Por cada
respuesta acertada se ganan puntos; por una respuesta errada se pierden todos los puntos. Si se retira antes de contestar la pregunta el usuario queda con los puntos
acumulados de rondas anteriores.  
3. El usuario que responda las 5 preguntas correctamente gana. 
4. El juego inicia cuando el usuario corre el programa desde la clase EntradaJuego. 
5. Al correr el programa aparece en pantalla una breve explicación del juego. Luego se solicita dar la opción 1 para empezar a jugar o la opción 2 para salir. 
6. Si se da una opción diferente se seguirá preguntando si desea ingresar o salir. Si se da la opción 2, el juego finaliza y no se obtienen puntos. Si se da la opción
  1, se solicita ingresar el nombre, el cual debe contener al menos 7 letras sin contar los espacios; si se ingresan menos letras se va a seguir solicitando ingresar
  el nombre. Cuando se ingresan al menos 7 letras se informa en pantalla que el usuario está en la categoria 1 y la pregunta de dicha categoría, junto con las posibles
  respuestas.
7. Sale el mensaje "Digite la letra de la respuesta que considera correcta (A, B, C, D)", "Digite otra letra si desea retirarse". 
8. Si digita una letra diferente a A, B, C, o D, el programa finaliza y el usuario queda con los puntos acumulados en rondas anteriores. 
9. Si a pesar de haber seleccionado una opción correcta (A, B, C, o D), la respuesta no es la correcta, no se obtiene ningún punto y el programa finaliza. 
10. Si se seleccionó una opción correcta y la respuesta es correcta se ganan los puntos de la categoría y se asciende a la categoría siguiente. 
11. Cada vez que se responde de forma acertada, se informa la categoría a la que asciende el usuario al igual que la pregunta de la categía respectiva y se repiten 
  los pasos desde la opción 5. 10. En todo caso, sea que el usuario gane, pierda o se retire, se informa al usuario los puntos que obtuvo y se finaliza el programa.
12. Al finalizar el juego, se continúa con un menú que tiene que ver con la persistencia de datos, las opciones son las sigientes:
 *1. Enviar usuario a la BD: Si se da esta opción, el usuario se crea en la BD.
 *2. Listar usuarios: Al dar la opción 2, se muestra la lista de usuarios que hay en la BD.
 *3. Eliminar usuario: Con esta opción, se solicita el id del usuario a eliminar y luego se elimina dicho usuario de la BD.
 *4. Editar usuario: Con esta opción, se solicita el id del usuario a editar y el nombre, con lo que se modifica el nombre del usuario.
 *5. Salir: Finaliza el programa.

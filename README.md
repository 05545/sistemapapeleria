# Sistema de punto de venta en papeleria 
## Proyecto de Programación Orientada a Objetos
## Generalidades

### Objetivo
El objetivo del proyecto es crear un sistema de punto de venta para la gestión de productos y ventas en una pappeleria.

### Características buscadas
1. Gestión de productos, inventario y usuarios (agregar, editar, eliminar y actualizar)
3. Procesamiento de ventas
4. Generación de reportes de ventas y stock
6. Interfaz de usuario amigable

## Convenciones de Nombres
- Para los botones usar el prefijo "btn" seguido del nombre descriptivo del botón. Por ejemplo
    ```java
    btnGuardar;
    btnSalir;
    btnConsultar;
    ```
- Para las variables y funciones (métodos) usar minusculas para la primera letra de la palabra. Si es de dos palabras usar primera letra en minuscula y segunda letra en mayuscula. Por ejemplo
    ```java
    public int numero; //Variable de un solo nombre
    public int numeroEjemplo; //Variable de dos nombres
    public void numero; //Método de un solo nombre 
    public int numeroEjemplo; //Método de dos nombres
    ```
  > Los nombres de las variables deben ser representativos y en toda la medida de lo posible evitar abreviaciones o similares. En caso de no ser posible agregar
  > comentario en la misma linea haciendo referencia al nombre completo de la variable y en donde se usa.
-  Para los campos de texto JText, aplican derivados, usar el prefijo "txt" seguido de un nombre representativo aplicando las convenciones de las variables. Por ejemplo
    ```java
    txtnombreUsuario; //Prefijo txt con la convencion de la variable de dos nombres
    txtcontrasenia; //Prefijo txt con la convencion de un solo nombre.
    ```
-  Para las clases usar mayusculas en la primera letra de cada palabra. Evitar usar guines bajos o combinaciones de signos. Por ejemplo:
    ```java
    InicioSesion; //Clase con dos nombres
    Conexion; //Clase con un nombre.
    ```
-  Para los JLabel o JPanel usar el prefijo de "JL_" para Labels y "JP_" para los paneles, etc. Seguido de un nombre descriptivo del elemento que se debe asignar en esa parte, considerando el paquete de recursos dispobible. Por ejemplo:
    ```java
    JL_ImagenInicioAdmin; 
    ```

## Convenciones de interfaz
Debido a que se hace el proyecto compartido y las rutas relativas no suelen funcionar bien en la implementación con NetBeans, además de la posible incompatibilidad entre
los sistemas operativos, se toman las siguientes consideraciones:
1. La interfaz será diseñada solo con las partes que proporciona Java/NetBeans, es decir, no se implmenta ningún elemento externo como imágenes, audios, etc.
2. Para el nombre de los JLabel, JPanel o similares, usar las convenciones anteriormente descritas.
3. Para las imagenes o recursos externos que se necesiten implementar será de forma local y tendrán que ser redimensionadas según sea necesario.
4. El tamaño de ventana será de 1920*1080.
5. El JFrame usado en cada pantalla debe estar configurado con "AbsoluteLayout".

## Convenciones generales
1. Una vez una clase, método o interfaz esté lista y probada subir al repositorio en la branch "Master". En caso de que no se haya probado y demostrado su correcto funcionamiento no implementar los cambios en el repositorio.
2. Cuando se encuentre funcional la parte del código necesaria agregar la nota "//No modificar" al inicio de la clase. O en su defecto, la(s) parte(s) del código necesaias.
3. En caso de que se requiera modificar o agregar lineas a una clase o método comentar las lineas que se han agregado explicando su uso y funcionamiento.

## Commits
### Nombre de los commits según su función
1. Cuando se ha documentado el código: commented "Nombre Clase o clases"
2. Cuando se ha actualizado el código: updated "Nombre Clase o clases"
3. Cuando se eliminan lineas de codigo: deleted "Nombre Clase y referencia a linea"
4. Cuando se agrega una clase: new "Clase o clases"

> Si se hacen varias operaciones de las anteriores, el commit debe llevar todos los detalles de los cambios. Por ejemplo si se elimina una clase y se actualiza otra, y se agregan en un mismo commit, se genera: deleted "Clase1.java", updated "CLase2.java"


















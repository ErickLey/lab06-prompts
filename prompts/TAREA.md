# Tarea: Mi prompt profesional

## Funcionalidad elegida
Registro de clientes en memoria con validación de datos básicos para un sistema de ventas.

## Version 1: prompt basico
```text
Crea un codigo en Java para registrar clientes.
```
* **Qué cambié:** Es la versión inicial sin detalles.
* **Por qué y qué mejoró:** Sirvió como punto de partida, pero la IA asumió los atributos por su cuenta y entregó un código genérico sin validaciones ni estructura clara.

## Version 2
```text
Actua como desarrollador backend en Java. Crea un programa para registrar clientes de un sistema de ventas web usando una clase Cliente con id, nombre, correo y telefono, validando que el correo sea valido.
```
* **Qué cambié:** Agregué **Rol** (desarrollador backend), **Contexto** (sistema de ventas web) e **Instrucción** específica con atributos y validación.
* **Por qué y qué mejoró:** Eliminó la ambigüedad sobre qué datos pedir y añadió lógica de negocio real (validación de correo), aunque el formato de salida y estilo de métodos seguía siendo libre.

## Version 3: prompt final
```text
Actua como desarrollador backend senior en Java. Crea una clase Cliente y un metodo para registrar nuevos clientes en memoria usando una lista (ArrayList) para un sistema de ventas web. La clase debe tener los atributos: id, nombre, correo y telefono, validando que el correo contenga un arroba (@) antes de guardarlo. Usa este estilo para los metodos de acceso: getNombre(), setNombre(String nombre). Restriccion: no uses librerias externas ni bases de datos, solo Java estandar. Explica brevemente las validaciones aplicadas y luego presenta el codigo completo comentado.
```
* **Qué cambié:** Incorporé **Ejemplos** (estilo de getters/setters), **Formato** (explicación previa + código comentado) y una **Restricción** explícita (sin librerías externas ni BD).
* **Por qué y qué mejoró:** Garantizó un código 100% ejecutable sin dependencias extra, siguiendo exactamente la convención de nombres requerida y con una explicación estructurada.

## Componentes del prompt final
| Componente | Texto en mi prompt final |
| --- | --- |
| Rol | Actua como desarrollador backend senior en Java. |
| Instruccion | Crea una clase Cliente y un metodo para registrar nuevos clientes en memoria usando una lista (ArrayList) con los atributos id, nombre, correo y telefono, validando que el correo contenga un arroba (@). |
| Contexto | para un sistema de ventas web |
| Ejemplo | Usa este estilo para los metodos de acceso: getNombre(), setNombre(String nombre). |
| Formato | Explica brevemente las validaciones aplicadas y luego presenta el codigo completo comentado. |
| Restriccion | Restriccion: no uses librerias externas ni bases de datos, solo Java estandar. |

## Evaluacion del resultado
| Criterio | Cumple (Si / No) |
| --- | --- |
| Incluye la clase Cliente con los 4 atributos exactos | Si |
| Valida que el correo contenga '@' antes de registrar | Si |
| Respeta el estilo de getters y setters indicado | Si |
| No utiliza librerías externas ni conexiones a BD | Si |
| Presenta la explicación antes del código comentado | Si |

## Errores que evite
* **Ser demasiado general / No dar contexto:** En lugar de pedir solo "registrar clientes", especifiqué desde la V2 que es para un sistema de ventas web en memoria con `ArrayList`, evitando que la IA inventara interfaces gráficas o conexiones innecesarias.
* **No indicar el formato ni restricciones:** Evité recibir código desordenado o con frameworks externos (como Spring Boot o Lombok) exigiendo Java estándar y una estructura de respuesta en dos partes (explicación + código).
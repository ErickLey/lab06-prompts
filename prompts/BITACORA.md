# Bitacora de prompts

Laboratorio 06: Fundamentos de Ingenieria de Prompts. 
Herramienta de IA usada: (Gemini)
## Ejercicio 2: Tokens y ventana de contexto
| Texto | Caracteres | Tokens |
|---|---|---|
| Los estudiantes programan en Java. |34|7|
| The students program in Java. |29|6|
| desafortunadamente |18|4|
En el primer chat la IA respondió bien porque los datos seguían en su ventana de contexto. En el chat nuevo falló porque esa ventana inició vacía, demostrando que no hay memoria entre conversaciones.
## Ejercicio 3: Temperatura
| Temperatura | % de BiblioTec | Nombres en los 5 intentos |
| --- | --- | --- |
| 0 | 100.0% | BiblioTec, BiblioTec, BiblioTec, BiblioTec, BiblioTec |
| 0.5 | 93.3% | BiblioTec, BiblioTec, BiblioTec, BiblioTec, BiblioTec |
| 1 | 69.5% | BiblioTec, BiblioTec, BiblioTec, BiblioTec, BiblioTec |
| 1.8 | 47.7% | BiblioTec, PrestaLibros, PrestaLibros, BiblioTec, BiblioTec |

Al subir la temperatura, las probabilidades se reparten y aumentan las opciones variadas en lugar de repetir siempre la favorita. Sin embargo, nunca inventa un nombre nuevo porque la temperatura solo altera el azar al elegir dentro de su lista predefinida de opciones.
## Ejercicio 4: Prompt vago vs estructurado 
| Criterio | Prompt vago | Prompt estructurado |
| --- | --- | --- |
| Menciona el objetivo del sistema | No | Si |
| Menciona a los usuarios principales | No | Si |
| Tiene exactamente 3 funcionalidades | No | Si |
| Está en 3 párrafos | No | Si |
| Usa lenguaje profesional / formato real | No | Si |
## Ejercicio 5: Anatomia de un prompt
| Componente | Texto de mi prompt |
| --- | --- |
| Rol | Actua como desarrollador Java. |
| Instruccion | Crea un programa en Java usando una clase Producto con los atributos codigo, nombre, precio y stock. |
| Contexto | para gestionar los productos de una tienda |
| Ejemplo | Usa este estilo para los metodos: getPrecio(), setPrecio(double precio). |
| Formato | Explica primero la estructura de la clase y luego presenta el codigo Java. |

* **Nivel 1:** Generó un programa genérico e impredecible (como un "Hola mundo" o una calculadora).
* **Nivel 2:** Adoptó un enfoque más técnico y buenas prácticas de desarrollo al asignarle el rol.
* **Nivel 3:** Orientó toda la lógica y variables específicamente hacia el inventario de una tienda.
* **Nivel 4:** Restringió la implementación creando exactamente la clase `Producto` con los 4 atributos pedidos.
* **Nivel 5:** Estructuró la salida presentando primero la explicación teórica y luego el bloque de código ordenado.

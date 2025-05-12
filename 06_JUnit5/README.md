# JUnit

Para alcanzar los resultados deseados de forma rápida se requiere un framework de prueba. JUnit es un framework bastante bueno para realizar y automatizar estas pruebas en Java.

Una prueba unitaria se caracteriza por realizar una comparación del resultado 
esperado de un método con lo retornado por la codificación de dicho método.  

Esta comparación puede ser con cualquier tipo de dato o conjunto de datos, ya 
sean numéricos, textos, booleanos o incluso una excepción de programación esperada.  
El único requisito para que una prueba unitaria resulte efectiva es que tenga únicamente dos posibilidades de resolución (correcta/incorrecta). 

Con las pruebas unitarias podemos comparar el resultado aislado de un método, como el cálculo de una fórmula matemática que nos retorne un único dato estático.  
Pero también podemos realizar pruebas enviando una serie de datos parametrizados, sometiendo al método a realizar operaciones con diferentes rangos y así comprobar su correcto funcionamiento en diferentes situaciones.

## Características

JUnit es un framework de código abierto que se utiliza para escribir y ejecutar pruebas.

* Proporciona una anotación para identificar los métodos de ensayo.

* Proporciona aserciones para resultados esperados del análisis.

* Proporciona clases para la ejecución de pruebas o ejecutores de pruebas.

## Instalación

JUnit4 no viene incluido en el JRE 1.8 por lo que hay que añadirlo al classpath.  
Para crear un modulo JUnit4 en Eclipse:

* boton derecho -> new -> JUnit Test Case

Si no tenemos JUnit4 add al proyecto, Eclipse nos preguntará.  
Para añadirlo, debemos de elegir la opción JUnit4

Tambien se creo la carpeta test y se metio en el classpath
# 🧠 Módulo Java — Repaso Personal

---

## 📁 Estructura del Repositorio

- `00_basico/`: Fundamentos de Java
- `01_POO/`: Programación Orientada a Objetos
- `02_intermedio/`: Temas intermedios
- `03_Genericos/`: Uso de genéricos
- `04_Depuracion/`: Técnicas de depuración
- `05_Librerias/`: Uso de librerías externas
- `06_JUnit5/`: Pruebas unitarias con JUnit 5
- `07_Hilos/`: Programación concurrente
- `08_Shocket/`: Comunicación en red con sockets

---

## 🧰 Java Básico (`00_basico/`)

###🔹Conceptos Clave

- Tipos de datos primitivos: `int`, `double`, `char`, `boolean`
- Estructuras de control: `if`, `else`, `switch`, bucles `for`, `while`, `do-while`
- Arrays: Declaración y manipulación de arreglos unidimensionales y multidimensionales
- Entrada y salida: Uso de `Scanner` y `System.out`

### 📌 Ejemplo de Código

```java

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
    }
}
```

🖼️ Infografía de Sintaxis Básica

🧱 Programación Orientada a Objetos (01_POO/)
###🔹Conceptos Clave

   - Clases y objetos: definición y uso

   - Encapsulamiento: private, public, protected

   - Herencia: extends

   - Polimorfismo: sobrescritura de métodos

   - Constructores

📌 Ejemplo de Código

```java

public class Animal {
    public void hacerSonido() {
        System.out.println("Sonido de animal");
    }
}

```

```java
public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}

```

---

# 🖼️ Diagrama de Clases

## 🧪 Pruebas Unitarias con JUnit 5 (06_JUnit5/)
###🔹Conceptos Clave

   - Anotaciones: @Test, @BeforeEach, @AfterEach

   - Asserts: assertEquals, assertTrue, etc.

   - Organización de pruebas

📌 Ejemplo de Código

```java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }
}

```

## 🧵 Programación Concurrente (07_Hilos/)
###🔹Conceptos Clave

  - Hilos: clase Thread, interfaz Runnable

   - Sincronización: synchronized

- Comunicación entre hilos: wait(), notify(), notifyAll()

📌 Ejemplo de Código

```java

public class MiHilo extends Thread {
    public void run() {
        System.out.println("Hilo en ejecución");
    }
}

```

```java

public class Principal {
    public static void main(String[] args) {
        MiHilo hilo = new MiHilo();
        hilo.start();
    }
}

```

---

## 🌐 Comunicación en Red con Sockets (08_Shocket/)
###🔹Conceptos Clave

   - Sockets : cliente-servidor

  - Streams: InputStream, OutputStream

   - Excepciones de red

📌 Ejemplo de Código

```java

import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hola servidor");
        socket.close();
    }
}

```

---

## 📚 Recursos Recomendados

Para profundizar en estos temas, recomiendo estos libros:

    Java Básico

        Java: A Beginner's Guide — Herbert Schildt

        Programación en Java para principiantes

    POO en Java

        Head First Java — Kathy Sierra y Bert Bates

        Effective Java — Joshua Bloch

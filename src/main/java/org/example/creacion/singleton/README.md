**Definición del Patrón Singleton:**

El patrón Singleton es un patrón de diseño creacional que garantiza que una clase tiene una única instancia y proporciona un punto de acceso global a esa instancia. Este patrón asegura que una clase tenga solo una instancia y proporciona un método para acceder a esa instancia desde cualquier punto del programa.

**Estructura del Patrón:**

El patrón Singleton involucra las siguientes componentes:

1. **Singleton (Clase Singleton):** La clase que tiene una única instancia. Esta clase controla la creación de su propia instancia única y proporciona un método para acceder a esa instancia.

2. **Instancia Única:** La única instancia de la clase Singleton que se crea y se comparte globalmente.

**Diagrama UML:**

```plaintext
+------------------------+
|        Singleton       |
+------------------------+
| -instance: Singleton   |
+------------------------+
| +getInstance(): Singleton|
+------------------------+
```

**Características clave:**

1. **Única Instancia:** La clase Singleton tiene una única instancia que es compartida en toda la aplicación.

2. **Acceso Global:** Proporciona un método para acceder a la instancia única desde cualquier parte del código.

3. **Control de Creación:** La clase Singleton controla la creación de su propia instancia, garantizando que solo haya una.


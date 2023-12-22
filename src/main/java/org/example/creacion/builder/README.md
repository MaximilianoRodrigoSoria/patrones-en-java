**Definición del Patrón Builder:**

El patrón Builder es un patrón de diseño creacional que se utiliza para construir un objeto complejo paso a paso. Este patrón separa la construcción de un objeto de su representación, permitiendo que el mismo proceso de construcción pueda crear diferentes representaciones.

**Estructura del Patrón:**

El patrón Builder involucra las siguientes componentes:

1. **Director (Director):** Clase que orquesta el proceso de construcción utilizando un objeto Builder.

2. **Builder (Constructor):** Interfaz o clase abstracta que declara los métodos necesarios para construir cada parte del producto.

3. **ConcreteBuilder (ConstructorConcreto):** Implementa la interfaz Builder y proporciona la implementación concreta para construir y ensamblar las partes del producto.

4. **Product (Producto):** Representa el objeto complejo que se está construyendo. La clase puede ser una clase abstracta o una interfaz.

5. **Client (Cliente):** Utiliza el Director para construir el objeto complejo a través de la interfaz Builder.

**Diagrama UML:**

```plaintext
+-------------+       +----------------+       +-----------------+
|   Director  |------>|    Builder     |<------| ConcreteBuilder |
+-------------+       +----------------+       +-----------------+
| construct() |       | buildPartA()   |       | buildPartA()    |
| getProduct()|       | buildPartB()   |       | buildPartB()    |
+-------------+       | getResult()    |       | getResult()     |
                     +----------------+       +-----------------+
                                |                          |
                                v                          v
                          +--------------+            +------------------+
                          |   Product    |            |   AnotherProduct  |
                          +--------------+            +------------------+
                          | partA        |            |  partA           |
                          | partB        |            |  partB           |
                          +--------------+            +------------------+
```

**Características clave:**

1. **Separación de la construcción y representación:** El proceso de construcción se separa de la representación final del objeto, permitiendo diferentes representaciones del mismo proceso de construcción.

2. **Fluidez en la construcción:** Los métodos del Builder pueden ser encadenados para crear un objeto de manera más legible y expresiva.

**Ventajas del Patrón Builder:**

1. **Flexibilidad:** Permite construir objetos complejos con diferentes representaciones.

2. **Legibilidad:** Facilita la creación de objetos con una sintaxis más clara y legible.

3. **Reusabilidad:** Puede reutilizar los mismos pasos de construcción para crear diferentes objetos.

El patrón Builder es útil cuando la creación de un objeto implica una serie de pasos complicados o cuando se requiere la construcción de objetos con diferentes configuraciones.
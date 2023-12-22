**Definición del Patrón Prototype:**

El patrón Prototype es un patrón de diseño creacional que se utiliza para crear nuevos objetos duplicando un objeto existente, conocido como prototipo. El objetivo es crear nuevos objetos copiando un objeto existente, evitando así la creación costosa desde cero.

**Estructura del Patrón:**

El patrón Prototype involucra las siguientes componentes:

1. **Prototype (Prototipo):** Interfaz o clase abstracta que declara un método para clonarse a sí mismo. Este es el objeto que será duplicado.

2. **ConcretePrototype (PrototipoConcreto):** Implementa la interfaz Prototype y proporciona la implementación concreta para el método de clonación.

3. **Client (Cliente):** Crea nuevos objetos solicitando al prototipo que se clone.

**Diagrama UML:**

```plaintext
+-------------+         +---------------------+
|  Prototype  | <----- |  ConcretePrototype  |
+-------------+         +---------------------+
|  clone()    |         |  clone()            |
+-------------+         +---------------------+
         \                             /
          \                           /
           \                         /
            v                       v
+------------------+    +------------------+
|      Client      |    |    Client        |
+------------------+    +------------------+
| createObject()   |    | createObject()   |
|                 \|/  |                 \|/
|     prototype.clone()|  |prototype.clone() |
+----------------------+  +------------------+

**Definición del Patrón Abstract Factory en Java:**

El patrón Abstract Factory es otro patrón de diseño creacional que proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas. Este patrón se utiliza cuando se necesita garantizar que los productos creados sean compatibles entre sí y pertenezcan a la misma familia.

**Estructura del Patrón:**

El patrón Abstract Factory involucra las siguientes componentes:

1. **AbstractFactory (FábricaAbstracta):** Declara interfaces para la creación de familias de productos abstractos.

2. **ConcreteFactory (FábricaConcreta):** Implementa las interfaces definidas por AbstractFactory para crear productos concretos.

3. **AbstractProduct (ProductoAbstracto):** Declara la interfaz de un tipo de producto.

4. **ConcreteProduct (ProductoConcreto):** Implementa la interfaz definida por AbstractProduct para un tipo específico de producto.

5. **Client (Cliente):** Utiliza las interfaces declaradas en AbstractFactory y AbstractProduct para interactuar con los productos concretos.

**Diagrama UML:**

```plaintext
+------------------+       +------------------+
| AbstractFactory  |       | AbstractProduct  |
+------------------+       +------------------+
| createProductA() |<----->|   operationA()   |
| createProductB() |       +------------------+
+------------------+              / \
          |                     /   \
          |                    /     \
          v                   /       \
+------------------+       +------------------+
| ConcreteFactory1 |       | ConcreteProductA1|
+------------------+       +------------------+
| createProductA() |       |   operationA()   |
| createProductB() |       +------------------+
+------------------+       +------------------+
                           | ConcreteProductB1|
                           +------------------+
                           |   operationB()   |
                           +------------------+
```


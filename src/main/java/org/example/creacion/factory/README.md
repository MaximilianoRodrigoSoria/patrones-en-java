

# Factory Method

**Definición del Patrón Factory Method en Java:**

El patrón Factory Method es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, pero permite a las subclases alterar el tipo de objetos que se crearán. Este patrón se encuadra dentro de la categoría de creación de objetos, brindando flexibilidad al sistema al delegar la responsabilidad de instanciación a las clases derivadas.

**Estructura del Patrón:**

El patrón Factory Method involucra las siguientes componentes:

1. **Product (Producto):** Define la interfaz de los objetos que el método de fábrica crea.

2. **ConcreteProduct (ProductoConcreto):** Implementa la interfaz definida por el Product.

3. **Creator (Creador):** Declara el método de fábrica abstracto que las subclases deben implementar para producir instancias de Product.

4. **ConcreteCreator (CreadorConcreto):** Implementa el método de fábrica para devolver una instancia concreta de ConcreteProduct.

**Diagrama UML:**

```plaintext
+------------------+       +------------------+
|    Creator       |       |     Product      |
+------------------+       +------------------+
|  FactoryMethod() |<------|  Operation()     |
+------------------+       +------------------+
           |
           |
           v
+------------------+
| ConcreteCreator  |
+------------------+
| FactoryMethod()  |
+------------------+
           |
           |
           v
+------------------+
| ConcreteProduct  |
+------------------+
|  Operation()     |
+------------------+
```
# Diagrama de Clases - Sistema de Gestión de Ventas

## 1. Objetivo

Representar la estructura de las clases utilizadas en el Sistema de Gestión
de Ventas, mostrando sus atributos, métodos y relaciones.

## 2. Clases del sistema

El proyecto AA1 está compuesto por tres clases principales:

- `Producto`
- `Venta`
- `Main`

## 3. Diagrama de Clases

```mermaid
classDiagram

    class Producto {
        -String nombre
        -double precio
        -int cantidad
        +Producto()
        +Producto(String nombre, double precio, int cantidad)
        +String getNombre()
        +void setNombre(String nombre)
        +double getPrecio()
        +void setPrecio(double precio)
        +int getCantidad()
        +void setCantidad(int cantidad)
    }

    class Venta {
        -String nombreCliente
        -Producto producto
        -double subtotal
        -double porcentajeDescuento
        -double montoDescuento
        -double total
        -String categoriaVenta
        +Venta()
        +Venta(String nombreCliente, Producto producto, double subtotal, double porcentajeDescuento, double montoDescuento, double total, String categoriaVenta)
        +String getNombreCliente()
        +void setNombreCliente(String nombreCliente)
        +Producto getProducto()
        +void setProducto(Producto producto)
        +double getSubtotal()
        +void setSubtotal(double subtotal)
        +double getPorcentajeDescuento()
        +void setPorcentajeDescuento(double porcentajeDescuento)
        +double getMontoDescuento()
        +void setMontoDescuento(double montoDescuento)
        +double getTotal()
        +void setTotal(double total)
        +String getCategoriaVenta()
        +void setCategoriaVenta(String categoriaVenta)
    }

    class Main {
        +main(String[] args)
    }

    Venta --> Producto : contiene
    Main --> Producto : crea
    Main --> Venta : crea
```

## 4. Descripción de las clases

### Producto

La clase `Producto` representa el producto que participa en la venta.

Contiene:

- Nombre del producto.
- Precio unitario.
- Cantidad.

Los atributos son privados para aplicar el principio de encapsulamiento.

---

### Venta

La clase `Venta` representa la información relacionada con una operación
de venta.

Contiene:

- Nombre del cliente.
- Producto asociado.
- Subtotal.
- Porcentaje de descuento.
- Monto del descuento.
- Total.
- Categoría de la venta.

La clase utiliza un objeto `Producto` para representar el producto vendido.

---

### Main

La clase `Main` contiene el método `main`, que representa el punto de entrada
del programa.

Su función principal es ejecutar el sistema, solicitar los datos necesarios
y mostrar el resultado de la venta.

## 5. Relación entre las clases

La relación principal del sistema es:

```text
Main
 │
 ├── crea ──→ Producto
 │
 └── crea ──→ Venta
                 │
                 └── contiene ──→ Producto
```

## 6. Encapsulamiento

Los atributos de `Producto` y `Venta` se encuentran definidos como `private`.

El acceso a estos atributos se realiza mediante métodos `get` y `set`.

Ejemplo:

```java
private String nombre;
```

El atributo puede ser consultado mediante:

```java
getNombre()
```

y modificado mediante:

```java
setNombre()
```

Esto permite aplicar el concepto de **encapsulamiento de la Programación
Orientada a Objetos**.

## 7. Conclusión

El diagrama representa la estructura básica del Sistema de Gestión de Ventas
para la AA1 utilizando únicamente las clases implementadas en el proyecto:

```text
Producto.java
Venta.java
Main.java
```

No se utilizan clases adicionales en esta primera versión del proyecto.
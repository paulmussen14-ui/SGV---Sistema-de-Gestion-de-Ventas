# Pseudocódigo del Sistema de Gestión de Ventas

## 1. Producto

### Objetivo

Crear un objeto Producto y almacenar los datos necesarios para una venta.

### Pseudocódigo

```text
ALGORITMO CrearProducto

    DEFINIR nombre COMO CADENA
    DEFINIR precio COMO REAL
    DEFINIR cantidad COMO ENTERO

    ESCRIBIR "Ingrese nombre del producto:"
    LEER nombre

    ESCRIBIR "Ingrese precio del producto:"
    LEER precio

    ESCRIBIR "Ingrese cantidad:"
    LEER cantidad

    CREAR Producto
    ASIGNAR nombre AL Producto
    ASIGNAR precio AL Producto
    ASIGNAR cantidad AL Producto

FIN ALGORITMO
```

---

# 2. Venta

## 2.1 Calcular subtotal

### Objetivo

Calcular el subtotal utilizando el precio y la cantidad del producto.

### Pseudocódigo

```text
ALGORITMO CalcularSubtotal

    subtotal ← producto.precio × producto.cantidad

FIN ALGORITMO
```

---

## 2.2 Determinar descuento

### Objetivo

Determinar el porcentaje de descuento según el subtotal de la venta.

### Pseudocódigo

```text
ALGORITMO DeterminarDescuento

    SI subtotal < 100 ENTONCES

        porcentajeDescuento ← 0

    SINO SI subtotal < 300 ENTONCES

        porcentajeDescuento ← 0.05

    SINO SI subtotal < 500 ENTONCES

        porcentajeDescuento ← 0.10

    SINO

        porcentajeDescuento ← 0.15

    FIN SI

    montoDescuento ← subtotal × porcentajeDescuento

FIN ALGORITMO
```

---

## 2.3 Calcular total

### Objetivo

Obtener el importe final de la venta después de aplicar el descuento.

### Pseudocódigo

```text
ALGORITMO CalcularTotal

    total ← subtotal - montoDescuento

FIN ALGORITMO
```

---

## 2.4 Clasificar venta

### Objetivo

Clasificar la venta según el total obtenido.

### Pseudocódigo

```text
ALGORITMO ClasificarVenta

    SI total < 100 ENTONCES

        categoriaVenta ← "Venta pequeña"

    SINO SI total < 500 ENTONCES

        categoriaVenta ← "Venta mediana"

    SINO

        categoriaVenta ← "Venta grande"

    FIN SI

FIN ALGORITMO
```

---

# 3. Main

## 3.1 Solicitar datos

### Objetivo

Solicitar al usuario los datos necesarios para procesar la venta.

### Pseudocódigo

```text
ALGORITMO SolicitarDatos

    ESCRIBIR "Ingrese nombre del cliente:"
    LEER nombreCliente

    ESCRIBIR "Ingrese nombre del producto:"
    LEER nombreProducto

    ESCRIBIR "Ingrese precio del producto:"
    LEER precio

    ESCRIBIR "Ingrese cantidad:"
    LEER cantidad

FIN ALGORITMO
```

---

## 3.2 Crear Producto

```text
ALGORITMO CrearObjetoProducto

    producto ← NUEVO Producto(
        nombreProducto,
        precio,
        cantidad
    )

FIN ALGORITMO
```

---

## 3.3 Crear Venta

```text
ALGORITMO CrearObjetoVenta

    venta ← NUEVA Venta()

    venta.nombreCliente ← nombreCliente
    venta.producto ← producto

FIN ALGORITMO
```

---

## 3.4 Procesar Venta

```text
ALGORITMO ProcesarVenta

    venta.calcularSubtotal()

    venta.calcularDescuento()

    venta.calcularTotal()

    venta.clasificarVenta()

FIN ALGORITMO
```

---

## 3.5 Mostrar resultados

```text
ALGORITMO MostrarResultados

    ESCRIBIR "=============================="
    ESCRIBIR " RESUMEN DE VENTA"
    ESCRIBIR "=============================="

    ESCRIBIR "Cliente: ", venta.nombreCliente
    ESCRIBIR "Producto: ", venta.producto.nombre
    ESCRIBIR "Precio unitario: ", venta.producto.precio
    ESCRIBIR "Cantidad: ", venta.producto.cantidad
    ESCRIBIR "Subtotal: ", venta.subtotal
    ESCRIBIR "Descuento: ", venta.porcentajeDescuento
    ESCRIBIR "Monto descuento: ", venta.montoDescuento
    ESCRIBIR "Total: ", venta.total
    ESCRIBIR "Categoria: ", venta.categoriaVenta

FIN ALGORITMO
```

---

# 4. Flujo principal

El funcionamiento general del sistema será:

```text
INICIO
    ↓
Solicitar datos
    ↓
Crear Producto
    ↓
Crear Venta
    ↓
Calcular subtotal
    ↓
Determinar descuento
    ↓
Calcular total
    ↓
Clasificar venta
    ↓
Mostrar resultados
    ↓
FIN
```

---

# 5. Relación con las clases Java

| Clase | Responsabilidad |
|---|---|
| `Producto` | Almacenar nombre, precio y cantidad |
| `Venta` | Calcular subtotal, descuento, total y categoría |
| `Main` | Solicitar datos, crear objetos y mostrar resultados |

## 6. Resultado

El pseudocódigo representa la lógica implementada en las tres clases del
proyecto:

```text
Producto.java
Venta.java
Main.java
```

No se requieren clases adicionales para la versión correspondiente a AA1.
package sgv;

import sgv.modelo.Producto;
import sgv.modelo.Venta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=".repeat(30));
        System.out.println(" SISTEMA DE GESTION DE VENTAS");
        System.out.println("=".repeat(30));

        // Entrada de datos
        System.out.print("Ingrese nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Ingrese precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese cantidad: ");
        int cantidad = scanner.nextInt();

        // Crear objeto Producto
        Producto producto = new Producto(
                nombreProducto,
                precio,
                cantidad
        );

        // Crear objeto Venta
        Venta venta = new Venta();

        venta.setNombreCliente(nombreCliente);
        venta.setProducto(producto);

        // Procesar venta
        venta.calcularSubtotal();
        venta.calcularDescuento();
        venta.calcularTotal();
        venta.clasificarVenta();

        // Mostrar resultados
        System.out.println();
        System.out.println("=".repeat(30));
        System.out.println(" RESUMEN DE VENTA");
        System.out.println("=".repeat(30));

        System.out.println("Cliente: " + venta.getNombreCliente());
        System.out.println("Producto: " + venta.getProducto().getNombre());

        System.out.printf(
                "Precio unitario: S/ %.2f%n",
                venta.getProducto().getPrecio()
        );

        System.out.println(
                "Cantidad: " + venta.getProducto().getCantidad()
        );

        System.out.printf(
                "Subtotal: S/ %.2f%n",
                venta.getSubtotal()
        );

        System.out.printf(
                "Descuento: %.0f%%%n",
                venta.getPorcentajeDescuento() * 100
        );

        System.out.printf(
                "Monto descuento: S/ %.2f%n",
                venta.getMontoDescuento()
        );

        System.out.printf(
                "Total: S/ %.2f%n",
                venta.getTotal()
        );

        System.out.println(
                "Categoria: " + venta.getCategoriaVenta()
        );

        System.out.println("=".repeat(30));

        scanner.close();
    }
}
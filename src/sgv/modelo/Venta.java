package sgv.modelo;

public class Venta {

    private String nombreCliente;
    private Producto producto;

    private double subtotal;
    private double porcentajeDescuento;
    private double montoDescuento;
    private double total;

    private String categoriaVenta;

    // Constructor vacío
    public Venta() {

    }

    // Constructor con parámetros
    public Venta(
            String nombreCliente,
            Producto producto,
            double subtotal,
            double porcentajeDescuento,
            double montoDescuento,
            double total,
            String categoriaVenta) {

        this.nombreCliente = nombreCliente;
        this.producto = producto;
        this.subtotal = subtotal;
        this.porcentajeDescuento = porcentajeDescuento;
        this.montoDescuento = montoDescuento;
        this.total = total;
        this.categoriaVenta = categoriaVenta;
    }

    // Calcular subtotal
    public void calcularSubtotal() {
        subtotal = producto.getPrecio() * producto.getCantidad();
    }

    // Calcular descuento
    public void calcularDescuento() {

        if (subtotal < 100) {
            porcentajeDescuento = 0;
        } else if (subtotal < 300) {
            porcentajeDescuento = 0.05;
        } else if (subtotal < 500) {
            porcentajeDescuento = 0.10;
        } else {
            porcentajeDescuento = 0.15;
        }

        montoDescuento = subtotal * porcentajeDescuento;
    }

    // Calcular total
    public void calcularTotal() {
        total = subtotal - montoDescuento;
    }

    // Clasificar venta
    public void clasificarVenta() {

        if (total < 100) {
            categoriaVenta = "Venta pequeña";
        } else if (total < 500) {
            categoriaVenta = "Venta mediana";
        } else {
            categoriaVenta = "Venta grande";
        }
    }

    // Getters y Setters

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getMontoDescuento() {
        return montoDescuento;
    }

    public void setMontoDescuento(double montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCategoriaVenta() {
        return categoriaVenta;
    }

    public void setCategoriaVenta(String categoriaVenta) {
        this.categoriaVenta = categoriaVenta;
    }
}
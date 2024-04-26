package org.example;

import java.util.ArrayList;

public class Factura {
    private int numeroFactura;
    private Cliente cliente;
    private ArrayList<Producto> productos;


    public Factura(int numeroFactura, Cliente cliente) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    // Método agregar producto factura
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método calc total factura
    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        // recordatorio añadir formulas en el metodo
      // implemnetar logica

        return total;
    }
    //etc..
}

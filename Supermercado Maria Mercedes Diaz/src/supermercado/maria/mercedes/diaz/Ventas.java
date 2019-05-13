/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.maria.mercedes.diaz;

import java.util.*;
public class Ventas {
    private Producto producto;
   private Date fecha_venta;
   private double costo_venta;
   private String registro;
   private int cantidad;

    public Date getFecha_venta() {
        return fecha_venta;
    }
    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getCosto_venta() {
        return costo_venta;
    }
    public void setCosto_venta(double costo_venta) {
        this.costo_venta = costo_venta;
    }
    

    public Ventas(Producto producto,int cantidad,double costo_venta) {
        this.cantidad=cantidad;
        this.costo_venta=costo_venta;
        this.producto = producto;
        this.fecha_venta = new Date();
        this.registro = "Se vendio"+" "+cantidad+" "+"de"+" "+producto.getNombre()+" "+"a un costo de"+" "+costo_venta +" "+"del proveedor"+" "+this.producto.getProveedor().getNombre()+". Fecha:"+this.fecha_venta.toString();
    }
    

  
    
    
   
}
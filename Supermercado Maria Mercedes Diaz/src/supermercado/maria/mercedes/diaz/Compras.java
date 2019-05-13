/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.maria.mercedes.diaz;

import java.util.*;
public class Compras {
   private Producto producto;
   private double costo_compra;
   private Date fecha_compra;
   private String registro;
   private int cantidad;

    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public double getCosto_compra() {
        return costo_compra;
    }
    public void setCosto_compra(double costo_compra) {
        this.costo_compra = costo_compra;
    }
    public Date getFecha_compra() {
        return fecha_compra;
    }
    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
   

    public Compras(Producto producto,int cantidad,double costo_compra) {
        this.costo_compra=costo_compra;
        this.producto = producto;
        this.fecha_compra = new Date();
        this.cantidad=cantidad;
        if(this.producto.getProveedor()!=null){
        this.registro = "Se compro"+" "+cantidad+" "+"de"+" "+producto.getNombre()+ " "+"a un costo de"+" "+this.costo_compra+" "+"al proveedor"+" "+this.producto.getProveedor().getNombre()+".Fecha:"+this.fecha_compra.toString();
        }
    }


   
   
    
    
}

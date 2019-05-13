/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.maria.mercedes.diaz;

import java.util.*;
public class Producto {

    private String nombre;
    private Proveedor proveedor;
    private double costo_compra;
    private final Date fecha_compra;
    
  


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public double getCosto_compra() {
        return costo_compra;
    }
    public void setCosto_compra(double costo_compra) {
        if(costo_compra>=0){
        this.costo_compra = costo_compra;
        }
    }
    public Date getFecha_compra() {
        return fecha_compra;
    }


    public Producto(String nombre,double costo_compra, Proveedor proveedor) {
        this.nombre = nombre;
        this.costo_compra = costo_compra;
        this.proveedor=proveedor;
        this.fecha_compra=new Date();
    }
    
    
    
    
    
}

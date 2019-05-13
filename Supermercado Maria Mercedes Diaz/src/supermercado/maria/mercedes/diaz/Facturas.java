/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.maria.mercedes.diaz;

import java.util.*;
public class Facturas {

    private double deuda;
    private Date fecha_factura;
    public Proveedor proveedor;
    private Date fecha_vencimiento;
    
    public double getDeuda() {
        return deuda;
    }
    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
    public Date getFecha_factura() {
        return fecha_factura;
    }
    public void setFecha_factura(Date fecha_factura) {
        this.fecha_factura = fecha_factura;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }
    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
    
    

    public Facturas(Proveedor proveedor, double deuda, Date fecha_vencimiento) {
        this.deuda = deuda;
        this.fecha_factura = new Date();
        this.proveedor=proveedor;
        this.fecha_vencimiento=fecha_vencimiento;
    } 
    
}

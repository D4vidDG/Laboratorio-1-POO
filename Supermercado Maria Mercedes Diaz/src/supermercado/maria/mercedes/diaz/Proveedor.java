/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.maria.mercedes.diaz;


public class Proveedor {
    private String nombre;
    private String direccion;
    private double telefono;
   


    public  String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public double getTelefono() {
        return telefono;
    }
    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }
    

    public Proveedor(String nombre, String direccion, double telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
       
}
}

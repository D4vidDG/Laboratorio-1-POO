/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion_composicion;

/**
 *
 * @author usuario
 */
public class Eje {
    private String marca;
    private Llanta [] llantas;
    private Motor motor;

    public String getMarca() {
        return marca;
    }
    public Llanta[] getllantas() {
        return llantas;
    }
    public Motor getmotor() {
        return motor;
    }
    

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setllantas(Llanta[] eje_llantas) {
        this.llantas = eje_llantas;
    }
    public void setmotor(Motor motor) {
        this.motor = motor;
    }
    public Eje(String marca) {
        this.marca = marca;
    }
    


    
    
    
    
    
    
    
    
    
    
}

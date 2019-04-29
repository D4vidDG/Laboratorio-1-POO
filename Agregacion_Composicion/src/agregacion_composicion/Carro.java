
package agregacion_composicion;

public class Carro {
    private String placa;
    private String marca;
    private Llanta [][] llantas;
    private Eje [] ejes;
    Motor motor;
    
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public Llanta[][] getLlantas() {
        return llantas;
    }
    public Eje[] getEjes() {
        return ejes;
    }
    public Motor getMotor() {
        return motor;
    }

    
   
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setLlantas(Llanta[][] llantas) {
        this.llantas = llantas;
    }
    public void setEjes(Eje[] ejes) {
        this.ejes = ejes;
    }

    public Carro(String placa, String marca, Llanta[][] llantas, Eje[] ejes) {
        this.placa = placa;
        this.marca = marca;
        this.llantas = llantas;
        this.ejes = ejes;
        this.motor=new Motor ();
    }

   public void mostrarCarro (){
  
   }
    
    
    
    
    
}

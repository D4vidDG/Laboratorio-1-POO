
package agregacion_composicion;

public class Ejes {
    private String marca;
    private Motor motor;
    private Llantas [] llantas;
    
    

    public String getMarca() {
        return marca;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Llantas[] getLlantas1(){
        return llantas1;
    }
    public void setLlantas1(Llantas[] llantas1) {
        this.llantas1 = llantas1;
    }

    public Ejes(String marca, Motor motor, Llantas[] llantas) {
        this.marca = marca;
        this.motor = motor; 
        this.llantas = llantas;
    } 
}

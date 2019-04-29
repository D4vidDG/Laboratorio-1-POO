
package agregacion_composicion;


public class Motor {
    private int potencia;
    private Eje eje_motor;

    public int getPotencia() {
        return potencia;
    }
    public Eje getEje_motor() {
        return eje_motor;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public void setEje_motor(Eje eje_motor) {
        this.eje_motor = eje_motor;
    }

   
}

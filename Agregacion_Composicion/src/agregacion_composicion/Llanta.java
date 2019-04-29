
package agregacion_composicion;

public class Llanta {
    private String marca;
    private double diametro;

    public String getMarca() {
        return marca;
    }
    public double getDiametro() {
        return diametro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public Llanta(String marca, double diametro) {
        this.marca = marca;
        this.diametro = diametro;
    }
    
    
    
}

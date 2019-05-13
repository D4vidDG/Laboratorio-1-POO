
package supermercado.maria.mercedes.diaz;
import java.util.*;
public class Empleados {
    private String nombre;
    private String apellido;
    private int numero_de_horas;
    public double nomina;
    private int entrada;
    private int salida;
    private int horas_extra;
    private int horas_diarias;

    public Empleados(String nombre, String apellido, int entrada, int salida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.entrada = entrada;
        this.salida = salida;
    }

  
   

   

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getNumero_de_horas() {
        return numero_de_horas;
    }
    public void setNumero_de_horas(int numero_de_horas) {
        this.numero_de_horas = numero_de_horas;
    }
    public double getNomina() {
        return nomina;
    }
    public void setNomina(double nomina) {
        this.nomina = nomina;
    }
   public int getEntrada() {
        return entrada;
    }
    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
    public int getSalida() {
        return salida;
    }
    public void setSalida(int salida) {
        this.salida = salida;
    }
    public int getHoras_extra() {
        return horas_extra;
    }
    public void setHoras_extra(int horas_extra) {
        this.horas_extra = horas_extra;
    }
    public int getHoras_diarias() {
        return horas_diarias;
    }
    public void setHoras_diarias(int horas_diarias) {
        this.horas_diarias = horas_diarias;
    }
    
    
    public void registrarEntrada(){
        if(new Date().getHours()<this.entrada){
            this.setHoras_diarias(0);
        }else{
        this.setHoras_diarias(this.entrada-new Date().getHours());
    }
    }
    public void registrarSalida(){
        if(new Date().getHours()-this.getHoras_diarias()<=7){
            this.horas_diarias=new Date().getHours()+this.getHoras_diarias();
            this.numero_de_horas=this.numero_de_horas+(this.horas_diarias);
        }else{
            this.horas_diarias=7;
            this.numero_de_horas=this.numero_de_horas+this.horas_diarias;
            this.horas_extra=this.horas_extra+(new Date().getHours()-this.horas_diarias);
        }
    }
   
    public double calcularNomina(){
        this.nomina=(this.numero_de_horas *95.8467592)+(this.horas_extra *95.8467592);
        return nomina;
    }
    public void liquidarNomina(){
        this.numero_de_horas=this.horas_extra=0;
    }
}

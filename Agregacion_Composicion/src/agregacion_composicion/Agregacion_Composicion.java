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
import java.util.*;
public class Agregacion_Composicion {

    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Marca de llantas:");
       String marca_llantas=lectura.next();
       System.out.println("Diametro de llantas:");
       double diametro_llantas=lectura.nextDouble();
       Llanta [][] llantas = new Llanta [2][2];
       for(int i=0; i<2 ; i++){
           for(int k=0; k<2 ; k++){
       llantas[i][k]= new Llanta (marca_llantas,diametro_llantas);
           }
    }
      
       System.out.println("Marca de ejes de llantas:");
       String marca_eje_llantas=lectura.next();
       Eje [] ejes_llantas =new Eje [2];
     for(int i=0; i<2 ; i++){
         ejes_llantas[i]= new Eje (marca_eje_llantas);
    }
     System.out.println("Marca de eje de motor:");
       String marca_eje_motor=lectura.next();
     Eje eje_motor=new Eje (marca_eje_motor);
       
    for(int i =0; i<2;i++){
        ejes_llantas[i].setllantas(llantas[i]);
    }
    System.out.println("Marca de carro:");
       String marca_carro=lectura.next();
       System.out.println("Placa:");
       String placa=lectura.next();
 
    Carro carro1= new Carro (placa,marca_carro,llantas,ejes_llantas);
    
   
    
    }
    
}

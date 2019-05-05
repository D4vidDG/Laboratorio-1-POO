/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4;

import java.util.*;
public class Practica4 {



    public static void main(String[] args) {
        ArrayList<Familia> Familias= new ArrayList<>();
        int i=0;
        while(i>=0){
        mostrarMenu(Familias);
        i++;
    }
        

    }
    
   private static void ingresarFamilia(ArrayList Familias){
      Scanner lectura =new Scanner (System.in);
        System.out.println("Ingrese el nombre de su familia:");
        String nombre_familia=lectura.next();
        Familia familia=new Familia (nombre_familia);
        Familias.add(familia);
        
        System.out.println("Ingrese el numero de hijos:");
        int hijos=lectura.nextInt();
        
         System.out.println("Ingrese el nombre,apellido,edad y sexo (0 para hombre, 1 para mujer) del padre");
         String nombre_padre=lectura.next();
         String apellido_padre=lectura.next();
         int edad_padre=lectura.nextInt();
         int sexo_padre=lectura.nextInt();
         familia.setIntegrante(nombre_padre, apellido_padre,edad_padre,sexo_padre,1);
         
         System.out.println("Ingrese el nombre,apellido,edad y sexo (0 para hombre, 1 para mujer) de la madre");
         String nombre_madre=lectura.next();
         String apellido_madre=lectura.next();
         int edad_madre=lectura.nextInt();
         int sexo_madre=lectura.nextInt();
         familia.setIntegrante(nombre_madre, apellido_madre,edad_madre,sexo_madre,2);
         
        for (int i=0;i<hijos;i++){
            System.out.println("Ingrese el nombre,apellido,edad y sexo (0 para hombre, 1 para mujer) del hijo"+" "+(i+1));
         String nombre_hijo=lectura.next();
         String apellido_hijo=lectura.next();
         int edad_hijo=lectura.nextInt();
         int sexo_hijo=lectura.nextInt();
         familia.setIntegrante(nombre_hijo, apellido_hijo,edad_hijo,sexo_hijo,3);
            
            }
        
                } 
   private static void mostrarMenu(ArrayList <Familia> Familias){
       Scanner lectura =new Scanner (System.in);
       System.out.println("Bienvenido a la memoria de familias. Seleccione el procedimiento a realizar:");
        System.out.println("1.Ingresar familia \n 2.Consultar familia \n 3.Consultar miembro de familia");
        int opcion=lectura.nextInt();
        switch(opcion){
            case 1:
                ingresarFamilia(Familias);
                break;
            case 2:
                System.out.println("Ingrese el nombre de la familia a consultar");
                String nombre_familia=lectura.next();
                for (int i = 0; i <Familias.size(); i++) {
                    if(Familias.get(i).getNombre_Familia().equals(nombre_familia)){
                        Familias.get(i).consultar_familia();
                        return;
                    }
                    
                }
                System.out.println("No se encontro la familia");
                break;
            case 3:
               System.out.println("Ingrese el nombre de la familia a consultar");
                String familia_miembro=lectura.next();
                for (int i = 0; i <Familias.size(); i++) {
                    if(Familias.get(i).getNombre_Familia().equals(familia_miembro)){
                        System.out.println("Ingrese el nombre y apellido del miembro:");
                        String nombre_miembro=lectura.next();
                        String apellido_miembro=lectura.next();
                        boolean exito=Familias.get(i).consultar_miembro_familia(nombre_miembro,apellido_miembro);
                        if(exito==false){
                            System.out.println("No se encontro el miembro");
                        }
                        return;
                    }
                    
                }
                System.out.println("No se encontro la familia");
                break;
        }
   }
}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.maria.mercedes.diaz;

import java.util.*;
public class Inventario {
    private LinkedHashMap <String,ArrayList<Producto>> productos;
    private double [] gastos;
    private LinkedHashMap <String,ArrayList<Compras>> registroCompras;
    private LinkedHashMap <String,ArrayList<Ventas>> registroVentas;
    public HashMap<String, ArrayList<Producto>> getProductos() {
        return productos;
    }
    public void setProductos(LinkedHashMap<String, ArrayList<Producto>> productos) {
        this.productos = productos;
    }
    public double[] getGastos() {
        return gastos;
    }
    public void setGastos(double[] gastos) {
        this.gastos = gastos;
    }

    public Inventario( LinkedHashMap<String, ArrayList<Compras>> registroCompras, LinkedHashMap<String, ArrayList<Ventas>> registroVentas) {
        this.productos = new LinkedHashMap <>();
        this.gastos=new double [3];
        this.registroCompras = registroCompras;
        this.registroVentas = registroVentas;
    }

    public void Comprar (int cantidad, String nombre,String nombre_proveedor, double costo,ArrayList<Proveedor> proveedores,ArrayList<Facturas>facturas,Date vencimiento ){
        double costo_unitario=costo/cantidad;
        Proveedor proveedor_compra = null;
        for(int i=0;i<proveedores.size();i++){
            if(proveedores.get(i).getNombre().equals(nombre_proveedor))
                proveedor_compra=proveedores.get(i);
        }
        facturas.add(new Facturas (proveedor_compra, costo,vencimiento));
        Producto producto_comprado=new Producto (nombre, costo_unitario,proveedor_compra);  
        this.gastos[1]=this.gastos[1]+costo;
          
       for(String clave: productos.keySet()){
           if(nombre.equals(clave)){
              
           for(int i=0;i<cantidad;i++){
               if(productos.get(clave).get(i)!=null){
               productos.get(clave).add(producto_comprado);
               }
           }
           this.registroCompras.get(clave).add(new Compras(producto_comprado,cantidad,costo));
           return;
           }
    }
       
    this.productos.put(nombre,new ArrayList<>());
    this.registroCompras.put(nombre,new ArrayList<>());
    this.registroVentas.put(nombre,new ArrayList<>());
    this.registroCompras.get(nombre).add(new Compras(producto_comprado,cantidad,costo));
    for(int i=0;i<cantidad;i++){
        
               productos.get(nombre).add(producto_comprado);
        
           }  
    }
     public boolean Vender (int cantidad, String nombre,double costo_venta){ 
      
     this.gastos[2]=this.gastos[2]+costo_venta;
         
       for(String clave: productos.keySet()){
           if(nombre.equals(clave)){
               
               if(this.productos.get(nombre).size()>=cantidad){
                   if(!productos.get(nombre).isEmpty()){
           this.registroVentas.get(clave).add(new Ventas(this.productos.get(clave).get(0),cantidad,costo_venta));
                   }else{
                   return false;
                   }
           for(int i=0;i<cantidad;i++){
               this.productos.get(nombre).remove(this.productos.get(nombre).size()-1);
               }
           return true;
               }else{
                   return false;
               }
               }
               }
             return false;  
           }  
     public void productoMasVendido(){
         int [] ventas_totales=new int [this.registroVentas.size()];
         int k=0;
for(ArrayList <Ventas> ventas: this.registroVentas.values()){
    int contador=0;
    for(int i=0;i<ventas.size();i++){
        if(ventas.get(i)!=null){
        contador=contador+ventas.get(i).getCantidad();
        }
        
    }
ventas_totales[k]=contador;
        k++;  
        
}

int maximas_ventas=ventas_totales[0];
for(int j=1;j<this.registroVentas.size();j++){
    if(maximas_ventas<ventas_totales[j]){
 maximas_ventas=ventas_totales[j];
    }
}
for(ArrayList <Ventas> ventas: this.registroVentas.values()){
    int contador=0;
    for(int i=0;i<ventas.size();i++){
        if(ventas.get(i)!=null){
        contador=contador+ventas.get(i).getCantidad();
        }
        if(maximas_ventas==contador){
            System.out.println("El producto mas vendido fue"+" "+ventas.get(0).getProducto().getNombre()+" "+"con un total de"+" "+maximas_ventas);
                    
        }
    }  
}

     }
     public void consultarGastos(){
         this.gastos[0]=this.gastos[2]-this.gastos[1];
         System.out.println("Gasto total:"+this.gastos[0]);
         System.out.println("Compras:"+this.gastos[1]);
         System.out.println("Ventas:"+this.gastos[2]);
     }
     public void consultar_registroCompras(){
         for(ArrayList<Compras>compras:this.registroCompras.values()){
             for(int i=0;i<compras.size();i++){
                 System.out.println(compras.get(i).getRegistro());
             }
         }
     }
     public void consultar_registroVentas(){
          for(ArrayList<Ventas>ventas:this.registroVentas.values()){
             for(int i=0;i<ventas.size();i++){
                 System.out.println(ventas.get(i).getRegistro());    
     }
          }
     }
     public void Agotados(){
      for(String nombre_producto: this.productos.keySet()){  
          if(productos.get(nombre_producto).isEmpty()){
              System.out.println("El producto"+" "+nombre_producto+" "+"se encuentra agotado");
          }
      }
     }
     public double calcularPreciodeVenta(int dia_fecha_compra,int mes_fecha_compra,int anio_fecha_compra,String nombre_producto,double porcentaje_de_ganancia){
         for(ArrayList <Compras> compras: this.registroCompras.values()){
             for(int i=0;i<compras.size();i++){
                 if(compras.get(i).getFecha_compra().getDate()==dia_fecha_compra&&compras.get(i).getFecha_compra().getMonth()==mes_fecha_compra&&compras.get(i).getFecha_compra().getYear()==anio_fecha_compra&&compras.get(i).getProducto().getNombre().equals(nombre_producto)){
                  double costo_venta_compra=compras.get(i).getCosto_compra()+((compras.get(i).getCosto_compra()*porcentaje_de_ganancia)/100);
                  return costo_venta_compra;
                 }
             }
             
         }
     return 0;
     }
     public void consultar_productosPocoMovimiento(){
         Date fecha_de_hoy=new Date();
         for(ArrayList<Producto> producto: this.productos.values()){
         for(int i=0;i<producto.size();i++){
         long diff= fecha_de_hoy.getTime()-producto.get(i).getFecha_compra().getTime();
         if(diff>(2.592*(Math.pow(10,9)))){
             System.out.println("El producto"+" "+producto.get(i).getNombre()+" "+"comprado el dia"+" "+producto.get(i).getFecha_compra().toString()+" "+"no se ha vendido por un mes");
                 }
}
}
     }
     public void consultar_Inventario(){
         for(String nombre_producto:this.productos.keySet()){
             System.out.println("Existen"+" "+this.productos.get(nombre_producto).size()+" "+"de"+" "+nombre_producto+" "+"en el inventario");
         }
         
     }
     public void registrarGastosAnuales(int [] gastosanuales){
         
     }
}
    
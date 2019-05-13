/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.maria.mercedes.diaz;

import java.util.*;

public class SupermercadoMariaMercedesDiaz {


    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        LinkedHashMap<String,ArrayList<Compras>> registroCompras=new LinkedHashMap <>();
        LinkedHashMap<String,ArrayList<Ventas>> registroVentas=new LinkedHashMap <>();
        Inventario inventario=new Inventario (registroCompras, registroVentas);
        ArrayList <Facturas> facturas=new ArrayList ();
        ArrayList <Proveedor> proveedores=new ArrayList ();
        ArrayList <Empleados> empleados=new ArrayList ();
        TreeMap <Integer,Double> gastos_anuales=new TreeMap<>();
        int n=2;
        while(n>0){
        inventario.registrarGastosAnuales(gastos_anuales);
        System.out.println("Bienvenido al supermercado Maria Mercedes Diaz. Elija la opcion a escoger");
        System.out.println("1.Compra\n 2.Venta\n3.Producto mas vendido \n4.Productos agotados \n 5.Consultar Gastos \n 6.Consultar Registro Compras \n 7. Consultar Registro Ventas \n 8.Calcular precio de venta de una compra \n 9. Consultar Inventario \n 10. Consultar productos con poco movimiento \n 11.Registrar Proveedor \n 12.Registrar Empleado \n 13.Consultar nomina de empleado \n 14.Consultar facturas pendientes \n 15.Consultar facturas vencidas \n 16.Liquidar Empleado \n 17.Eliminar Factura pagada \n 18. Consultar Proveedor \n 19. Registrar entrada de empleado \n 20.Registrar salida empleado \n 21.Consultar gastos anuales ");
        int opcion=lectura.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Ingrese la cantidad de objetos a comprar:");
                int cantidad_compra=lectura.nextInt();
                System.out.println("Ingrese nombre del producto a comprar:");
                String nombre_compra=lectura.next();
                 System.out.println("Ingrese nombre del proveedor del producto a comprar(Recuerde registrar primero el proveedor):");
                 String nombre_proveedor_compra=lectura.next();
                 System.out.println("Ingrese el costo de compra total:");
                 double costo_compra=lectura.nextDouble();
                 System.out.println("Ingrese la fecha de vencimiento de la factura de compra(dia,mes,año)");
                 Date fecha_vencimiento= new Date();
                 fecha_vencimiento.setDate(lectura.nextInt());
                 fecha_vencimiento.setMonth(lectura.nextInt()-1);
                 fecha_vencimiento.setYear(lectura.nextInt()-1900);
              inventario.Comprar(cantidad_compra, nombre_compra, nombre_proveedor_compra,costo_compra, proveedores, facturas,fecha_vencimiento);
                break;
            case 2:
                System.out.println("Ingrese la cantidad de objetos a vender:");
                int cantidad_venta=lectura.nextInt();
                System.out.println("Ingrese nombre del producto a vender:");
                String nombre_venta=lectura.next();
                 System.out.println("Ingrese el costo de venta total:");
                 double costo_venta=lectura.nextDouble();
                boolean venta_exitosa=inventario.Vender(cantidad_venta, nombre_venta, costo_venta);
                if(true==venta_exitosa){
                    System.out.println("Venta exitosa");
                }else{
                    System.out.println("No hay suficientes productos para vender");
                }
                break;
            case 3:
                inventario.productoMasVendido();
                break;
            case 4:
                inventario.Agotados();
                break;
            case 5:
                inventario.consultarGastos();
                break;
            case 6:
                inventario.consultar_registroCompras();
                break;
            case 7:
                inventario.consultar_registroVentas();
                break;
            case 8:
                 System.out.println("Ingrese nombre del producto de la compra:");
                String nombre_compra_consultar=lectura.next();
                 System.out.println("Ingrese la fecha de la compra(dia,mes,año):");
                 int dia_compra=lectura.nextInt();
                 int mes_compra=lectura.nextInt();
                 int anio_compra=lectura.nextInt();
                 System.out.println("Ingrese el porcentaje de ganancia deseado:");
                 double porcentaje_ganancia=lectura.nextDouble();
                System.out.println(inventario.calcularPreciodeVenta(dia_compra,mes_compra,anio_compra, nombre_compra_consultar, porcentaje_ganancia));
                break;
            case 9:
                inventario.consultar_Inventario();
                break;
            case 10:
                inventario.consultar_productosPocoMovimiento();
                break;
            case 11:
                System.out.println("Ingrese el nombre del proveedor");
                String proveedor_nombre=lectura.next();
                System.out.println("Ingrese la direccion del proveedor");
                String direccion_proveedor=lectura.next();
                System.out.println("Ingrese el telefono del proveedor");
                double telefono_proveedor=lectura.nextDouble();
                proveedores.add(new Proveedor (proveedor_nombre, direccion_proveedor, telefono_proveedor));
                break;
            case 12:
                System.out.println("Ingrese el nombre del empleado");
                String empleado_nombre=lectura.next();
                System.out.println("Ingrese el apellido del empleado");
                String empleado_apellido=lectura.next();
                System.out.println("Ingrese hora de entrada del empleado");
                int hora_entrada=lectura.nextInt();
                System.out.println("Ingrese hora de salida del empleado");
                int hora_salida=lectura.nextInt();
                empleados.add(new Empleados (empleado_nombre, empleado_apellido, hora_entrada,hora_salida));
                break;
            case 13:
                System.out.println("Ingrese el nombre del empleado");
                String empleado_nombre_consulta=lectura.next();
                System.out.println("Ingrese el apellido del empleado");
                String empleado_apellido_consulta=lectura.next();
                for(int i=0;i<empleados.size();i++){
                    if(empleados.get(i)!=null){
                        if(empleados.get(i).getNombre().equals(empleado_nombre_consulta)&&empleados.get(i).getApellido().equals(empleado_apellido_consulta)){
                            System.out.println("Nomina:"+empleados.get(i).calcularNomina());
                        }
                    }
                }
                break;
            case 14:
                for(int i=0; i<facturas.size();i++){
                    if(facturas.get(i)!=null){
                        System.out.println("Factura"+" "+(i+1));
                        System.out.println("Deuda:"+facturas.get(i).getDeuda());
                        System.out.println("Fecha de adquisicion:"+facturas.get(i).getFecha_factura().toString());
                        System.out.println("Proveedor:"+facturas.get(i).proveedor.getNombre());
                        System.out.println("Fecha de vencimiento:"+facturas.get(i).getFecha_vencimiento().toString());
                    }
                }
                    
                break;
            case 15:
                Date fecha_hoy=new Date();
                for(int i=0; i<facturas.size();i++){
                    int k=1;
                    if(facturas.get(i)!=null){
                    if(fecha_hoy.compareTo(facturas.get(i).getFecha_vencimiento())>0){
                       
                        System.out.println("Factura vencida"+" "+(k));
                        System.out.println("Deuda:"+facturas.get(i).getDeuda());
                        System.out.println("Fecha de adquisicion:"+facturas.get(i).getFecha_factura().toString());
                        System.out.println("Proveedor:"+facturas.get(i).proveedor.getNombre()); 
                        System.out.println("Fecha de vencimiento:"+facturas.get(i).getFecha_vencimiento().toString());
                        k++;
                    }
                    }
                }
                break;
            case 16:
                System.out.println("Ingrese el nombre del empleado");
                String empleado_nombre_liquidacion=lectura.next();
                System.out.println("Ingrese el apellido del empleado");
                String empleado_apellido_liquidacion=lectura.next();
                for(int i=0;i<empleados.size();i++){
                    if(empleados.get(i)!=null){
                        if(empleados.get(i).getNombre().equals(empleado_nombre_liquidacion)&&empleados.get(i).getApellido().equals(empleado_apellido_liquidacion)){
                            empleados.get(i).liquidarNomina();
                    }
                }
                
        }
                break;
            case 17:
                System.out.println("Ingrese el proveedor de la deuda:");
                String nombre_proveedor=lectura.next();
                System.out.println("Ingrese la fecha de la deuda(dia,mes,año)");
                Date fecha_factura=new Date();
                fecha_factura.setDate(lectura.nextInt());
                fecha_factura.setMonth(lectura.nextInt()-1);
                fecha_factura.setYear(lectura.nextInt()-1900);
                
                 for(int i=0; i<facturas.size();i++){
                    if(facturas.get(i)!=null){
                        if(facturas.get(i).getProveedor().getNombre().equals(nombre_proveedor)&&facturas.get(i).getFecha_factura().getDate()==fecha_factura.getDate()&&facturas.get(i).getFecha_factura().getMonth()==fecha_factura.getMonth()&&facturas.get(i).getFecha_factura().getYear()==fecha_factura.getYear())
                       facturas.remove(i);
                    }
                }
                break;
            case 18:
                System.out.println("Ingrese el nombre del proveedor");
                String nombre_proveedor_consulta=lectura.next();
                for(int i=0;i<proveedores.size();i++){
                    if(proveedores.get(i)!=null){
                        if(proveedores.get(i).getNombre().equals(nombre_proveedor_consulta)){
                        System.out.println("Proveedor:"+proveedores.get(i).getNombre());
                        System.out.println("Direccion:"+proveedores.get(i).getDireccion());
                        System.out.println("Telefono:"+proveedores.get(i).getTelefono());
                        }
                    }
                }
                break;
                case 19:
                   System.out.println("Ingrese el nombre del empleado");
                String nombre_empleado_entrada=lectura.next();
                System.out.println("Ingrese el apellido del empleado");
                String apellido_empleado_entrada=lectura.next();
                for(int i=0;i<empleados.size();i++){
                    if(empleados.get(i)!=null){
                        if(empleados.get(i).getNombre().equals(nombre_empleado_entrada)&&empleados.get(i).getApellido().equals(apellido_empleado_entrada)){
                        empleados.get(i).registrarEntrada();
                        }
                    }
                } 
                break;
                case 20:
                    System.out.println("Ingrese el nombre del empleado");
                String nombre_empleado_salida=lectura.next();
                System.out.println("Ingrese el apellido del empleado");
                String apellido_empleado_salida=lectura.next();
                for(int i=0;i<empleados.size();i++){
                    if(empleados.get(i)!=null){
                        if(empleados.get(i).getNombre().equals(nombre_empleado_salida)&&empleados.get(i).getApellido().equals(apellido_empleado_salida)){
                        empleados.get(i).registrarSalida();
                        }
                    }
                } 
                break;
                case 21:
                    for(int anio:gastos_anuales.keySet()){
                        System.out.println("Año"+" "+anio+":"+gastos_anuales.get(anio));
                    }
                    break;
                    
       
        }

    }
    
}
}

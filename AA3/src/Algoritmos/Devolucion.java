/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package  Algoritmos;

import clases_objetos.Producir;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Devolucion{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        float  pago, pagar = 0;
        int cant, total_cant_D = 0;
        double totalC=1000, total_D = 0, totalc_act;
        var resp2="si o no";
         String cod;
         String resp, nombre = null;
        
        //CREACION DE OBJETOS - DANDO VALORES A LOS OBJETOS

        Producir producto1 = new Producir("cod01", " GALLETAS ", 2);
        Producir producto2 = new Producir("cod02", " GASEOSA DE 3LTS", 11);
        Producir producto3 = new Producir("cod03"," AGUA MINERAL", (float) 1.80);
        Producir producto4 = new Producir("cod04" ," HELADO DE 1LT",8);
        Producir producto5 = new Producir("cod05"," PIQUEO SNACKS", (float) 7.50);
        Producir producto6 = new Producir("cod06"," FRUGOS NARANJA DE 1LT", (float) 3.70);
        Producir producto7 = new Producir("cod07"," SPORADE DE 1LT ", (float) 5.50);
        Producir producto8 = new Producir("cod08"," CAJITA DE CHICLE", (float) 1.20);
        Producir producto9 = new Producir("cod09" , " YOGUT DE 2LT " , (float) 7.80);
        Producir producto10 = new Producir("cod10" , " WAFER" , (float) 1.5);
        //inicio
        System.out.println("//////////////////////////////////");
        System.out.println("Total de caja 1000");
        System.out.println("SOLO SE ACEPTAN PRODUCTOS EN MAL ESTADO");
        System.out.println("//////////////////////////////////");
        System.out.println("¿Desea devolver el producto?/si o no/");
        resp=teclado.nextLine();
        if (resp.toLowerCase().equals("no")){
             System.out.println("Gracias por su Preferencia!!!!");
             System.err.println("Haz introducido un dato erroneo");
                System.exit(0); // termianr el codigo
        }else{
            System.out.println("¿El producto esta en MAL estado?/si o no/");
             resp2=teclado.nextLine();
             if("no".equals(resp2)||"NO".equals(resp2)){
             System.out.println("NO PROCEDE LA DEVOLUCION :( ");   
             System.err.println("Haz introducido un dato erroneo");
                System.exit(0); // termianr el codigo

        }
              while (resp.equals("si")) {

            //INGRESO DE CODIGO
            System.out.println("*-Ingresa el codigo del  producto: ");
            cod = teclado.next();
            
            //USANDO METODOS GET PARA LLAMAR VALORES E IGUALARLOS A VARIABLES

            // TOMAR EL NOMBRE SEGUN EL CODIGO
            if (cod.equals(producto1.getCodigo())) {
                nombre = producto1.getNombre();
                pagar = producto1.getPrecio();
                cod = producto1.getCodigo();
            } else if (cod.equals(producto2.getCodigo())) {
                nombre = producto2.getNombre();
                pagar = producto2.getPrecio();
            } else if (cod.equals(producto3.getCodigo())) {
                nombre = producto3.getNombre();
                pagar = producto3.getPrecio();
                cod = producto3.getCodigo();
            } else if (cod.equals(producto4.getCodigo())) {
                nombre = producto4.getNombre();
                pagar = producto4.getPrecio();
                cod = producto4.getCodigo();
            } else if (cod.equals(producto5.getCodigo())) {
                nombre = producto5.getNombre();
                pagar = producto5.getPrecio();
                cod = producto5.getCodigo();
            } else if (cod.equals(producto6.getCodigo())) {
                nombre = producto6.getNombre();
                pagar = producto6.getPrecio();
                cod = producto6.getCodigo();
            } else if (cod.equals(producto7.getCodigo())) {
                nombre = producto7.getNombre();
                pagar = producto7.getPrecio();
                cod = producto7.getCodigo();
            } else if (cod.equals(producto8.getCodigo())) {
                nombre = producto8.getNombre();
                pagar = producto8.getPrecio();
                cod = producto8.getCodigo();
            } else if (cod.equals(producto9.getCodigo())) {
                nombre = producto9.getNombre();
                pagar = producto9.getPrecio();
                cod = producto9.getCodigo();
            } else if (cod.equals(producto10.getCodigo())) {
               nombre = producto10.getNombre();
                pagar = producto10.getPrecio();
                cod = producto10.getCodigo();
            } else {
                System.err.println("NO SE ENCONTRO EL CODIGO DEL PRODUCTO");
                System.err.println("¡Intentelo de nuevo¡");
                System.exit(0); // termianr el codigo
            }
            System.out.println("El valor de" + nombre + " por unidad es :S/" + pagar);
            
            System.out.println("*-Ingrese las unidades que llevo:");
            cant = teclado.nextInt();
            //funtion
            pago = pagos(pagar, cant);
            //:)
            System.out.println("-*¿Quiere devolver otro producto otro producto?(Indique si/no)");
            resp = teclado.next();
            
            total_D = total_D + pago;
            total_cant_D = total_cant_D + cant;
            

            if (resp.equals("no")) {
             totalc_act = resta(totalC, total_D);
             System.out.println("////////////////////////////");
             System.out.println("**Total de la caja Actualizado ** : s/1000 - s/" + total_D + " =  s/"+ totalc_act);
             System.out.println("**La Cantidad de productos que se devolcieron:" + total_cant_D);
             System.out.println("**Total de la devolucion:S/" + total_D);
             System.out.println("--------Gracias por su Preferancia--------");
             System.out.println("////////////////////////////");
            }

        }


        }
        
        
 
    }
    public static float pagos(float num1, int num2) {

        return num1 * num2;
    }
    public static double resta(double num3, double num4){
        return num3 - num4;
    }
    
}


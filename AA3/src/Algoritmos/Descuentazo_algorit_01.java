/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Algoritmos;

import clases_objetos.Producir;
import java.util.Scanner;

/**
 *
 * @author aguil
 */
public class Descuentazo_algorit_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        //Variabes
        float total_des, pagar, pago, total, des1, des2, des3, desN3;
        String resp, cod, nombre;
        int cant, total_cant;
        
        
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

        //Inicializando variables
        pagar = 0;
        pago = 0;
        total = 0;
        resp = "";
        cod = "";
        nombre = "";
        cant = 0;
        total_cant = 0;

        //INICIO DE ALGORITMO
        System.out.println("Seleccione un producto:");
        System.out.println("________________________________");
        System.out.println("| cod01  GALLETAS                |");
        System.out.println("| cod02  GASEOSA DE 3LTS         |");
        System.out.println("| cod03  AGUA MINERAL            |");
        System.out.println("| cod04  HELADO DE 1LT           |");
        System.out.println("| cod05  PIQUEO SNACKS           |");
        System.out.println("| cod06  FRUGOS NARANJA DE 1LT   |");
        System.out.println("| cod07  SPORADE DE 1LT          |");
        System.out.println("| cod08  CAJITA DE CHICLE        |");
        System.out.println("| cod09  YOGUT DE 2LT            |");
        System.out.println("| cod10  WAFER                   |");
        System.out.println("_________________________________");
        System.out.println("¿Desea un producto? Indique si/no?");
        resp = teclado.next();

        if (resp.equals("no")) {

            System.err.println("*************************** Compra cancelada ***************************");
            System.err.println("Haz cancelado la compra O haz introducido un dato erroneo");
            System.exit(0); // termianr el codigo
        } else if (!"si".equals(resp)) {
            System.err.println("*************************** Compra cancelada ***************************");
            System.err.println("Haz cancelado la compra O haz introducido un dato erroneo");
            System.exit(0); // termianr el codigo
        }
//
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

            // Nombre / precio del producto
            System.out.println("El valor de" + nombre + " por unidad es :S/" + pagar);

            //CANTIDADES DE PRODUCTO
            System.out.println("*-Ingrese las unidades que va a llevar:");
            cant = teclado.nextInt();

            //OPERACION 
            //funcion
            pago = pagar * cant;
            //DETALLE DE COMPRA INDIVIDUAL
            System.out.println(".....................................");
            System.out.println("--Detalles de esta compra:");
            System.out.println("-Codigo del producto:" + cod);
            System.out.println("-Nombre del producto:" + nombre);
            System.out.println("-Precio del producto por unidad: S/" + pagar);
            System.out.println("-La cantidad de productos a llevar es:" + cant);
            System.out.println("*-Paga por de esta compra: S/" + pago);
            System.out.println("......................................");

            System.out.println("¿Desea agregar un nuevo producto? Ingrese si/no");
            resp = teclado.next();

            total = total + pago;
            total_cant = total_cant + cant;

            if (resp.equals("no")) {
                System.out.println("************** DATOS PAGO ************** ");
                System.out.println("* Usted tiene que pagar: /S." + total);
                System.out.println("* La cantidad de productos a llevar es:" + total_cant);

                if (total >= 100 && total <= 150 && total_cant >= 20 && total_cant <= 30 || total_cant >= 155 || total >= 201 && total <= 250 && total_cant >= 31 && total_cant <= 40) {
                    System.out.println("");
                } else {
                    System.out.println("*** ¡GRACIAS POR COMPRAR EN DESCUENTAZO ***!");
                }
            } else if (!"si".equals(resp) && !"no".equals(resp)) {
                System.err.println("*************************** Compra cancelada ***************************");
                System.err.println("Haz introducido un dato erroneo");
                System.exit(0); // termianr el codigo

            }

            //DESCUENTAZOS
            int d1 = 10;
            int d2 = 20;
            int d3 = 35;
            des1 = descuento(total, d1);   //(float) (total * 0.10);
            des2 = descuento(total, d2);    //(float) (total * 0.20);
            des3 = descuento(total, d3);   //(float) (total * 0.35);

            if (total >= 100 && total <= 150 && total_cant >= 20 && total_cant <= 30) {

                total_des = total - des1;
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                System.out.println("¡HAZ OBTENIDO UN DESCUENTAZO del 10% del total de tu compra¡ PAGA AHORA:/S" + total_des);
                System.out.println("*** ¡GRACIAS POR COMPRAR EN DESCUENTAZO ***!");
            }

            if (total_cant >= 155) {

                total_des = total - des2;
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                System.out.println("¡HAZ OBTENIDO UN DESCUENTAZO del 20% del total de tu compra¡ PAGA AHORA:/S" + total_des);
                System.out.println("*** ¡GRACIAS POR COMPRAR EN DESCUENTAZO ***!");
            }

            if (total >= 150 && total <= 250 && total_cant >= 30 && total_cant <= 40) {

                total_des = total - des3;
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                System.out.println("¡HAZ OBTENIDO UN DESCUENTAZO del 35% del total de tu compra¡ PAGA AHORA:/S" + total_des);
                System.out.println("*** ¡GRACIAS POR COMPRAR EN DESCUENTAZO ***!");
            }

        }

        //
    }
    //funcion para pagos  float * int  

    public static float pagos(float num1, int num2) {
        return num1 * num2;

    }

    //Funcion que calcula los descuentos
    public static float descuento(float numA, int numB) {

        float descuento1 = (numB * numA) / 100;

        return descuento1;
    }

}

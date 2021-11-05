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
public class el_fiado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // TODO code application logic here
        int cuota, cant, total_cant, dni = 0;
        float pago, pagar = 0;
        double total_pre, agregado, pagarfinal;
        double cal_cou;
        String cod;
        String resp, nom = "", ape = "";
        String  nombre = null;
        
        
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
        
        
        System.out.println( "________________________");
	System.out.println("| cod01  GALLETAS        |");   
	System.out.println("| cod02  GASEOSA DE 3LTS |");
	System.out.println("| cod03  AGUA MINERAL    |"); 
	System.out.println("| cod04  HELADO DE 1LT   |");   
	System.out.println("| cod05  PIQUEO SNACKS   |");  
	System.out.println("| cod06  FRUGOS DE 1LT   |");
	System.out.println("| cod07  SPORADE DE 1LT  |");
	System.out.println("| cod08  CAJITA DE CHICLE|"  );
	System.out.println("| cod09  YOGUT DE 2LT    |"  );
	System.out.println("| cod10  WAFER           |"  );
	System.out.println("_________________________");
        
        System.out.println("¿Iniciar una cuenta nueva? Indique si /no(No cualquier otra letra)");
        resp = teclado.next();

        //ANALISIS DE RESPUESTA
        if (resp.equals("no")) {

            System.err.println("*************************** CUENTA NO CREADA  ***************************");
            System.err.println("Haz cancelado la creacion de la cuenta O haz introducido un dato erroneo");
            System.exit(0); // termianr el codigo
        } else if (!"si".equals(resp)) {
            System.err.println("*************************** CUENTA NO CREADA ***************************");
            System.err.println("Haz cancelado la creacion de la cuenta O haz introducido un dato erroneo");
            System.exit(0); // termianr el codigo
        }

        if (resp.equals("si")) {
            System.out.println("--Consultar Datos:");
            System.out.println("*-Ingrese sus nombre(s):");
            nom = teclado.next();

            System.out.println("*-Ingrese sus apellidos:");
            ape = teclado.next();

            System.out.println("*-Ingrese su dni:");
            dni = teclado.nextInt();

            System.out.println("¿El Historial del consumo es mayor a 3000 soles?:");
            resp = teclado.next();

            //ANALISIS DE RESPUESTA
            if (resp.equals("no")) {

                System.err.println("*************************** CUENTA NO CREADA  ***************************");
                System.err.println("Haz cancelado la creacion de la cuenta O haz introducido un dato erroneo");
                System.exit(0); // termianr el codigo
            } else if (!"si".equals(resp)) {
                System.err.println("*************************** CUENTA NO CREADA ***************************");
                System.err.println("Haz cancelado la creacion de la cuenta O haz introducido un dato erroneo");
                System.exit(0); // termianr el codigo
            }

            if ("no".equals(resp)) {
                System.err.println("Verificacion Cancelada");
            }

        }
        cuota = 0;
        total_pre = 0;
        total_cant = 0;
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

            System.out.println("*-Ingrese las unidades que va llevar:");
            cant = teclado.nextInt();

            pago = pagar * cant;

            System.out.println("-*¿Quiere llevar otro producto?(Indique si/no)");
            resp = teclado.next();

            total_pre = total_pre + pago;
            total_cant = total_cant + cant;

            if (resp.equals("no")) {
                System.out.println("********************************************");
                System.err.println("**Total Fiado:S/" + total_pre);
                System.out.println("**La Cantidad de productos a llevar es:" + total_cant);
                System.out.println("**Ingrese el numero de cuotas");
                cuota = teclado.nextInt();
            }

        }
         System.out.println("****************************************");
         
        System.out.println("-DATOS DE USUARIO - DATOS A GUARDAS");
        if ("".equals(nom)) {
            System.err.println("Nombre(s): NULO");
        } else {
            System.out.println("Nombre(s):" + nom);
        }

        if ("".equals(ape)) {
            System.err.println("Nombre(s): NULO");
        } else {
            System.out.println("Apellido(s):" + ape);
        }

        if (dni == 0) {
            System.err.println("DNI : NULO");
        } else {
            System.out.println("DNI:" + dni);
        }

        //VALOR AGREGADO
        agregado = (total_pre * 25) / 100;
        pagarfinal=total_pre+agregado;
         cal_cou=cuotaS(pagarfinal,cuota);
        if (total_pre == 0) {
            System.err.println("EL TOTAL ES NULO");
        } else {
            System.err.println("---- Al total se le agregara el 25% del total de su compra -----");
            System.err.println("**El total a pagar es: S/" + pagarfinal);
        }

        if (total_cant == 0) {
            System.err.println("La cantidad de articulos es : NULO");
        } else {
            System.out.println("**La cantidad de articulos es : " + total_cant);
        }

        if (total_cant == 0) {
            System.err.println("El numero de cuotas es : NUELO");
        } else {
            System.out.println("**El numero de cuotas es: " + cuota);

            if (cuota == 0) {

                System.err.println("El numero de coutas para pagar: NULO");
            } else {
                
                   
                System.err.println("**Cantidad a apagar por CUOTAS: S/" +  cal_cou);
            }

            if (total_pre == 0) {

                System.out.println("**************************--CUENTA NO CREADA - ESTOS DATOS NO SE GUARDARAN--**************************");
            } else {
                System.out.println("**************************--CUENTA CREADA CON EXITO - DATOS GUARDADOS--**************************");
            }

        }

    }

    public static double cuotaS(double num1 , float num2) {
        return  (num1/num2);
    }
    
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_objetos.NO_SE_USA;

/**
 *
 * @author aguil
 */
public class productos2 {

    String codigo;
    String nombre;
    float precio;

    public productos2() {
    }

    public productos2(String codigo, String nombre, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    



    public float datosProductos() {

        if (codigo.equals("cod001")) {
            return precio = (float) 1.50;
            
        } else if (codigo.equals("cod02")) {
            return precio = (float) 10.00;
        } else if (codigo.equals("cod03")) {
            return precio = (float) 2.00;
        } else if (codigo.equals("cod04")) {
            return precio = (float) 8.00;
        } else if (codigo.equals("cod05")) {
            return precio = (float) 7.00;
        } else if (codigo.equals("cod06")) {
            return precio = (float) 3.50;
        } else if (codigo.equals("cod07")) {
            return precio = (float) 5.50;
        } else if (codigo.equals("cod08")) {
            return precio = (float) 1.60;
        } else if (codigo.equals("cod09")) {
            return precio = (float) 6.70;
        } else if (codigo.equals("cod10")) {
            return precio = (float) 1.50;
        } else {
            return 0;
        }

    }

}

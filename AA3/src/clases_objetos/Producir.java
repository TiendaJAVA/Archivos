/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_objetos;

/**
 *
 * @author aguil
 */
public class Producir {

  public  String codigo;
  public   String nombre;
  public  float precio;
    int cant;

    //metodos
//    public void Producir() {
//
//        //creando objetos
//        Producir producto1 = new Producir();
//        Producir producto2 = new Producir();
//        Producir producto3 = new Producir();
//        Producir producto4 = new Producir();
//        Producir producto5 = new Producir();
//        Producir producto6 = new Producir();
//        Producir producto7 = new Producir();
//        Producir producto8 = new Producir();
//        Producir producto9 = new Producir();
//        Producir producto10 = new Producir();
//
//        //datos datos a los atributoos
//        //producto1
//        producto1.codigo = "cod01";
//        producto1.nombre = "GALLETAS";
//        producto1.precio = (float) 1.50;
//
//        //producto2
//        producto2.codigo = "cod02";
//        producto2.nombre = "GASEOSA DE 3LTS";
//        producto2.precio = (float) 10.00;
//
//        //producto3
//        producto3.codigo = "cod03";
//        producto3.nombre = "AGUA MINERAL ";
//        producto3.precio = (float) 2.00;
//
//        //producto4
//        producto4.codigo = "cod04";
//        producto4.nombre = "HELADO DE 1LT ";
//        producto4.precio = (float) 8.00;
//
//        //producto5
//        producto5.codigo = "cod05";
//        producto5.nombre = " PIQUEO SNACKS ";
//        producto5.precio = (float) 7.00;
//
//        //producto6
//        producto6.codigo = "cod06";
//        producto6.nombre = "FRUGOS NARANJA DE 1LT ";
//        producto6.precio = (float) 3.50;
//
//        //producto7
//        producto7.codigo = "cod07";
//        producto7.nombre = "SPORADE DE 1LT ";
//        producto7.precio = (float) 5.50;
//
//        //producto8
//        producto8.codigo = "cod08";
//        producto8.nombre = "CAJITA DE CHICLE  ";
//        producto8.precio = (float) 1.60;
//
//        //producto9
//        producto9.codigo = "cod09";
//        producto9.nombre = "YOGUT DE 2LT ";
//        producto9.precio = (float) 6.70;
//
//        //producto10
//        producto10.codigo = "cod010";
//        producto10.nombre = "WAFER ";
//        producto10.precio = (float) 1.50;
//
//    }

    ////////////////get and sertter 

    public Producir(String codigo, String nombre, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;

    }


  public  void tomaCodigo(String codigo) {
        this.codigo = codigo;
    }

  public  void tomaNombre(String nombre) {
        this.nombre = nombre;
    }

  public  void tomaPrecio(float precio) {
        this.precio = precio;
    }
  
    public  void tomaCantidad (int cant) {
        this.cant = cant;
    }

  
  ///////////////////////////////////////////////////////////
  
    public Producir() {
    }
    
  
///////////////////////////////////////////////////////////////////

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    

    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaexamen;

/**
 *
 * @author dlorcas921s_iesmarti
 */

public class Cuenta {
    
    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    
    public Cuenta ()
    {
    }
    
    
    public Cuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
   
    
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    
    public String obtenerNombre()
    {
        return nombre;
    }

    
     public double estado ()
    {
        return saldo;
    }
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }



    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    public String obtenerCuenta ()
    {
        return cuenta;
    }

 
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

 
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  
  public double getTipoInteres() {
  
    return tipoInteres;
  }

  
  public void setTipoInteres(double tipoInteres){
    this.tipoInteres = tipoInteres;
  }

}

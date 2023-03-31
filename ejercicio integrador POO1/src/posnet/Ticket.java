/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author 1daw
 */
public class Ticket {
     private String nombreApellido;
     private double montoTotal;
     private double montoPorCuota;
     
     public Ticket(String nombreApellido, double moltoTotal, double moltoDePagaCuota){
         this.nombreApellido = nombreApellido;
         this.montoTotal = montoTotal;
         this.montoPorCuota = montoPorCuota;
     }

    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", montoTotal=" + montoTotal + ", montoPorCuota=" + montoPorCuota + '}';
    }
     
     
     
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author 1daw
 */
class Posnet {
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;
    
    public Ticket efectuarpago (TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas){
       
        /**
         * @author Lyonel
         * 
         */
        Ticket ticket=null;
        if(datosValidos(tarjeta, montoAAbonar, cantCuotas)){
            double montoFinal = montoAAbonar + montoAAbonar*recargoSegunCuotas(cantCuotas);
            if(tarjeta.tieneSaldoDisponible (montoFinal)){
                tarjeta.descontar(montoFinal);
                String nomApe = tarjeta.nombreCompletoDelTitular();
                double montoPorCuota = montoFinal / cantCuotas;
                ticket = new Ticket (nomApe, montoFinal, montoPorCuota);
            }
        }
        return ticket;
    }
    
    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cant){
        boolean esTarjetaValida = tarjeta != null;
        boolean esMontoValido = monto > 0;
        boolean cantCuotaValida = cant >= MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;
        return esTarjetaValida && esMontoValido && cantCuotaValida ;
    }
    
    private double recargoSegunCuotas(int cantCuotas){
        return (cantCuotas - 1)* RECARGO_POR_CUOTA;
    }
    
    
    
}

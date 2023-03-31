/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author 1daw
 */
public class TarjetaDeCredito {
    private String entidadBancaria;
    private String numero;
    private double saldo;
    private EntidadFincanciera entidadFinanciera;
    private Persona titular;
    boolean tieneSaldoDisponible;

    public TarjetaDeCredito(String entidadBancaria, String numero, double saldo,Persona titular, EntidadFincanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.numero = numero;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
        
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", numero=" + numero + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
    
    public boolean tieneSaldoDisponible (double montoFinal){
        return saldo >= montoFinal;
    }

    public void descontar(double monto) {
        saldo = saldo - monto;
    }

    public String nombreCompletoDelTitular() {
        return titular.nombreCompleto();
    }
    
}

package posnet;


/**
 * 
 * @author 1daw
 */


public class TarjetaDeCredito {

    
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    
    /**
     * 
     * @param entidadBancaria
     * @param nroTarjeta
     * @param saldo
     * @param titular
     * @param entidadFinanciera 
     */
    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, int saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;
    }

    /**
     * 
     * @param monto
     * @return boolean tiene saldo disponible 
     */
    public boolean tieneSaldoDisponible(double monto) {
        return saldo >= monto;
    }

    /**
     * 
     * @param monto 
     */
    public void descontar(double monto) {
        saldo = saldo - monto;
        // saldo -= monto;
    }

    /**
     * 
     * @return String tiene titular nombre completo
     */
    public String nombreCompletoDeTitular() {
        return titular.nombreCompleto();
    }

    /**
     * 
     * @return String tiene TarjetaDeCredito que tiene entidadBancaria nroTarjeta saldo entidadFinanciera titular
     */
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }

}
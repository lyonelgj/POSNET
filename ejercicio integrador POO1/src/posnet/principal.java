package posnet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 1daw
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Posnet posnet = new Posnet();
        Persona p = new Persona("45678123", "Pepa", "Gomez", "1111111", "pepegomez@gmail.com");
        TarjetaDeCredito t = new TarjetaDeCredito("FakeBank", "12222222222", 1500, p, EntidadFincanciera.BIRZA);
        System.out.println("Tarjeta antes del pago...");
        System.out.println(t);
        
        Ticket ticketGenerado = posnet.efectuarpago(t, 10000, 5);
        System.out.println("Ticket generado...");
        System.out.println(ticketGenerado);
        
        System.out.println("Tarjeta después del pago...");
        System.out.println(t);
    }
    
    
}

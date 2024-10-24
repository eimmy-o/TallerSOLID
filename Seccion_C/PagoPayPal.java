package Seccion_C ;

public class PagoPayPal extends Pago{
    private boolean loggedIn; //conexión a cuenta PayPal

    @Override
    public void realizarCobro (double monto) {
        if (!loggedIn) {
            //logica para iniciar sesion
        } 
        //cargar el monto de compra al medio de pago
        //logica para pagar 
        System.out.println("El cobro ha sido procesado");
    }  
}

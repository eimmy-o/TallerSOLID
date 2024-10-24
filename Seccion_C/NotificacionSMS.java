package Seccion_C ;

public class NotificacionSMS extends Notificacion {
    
    @Override
    public void notificar (Pago pago){
        enviarSMS(pago) ;
    }
    
    public void enviarSMS(Pago pago){
        //logica para enviar
        System.out.println("Enviando SMS");
    }
    
}

package Seccion_C ;

public class NotificacionEmail extends Notificacion {
    
    @Override
    public void notificar (Pago pago){
        enviarEmail(pago) ;
    }
    
    public void enviarEmail(Pago pago){
        //logica para enviar
        System.out.println("Enviando Email");
    }
}

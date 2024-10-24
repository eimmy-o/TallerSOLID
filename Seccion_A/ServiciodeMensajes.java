package Seccion_A ;

public class ServiciodeMensajes {
    public void enviarMensaje(String mensaje, String canal) {
        if (canal.equals("email")) {
            enviarEmail(mensaje);
        } else if (canal.equals("sms")) {
            enviarSMS(mensaje);
        }
    }

    private void enviarEmail(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }

    private void enviarSMS(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}

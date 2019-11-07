package bot;

import com.sun.media.jfxmedia.logging.Logger;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.net.MalformedURLException;
import java.net.URL;

public class MainBot extends TelegramLongPollingBot {
    SendMessage message;
    String respuesta;
    URL url;

    {
        try {
            url = new URL("https://urgente.bo/sites/default/files/Ruta%20San%20Pedro-%20Achumani%201.jpg");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void onUpdateReceived(Update update) {
//        System.out.println(update.getMessage().getText()); // texto de prueba
//       System.out.println(update.getMessage().getFrom().getId()); // id para mantener la conversacion



        final String command = update.getMessage().getText(); // mesaje del usuario
        final long chatId = update.getMessage().getChatId(); // id del usuario
        final String chatName = update.getMessage().getFrom().getFirstName(); // name del usuario

        respuesta = Responder(command ,chatName);
        message = new SendMessage().setChatId(chatId).setText(respuesta);
        respuesta = Responder(command ,chatName);
        message.setText(respuesta);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public String getBotUsername() {
        return "LaPazRutasBot";
    }

    public String getBotToken() {
        return "878308952:AAELkgmF0NkxPV7t7KvpQ3-JOWWVChLeMbg";
    }




    private String Responder(String command, String chatName) {

        String resp= "Hola "+chatName +" en que puedo ayudarte? \n" +
                "/ruta Buscar la ruta de una linea especifica \n" +
                "/mdest Buscar minibuses a mi destino \n";
        if(command.equals("/ruta")){

            resp = "Buscar la ruta de una linea especifica \n" +
                    "/T Mi teleferico \n" +
                    "/P PumaKatari \n" +
                    "/M Minibuses \n" +
                    "/B Buses \n";
            if(command.equals("/P")){
                resp = "Buscar la ruta de una linea especifica \nPumakatari \n" +
                        "/1p Inca Llojeta \n" +
                        "/2p Villa Salome \n" +
                        "/3p Chasquipampa \n" +
                        "/4p Caja Ferroviaria \n"+
                        "/5p Integradora \n" +
                        "/6p Irpavi 2 \n" +
                        "/7p Achumani \n";

            }
        }else{
            if(command.equals("/mdest")){
                resp = "Envia tu Ubacion actual : \n" +
                        "1 Aceptar \n" +
                        "2 Denegar \n";

            }
        }
        if(command.equals("/1A")){
            resp = "Buscar la ruta de una linea especifica \n" +
                    "/T Mi teleferico \n" +
                    "/P PumaKatari \n" +
                    "/M Minibuses \n" +
                    "/B Buses \n";

        }
        if(command.equals("/P")){
            resp = "Buscar la ruta de una linea especifica \nPumakatari \n" +
                    "/1p Inca Llojeta \n" +
                    "/2p Villa Salome \n" +
                    "/3p Chasquipampa \n" +
                    "/4p Caja Ferroviaria \n"+
                    "/5p Integradora \n" +
                    "/6p Irpavi 2 \n" +
                    "/7p Achumani \n";

        }

        if(command.equals("/7p")){
            resp = url+"\n"+
                    " Esta es la ruta de Achumani-San Pedro (La imagen esta abajo)\n"+
                    " Ahora en que puedo ayudarte \n" +
                    "/1A Buscar la ruta de una linea especifica \n" +
                    "/2A Buscar minibuses a mi destino \n"+
                    "/Nada ";

        }

        if (command.equals("2")){

            resp = "Envia tu Ubacion actual : \n" +
                    "1 Aceptar \n" +
                    "2 Denegar \n";

        }
        if (command.equals("/1b")){

            resp = "Lo sentimos aun no tenemos la opcion disponible";

        }

        if(command.equals("/2b")){
            resp = " Fue un gusto ayudarte.";
        }

        return resp;
    }

}

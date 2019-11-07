package bot;

import bl.MovilidadBl;
import domain.MovilidadEntity;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class BotBDD extends TelegramLongPollingBot {

    String command, respuesta;
    long chatId;
    SendMessage message;

    MovilidadBl movilidadBl;

    public BotBDD(MovilidadBl movilidadBl) {
        this.movilidadBl = movilidadBl;
    }

    @Override
    public void onUpdateReceived(Update update) {
        command= update.getMessage().getText(); // mesaje del usuario
        chatId = update.getMessage().getChatId(); // id del usuario
        respuesta = Responder();

        message = new SendMessage().setChatId(chatId).setText(respuesta);
        //respuesta = Responder();


        {
            MovilidadEntity movilidadEntity = movilidadBl.findMovilidadById(1);
            // customerBl.
            SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
                    .setChatId(update.getMessage().getChatId())
                    .setText("Persona desde BBDD: " + movilidadEntity);

        }
        message.setText(respuesta);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    private String Responder() {
        String dato="2222";
        return dato;
    }

    public String getBotUsername() {
        return "LaPazRutasBot";
    }

    public String getBotToken() {
        return "878308952:AAELkgmF0NkxPV7t7KvpQ3-JOWWVChLeMbg";
    }


}

package General;

import bl.MovilidadBl;
import bot.BotBDD;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MainClass {
    /*
    public static void main(String[] args) {
          SpringApplication.run(MainClass.class, args);
    }
    */
    static MovilidadBl movilidadBl;
    public static void main(String[] args) {

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new BotBDD(movilidadBl));
        } catch (TelegramApiException e) {
            e.printStackTrace();

        }
    }
}
/*
    static CustomerBl customerBl;
    public static void main(String[] args) {

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new BotBDD(customerBl));
        } catch (TelegramApiException e) {
            e.printStackTrace();

        }
    }
}
*/


package bot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import javax.annotation.PostConstruct;

@Component
public class BotInitializator {
    public BotInitializator() {
    }
    @PostConstruct
    public void init(){

        System.out.println("INICIALIZAR EL BOT");
        System.out.println("INICIALIZAR EL BOT");
        System.out.println("INICIALIZAR EL BOT");
        System.out.println("INICIALIZAR EL BOT");
        System.out.println("INICIALIZAR EL BOT");
        System.out.println("INICIALIZAR EL BOT");
        System.out.println("INICIALIZAR EL BOT");
        System.out.println("INICIALIZAR EL BOT");
        System.out.println("INICIALIZAR EL BOT");
        System.out.println("INICIALIZAR EL BOT");
        System.out.println("INICIALIZAR EL BOT");
        System.out.println("INICIALIZAR EL BOT");
        System.out.println("INICIALIZAR EL BOT");

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new MainBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


    }

}

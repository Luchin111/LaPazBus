package General;

import bot.BotInitializator;
import bot.MainBot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

@SpringBootApplication
public class MainClass {

    public static void main(String[] args) {
        BotInitializator botInitializator = new BotInitializator();
        botInitializator.init();
        /*
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new MainBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }*/
    }
}
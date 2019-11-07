package bot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import javax.annotation.PostConstruct;

@Component
public class BotInitializator {

    private static final Logger LOGGER = LoggerFactory.getLogger(BotInitializator.class);

    public BotInitializator() {
    }

    @PostConstruct
    public void init(){
        LOGGER.info("Emprezo");
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new MainBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


    }

}

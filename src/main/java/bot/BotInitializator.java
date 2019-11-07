package bot;

import bl.CustomerBl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import javax.annotation.PostConstruct;

@Component
public class BotInitializator {
    CustomerBl customerBl;

    @Autowired
    public BotInitializator(CustomerBl customerBl) {
        this.customerBl = customerBl;
    }

    public BotInitializator() {
    }
    @PostConstruct
    public void init(){


        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new BotBDD(customerBl));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


    }

}

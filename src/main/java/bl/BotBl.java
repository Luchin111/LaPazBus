package bl;
/*
import bo.edu.ucb.sis.carpool.chatbot.dao.CpPersonRepository;
import bo.edu.ucb.sis.carpool.chatbot.dao.CpUserRepository;
import bo.edu.ucb.sis.carpool.chatbot.domain.CpPerson;
import bo.edu.ucb.sis.carpool.chatbot.domain.CpUser;
import bo.edu.ucb.sis.carpool.chatbot.dto.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
*/
public class BotBl {

/*
    private static final Logger LOGGER = LoggerFactory.getLogger(BotBl.class);

    private CpUserRepository cpUserRepository;
    private CpPersonRepository cpPersonRepository;

    @Autowired
    public BotBl(CpUserRepository cpUserRepository, CpPersonRepository cpPersonRepository) {
        this.cpUserRepository = cpUserRepository;
        this.cpPersonRepository = cpPersonRepository;
    }

    public List<String> processUpdate(Update update) {
        LOGGER.info("Recibiendo update {} ", update);
        List<String> result = new ArrayList<>();
        // Si es la primera vez pedir una imagen para su perfil
        if (initUser(update.getMessage().getFrom())) {
            LOGGER.info("Primer inicio de sesion para: {} ",update.getMessage().getFrom() );
            result.add("Por favor ingrese una imagen para su foto de perfil");
        } else { // Mostrar el menu de opciones
            LOGGER.info("Dando bienvenida a: {} ",update.getMessage().getFrom() );
            result.add("Bienvenido al Bot");
        }

        //continueChatWihtUser(CpUser, CpChat)


        return result;
    }


    private void coninueChatWithUSer(CpUser cpUser) {
        // Ver donde se quedo el Usuario
        // continuear co conversacion
    }
    /**
     * Si es la primera vez que el usuario conversa con el bot, se guarda su información en BBDD.
     * A futuro ademas de guardar la información captura el ultimo estado de la conversación.
     * @param user
     * @return first time login
     */
  /*
    private boolean initUser(User user) {
        boolean result = false;
        CpUser cpUser = cpUserRepository.findByBotUserId(user.getId().toString());
        if (cpUser == null) {
            CpPerson cpPerson = new CpPerson();
            cpPerson.setFirstName(user.getFirstName());
            cpPerson.setFirstSurname(user.getLastName());
            cpPerson.setStatus(Status.ACTIVE.getStatus());
            cpPerson.setTxHost("localhost");
            cpPerson.setTxUser("admin");
            cpPerson.setTxDate(new Date());
            cpPersonRepository.save(cpPerson);
            cpUser = new CpUser();
            cpUser.setBotUserId(user.getId().toString());
            cpUser.setPersonId(cpPerson);
            cpUser.setTxHost("localhost");
            cpUser.setTxUser("admin");
            cpUser.setTxDate(new Date());
            cpUserRepository.save(cpUser);
            result = true;
        }
        return result;
    }
*/
}

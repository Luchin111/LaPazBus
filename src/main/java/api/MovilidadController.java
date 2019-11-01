package api;


import Repositorys.MovilidadRepository;
import modelos.MovilidadModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovilidadController {
    MovilidadRepository movilidadRepository;
    @Autowired

    public MovilidadController(MovilidadRepository movilidadRepository) {
        this.movilidadRepository = movilidadRepository;
    }



    @GetMapping("/movilidad")
    List<MovilidadModel> all(){
        return movilidadRepository.findAll();
    }

}


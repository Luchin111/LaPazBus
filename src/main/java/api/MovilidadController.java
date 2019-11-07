package api;


import bl.MovilidadBl;
import dto.MovilidadModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/v1/movilidad")
public class MovilidadController {
    private MovilidadBl movilidadBl;

    @Autowired
    public MovilidadController(MovilidadBl movilidadBl) {
        this.movilidadBl = movilidadBl;
    }



    @GetMapping("/movilidad")
    List<MovilidadModel> all(){
        return movilidadBl.findAll();
    }

}
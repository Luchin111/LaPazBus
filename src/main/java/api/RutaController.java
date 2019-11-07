package api;


import bl.RutaBl;
import dto.RutaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/v1/rutad")
public class RutaController {
    private RutaBl rutaBl;

    @Autowired
    public RutaController(RutaBl rutaBl) {
        this.rutaBl = rutaBl;
    }



    @GetMapping("/ruta")
    List<RutaModel> all(){
        return rutaBl.findAll();
    }

}
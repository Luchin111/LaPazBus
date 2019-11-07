package api;


import Repositorys.MovilidadRepository;
import bl.CustomerBl;
import dto.MovilidadModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/v1/movilidad")
public class MovilidadController {
    private CustomerBl customerBl;

    @Autowired
    public MovilidadController(CustomerBl customerBl) {
        this.customerBl = customerBl;
    }



    @GetMapping("/movilidad")
    List<MovilidadModel> all(){
        return customerBl.findAll();
    }

}
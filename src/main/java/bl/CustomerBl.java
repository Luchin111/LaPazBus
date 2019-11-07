package bl;

import Repositories.MovilidadRepository;
import domain.MovilidadEntity;
import dto.MovilidadModel;
import dto.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerBl {
    MovilidadRepository movilidadRepository;

    @Autowired
    public CustomerBl(MovilidadRepository movilidadRepository) {
        this.movilidadRepository = movilidadRepository;
    }

    public MovilidadEntity findMovilidadById(Integer pk) {
        Optional<MovilidadEntity> optional = this.movilidadRepository.findById(pk);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            // Otra alternativa podría ser: crear una nueva persona con valores por defecto y retornar este nuevo objeto
            throw new RuntimeException("Record cannot found for CpPerson with ID: " + pk);
        }
    }

    public List<MovilidadModel> findAll() {
        List<MovilidadModel> movilidadModelList = new ArrayList<>();
        for (MovilidadEntity movilidadEntity: movilidadRepository.findAllByStatus(Status.ACTIVE.getStatus())) {
            movilidadModelList.add(new MovilidadModel(movilidadEntity));
        }
        return movilidadModelList;
    }
}

package bl;

import Repositories.RutaRepository;
import domain.RutaEntity;
import dto.RutaModel;
import dto.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RutaBl {
    RutaRepository rutaRepository;

    @Autowired
    public RutaBl(RutaRepository rutaRepository) {
        this.rutaRepository = rutaRepository;
    }

    public RutaEntity findRutaById(Integer pk) {
        Optional<RutaEntity> optional = this.rutaRepository.findById(pk);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException("Record cannot found for CpPerson with ID: " + pk);
        }
    }

    public List<RutaModel> findAll() {
        List<RutaModel> rutaModelList = new ArrayList<>();
        for (RutaEntity rutaEntity:rutaRepository.findAllByStatus(Status.ACTIVE.getStatus())) {
            rutaModelList.add(new RutaModel(rutaEntity));
        }
        return rutaModelList;
    }
}

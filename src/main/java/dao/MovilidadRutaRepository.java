package dao;
//import domain.MovilidadRutaEntity_ ;
import domain.MovilidadRutaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovilidadRutaRepository extends JpaRepository<MovilidadRutaEntity, Integer>{
    List<MovilidadRutaEntity> findAllByStatus(int status);
}

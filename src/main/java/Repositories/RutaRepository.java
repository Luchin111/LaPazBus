package Repositories;


import domain.RutaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RutaRepository extends JpaRepository<RutaEntity, Integer> {

    List<RutaEntity> findAllByStatus(int status);
}

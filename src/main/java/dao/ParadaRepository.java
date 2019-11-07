package dao;

import domain.ParadaEntity ;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParadaRepository extends JpaRepository<ParadaEntity, Integer> {

    List<ParadaEntity> findAllByStatus(int status);
}

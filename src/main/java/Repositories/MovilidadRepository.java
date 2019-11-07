package Repositories;

import domain.MovilidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovilidadRepository extends JpaRepository<MovilidadEntity, Integer> {

    List<MovilidadEntity> findAllByStatus(int status);
}

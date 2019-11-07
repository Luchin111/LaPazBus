package Repositorys;

import domain.MovilidadEntity;
import dto.MovilidadModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovilidadRepository extends JpaRepository<MovilidadModel, Integer> {

    List<MovilidadEntity> findAllByStatus(int status);
}

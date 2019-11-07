package dao;

import domain.MovilidadEntity ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovilidadRepository extends JpaRepository<MovilidadEntity, Integer> {

    MovilidadEntity findByStatus(int status);
}

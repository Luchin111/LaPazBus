package dao;

import domain.TipoMovilidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoMovilidad extends JpaRepository<TipoMovilidadEntity,Integer> {
    TipoMovilidadEntity findAllByStatus(int status);
}

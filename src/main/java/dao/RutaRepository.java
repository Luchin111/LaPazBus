package dao;
import domain.RutaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RutaRepository extends JpaRepository<RutaEntity,Integer>{
    RutaEntity findAllByStatus(int status);
}

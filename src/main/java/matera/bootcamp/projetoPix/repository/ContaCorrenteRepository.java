package matera.bootcamp.projetoPix.repository;

import matera.bootcamp.projetoPix.domain.model.ContaCorrente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContaCorrenteRepository extends JpaRepository<ContaCorrente, Long> {


    Optional<ContaCorrente> findByUsuarioId(Long id);
}

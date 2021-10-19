package matera.bootcamp.projetoPix.domain.repository;

import matera.bootcamp.projetoPix.domain.model.ContaCorrente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContaCorrenteRepository extends JpaRepository<ContaCorrente, Long> {


    Optional<ContaCorrente> findByUsuarioId(Long id);


    Optional<ContaCorrente> findByAgenciaAndConta
            (Long agencia, Long conta);
}

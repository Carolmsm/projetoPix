package matera.bootcamp.projetoPix.domain.repository;

import matera.bootcamp.projetoPix.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}

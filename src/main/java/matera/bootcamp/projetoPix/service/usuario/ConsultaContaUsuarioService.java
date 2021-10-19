package matera.bootcamp.projetoPix.service.usuario;

import lombok.RequiredArgsConstructor;
import matera.bootcamp.projetoPix.domain.model.ContaCorrente;
import matera.bootcamp.projetoPix.domain.repository.ContaCorrenteRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsultaContaUsuarioService {

    private final ContaCorrenteRepository contaCorrenteRepository;

    public ContaCorrente consultarContaPorUsuarioId(Long id) {
        return contaCorrenteRepository.findByUsuarioId(id)
                .orElse(null);
    }
}

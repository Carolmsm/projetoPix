package matera.bootcamp.projetoPix.service.usuario;


import lombok.RequiredArgsConstructor;
import matera.bootcamp.projetoPix.domain.model.Chave;
import matera.bootcamp.projetoPix.repository.ChaveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsultaChaveUsuarioService {

    private final ChaveRepository chaveRepository;

    public List<Chave> consultarPorIdDeUsuario(Long id) {
        return chaveRepository.findAllByUsuarioId(id);
    }

}

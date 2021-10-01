package matera.bootcamp.projetoPix.service.chave;

import lombok.RequiredArgsConstructor;
import matera.bootcamp.projetoPix.domain.model.Chave;
import matera.bootcamp.projetoPix.repository.ChaveRepository;
import matera.bootcamp.projetoPix.repository.ContaCorrenteRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChaveCrudService {

    private final ChaveRepository chaveRepository;
    private final ContaCorrenteRepository contaCorrenteRepository;

    public Chave salvar(Chave chave) {

        if(chave.getContaCorrente().getId() == null)
            throw  new RuntimeException(("Chave precisa de uma conta corrente"));

        var contaCorrente = contaCorrenteRepository
        .findById((chave.getContaCorrente().getId()))
                .orElseThrow(() -> new RuntimeException("Conta corrente não encontrada"));

                chave.setContaCorrente(contaCorrente);

                 return chaveRepository.save(chave);

    }
}

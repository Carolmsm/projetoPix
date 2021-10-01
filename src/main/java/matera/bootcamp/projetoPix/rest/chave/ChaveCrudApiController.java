package matera.bootcamp.projetoPix.rest.chave;


import lombok.RequiredArgsConstructor;
import matera.bootcamp.projetoPix.domain.model.Chave;
import matera.bootcamp.projetoPix.service.chave.ChaveCrudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ChaveCrudApiController {

    private final ChaveCrudService chaveCrudService;

    @PostMapping("/api/v1/chave")
    public ResponseEntity<Chave> salvar(@RequestBody Chave chave) {

        if (chave.getId() != null)
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .build();

        var chaveCadastrada = chaveCrudService
                .salvar(chave);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(chaveCadastrada);

    }


    @PutMapping("/api/v1/chave")
    public ResponseEntity<Chave> atualizarChave(@RequestBody Chave chave) {

        if (chave.getId() == null)
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .build();

        var chaveCadastrada = chaveCrudService
                .salvar(chave);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(chaveCadastrada);
    }
}
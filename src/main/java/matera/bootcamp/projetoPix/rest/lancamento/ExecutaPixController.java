package matera.bootcamp.projetoPix.rest.lancamento;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExecutaPixController {

    @PostMapping("/api/v1/pix")
    public ResponseEntity<?> executaPix() {
        return null;
    }
}

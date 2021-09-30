package matera.bootcamp.projetoPix.rest.status;

import matera.bootcamp.projetoPix.domain.model.ContaCorrente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusApiController {



    @GetMapping("/api/v1/status")
    public String statusCheck() {
        return "up";
    }
}

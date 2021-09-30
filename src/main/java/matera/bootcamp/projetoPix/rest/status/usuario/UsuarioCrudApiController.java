package matera.bootcamp.projetoPix.rest.status.usuario;

import lombok.RequiredArgsConstructor;
import matera.bootcamp.projetoPix.domain.model.Usuario;
import matera.bootcamp.projetoPix.service.usuario.UsuarioCrudService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequiredArgsConstructor
public class UsuarioCrudApiController {

  private final UsuarioCrudService usuarioCrudService;


    @PostMapping("/api/v1/usuario")
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario,
                                          HttpServletRequest httpServletRequest,
                                          HttpServletResponse httpServletResponse) {

        var ehUmNovoUsuario = usuario.getId() == null;
        var usuarioSalvo  = usuarioCrudService.salvar(usuario);

            return ResponseEntity
                    .status(ehUmNovoUsuario? HttpStatus.CREATED: HttpStatus.OK)
                            .body(usuarioSalvo);

    }
    @GetMapping("/api/v1/usuario")
    public ResponseEntity<Page<Usuario>> buscarPaginado(Pageable pageable){

      //  var paginaUsuarios : Page<Usuario> = usuarioCrudService
      //          .buscarPaginado(pageable);

        var paginaUsuarios = usuarioCrudService.buscarPaginado(pageable);

        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(paginaUsuarios);

    }



}

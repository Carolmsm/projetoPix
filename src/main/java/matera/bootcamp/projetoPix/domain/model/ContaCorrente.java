package matera.bootcamp.projetoPix.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class ContaCorrente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   //
    private Long id;

    @Column(nullable = false)
    private Long agencia;

    @Column(nullable = false)
    private Long conta;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal saldo = new BigDecimal("0.00");

   // @OneToMany
   // private List<Chave> chaves;

    @OneToOne(mappedBy = "contaCorrente")
    @JsonIgnore
    private Usuario usuario;
}

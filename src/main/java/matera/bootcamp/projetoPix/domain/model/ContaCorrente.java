package matera.bootcamp.projetoPix.domain.model;

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

    @Column(precision = 2, scale = 2, nullable = false)
    private BigDecimal saldo = new BigDecimal("0.00");

    @OneToOne(mappedBy = "")
    private Usuario usuario;

    @OneToMany
    private List<Chave> chaves;

}

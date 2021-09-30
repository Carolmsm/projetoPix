package matera.bootcamp.projetoPix.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String sobrenome;


    @OneToOne(optional = false, cascade = {CascadeType.ALL})
    private  ContaCorrente contaCorrente;

}

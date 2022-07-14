package com.vendasmichele.crudvendasspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import lombok.Data;
@Data
@Entity
@Table(name = "Cliente")

public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "DataNascimento")
    private LocalDate dataNascimento;
    @Column(name = "Cpf")
    private String cpf;
    @Column(name = "Rg")
    private String rg;
    @Column(name = "Telefone")
    private String telefone;
    @Column(name = "Cidade")
    private String cidade;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Endereco")
    private String endereco;





    
}
